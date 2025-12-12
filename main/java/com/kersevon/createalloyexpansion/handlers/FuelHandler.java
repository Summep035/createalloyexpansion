package com.kersevon.createalloyexpansion.handlers;

import com.kersevon.createalloyexpansion.registry.Blocks;
import com.kersevon.createalloyexpansion.registry.Items;

import com.simibubi.create.content.processing.burner.BlazeBurnerBlock;
import com.simibubi.create.content.processing.burner.BlazeBurnerBlockEntity;
import com.simibubi.create.content.processing.burner.BlazeBurnerBlockEntity.FuelType;
import net.minecraft.core.BlockPos; // Aggiunto BlockPos
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level; // Aggiunto Level
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FuelHandler {

    private static final int CUSTOM_BURN_TIME = 6400;

    public static void register() {
        MinecraftForge.EVENT_BUS.register(new FuelHandler());
    }

    @SubscribeEvent
    public void onFuelBurnTime(FurnaceFuelBurnTimeEvent event) {
        ItemStack stack = event.getItemStack();
        if (stack.getItem() == Items.COMPRESSED_COAL.get()) {
            event.setBurnTime(6400);
        } else if (stack.getItem() == Blocks.COMPRESSED_COAL_BLOCK.get().asItem()) {
            event.setBurnTime(28800);
        }
    }

    @SubscribeEvent
    public void onBlockRightClick(PlayerInteractEvent.RightClickBlock event) {
        if (event.getLevel().isClientSide) return;
        if (event.getItemStack().getItem() != Items.GRAPHITE_CAKE.get()) return;
        BlockEntity be = event.getLevel().getBlockEntity(event.getPos());
        if (be instanceof BlazeBurnerBlockEntity burner) {
            setSuperheat(event.getLevel(), event.getPos(), burner, CUSTOM_BURN_TIME);

            if (!event.getEntity().isCreative()) {
                event.getItemStack().shrink(1);
            }

            event.getLevel().playSound(null, event.getPos(), SoundEvents.BLAZE_SHOOT, SoundSource.BLOCKS, 0.5f, 1.0f);

            event.setCanceled(true);
            event.setCancellationResult(InteractionResult.SUCCESS);
        }
    }
    private static void setSuperheat(Level level, BlockPos pos, BlazeBurnerBlockEntity burner, int ticks) {
        try {
            java.lang.reflect.Field fuelTypeField = BlazeBurnerBlockEntity.class.getDeclaredField("activeFuel");
            fuelTypeField.setAccessible(true);
            fuelTypeField.set(burner, FuelType.SPECIAL);

            java.lang.reflect.Field timeField = BlazeBurnerBlockEntity.class.getDeclaredField("remainingBurnTime");
            timeField.setAccessible(true);
            timeField.setInt(burner, ticks);
            if (level != null) {
                net.minecraft.world.level.block.state.BlockState oldState = level.getBlockState(pos);

                if (oldState.getBlock() instanceof BlazeBurnerBlock) {

                    net.minecraft.world.level.block.state.BlockState newState = oldState
                            .setValue(BlazeBurnerBlock.HEAT_LEVEL, BlazeBurnerBlock.HeatLevel.SEETHING);

                    level.setBlockAndUpdate(pos, newState);
                }
            }
        } catch (Exception e) {
            System.err.println("Errore nell'impostare il fuel custom per Blaze Burner: " + e.getMessage());
        }
    }
}