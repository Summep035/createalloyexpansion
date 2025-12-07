package com.kersevon.createalloyexpansion.registry;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraft.core.registries.Registries;

public class CreativeTab {

    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "createalloyexpansion");

    public static final RegistryObject<CreativeModeTab> CREATE_MORE_ALLOYS_TAB =
            TABS.register("createalloyexpansion_tab", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable("itemGroup.createalloyexpansion"))
                            .icon(() -> new ItemStack(Items.ROSE_GOLD_INGOT.get()))
                            .displayItems((enabledFlags, output) -> {
                                output.accept(Items.ROSE_GOLD_INGOT.get());
                                output.accept(Items.ROSE_GOLD_BLOCK_ITEM.get());
                                output.accept(Items.ROSE_GOLD_SWORD.get());
                                output.accept(Items.ROSE_GOLD_PICKAXE.get());
                                output.accept(Items.ROSE_GOLD_AXE.get());
                                output.accept(Items.ROSE_GOLD_HELMET.get());
                                output.accept(Items.ROSE_GOLD_CHESTPLATE.get());
                                output.accept(Items.ROSE_GOLD_LEGGINGS.get());
                                output.accept(Items.ROSE_GOLD_BOOTS.get());
                            })
                            .build()
            );

    public static void register(IEventBus modEventBus) {
        TABS.register(modEventBus);
    }
}