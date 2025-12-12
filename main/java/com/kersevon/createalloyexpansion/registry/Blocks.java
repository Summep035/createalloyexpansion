package com.kersevon.createalloyexpansion.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Blocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, "createalloyexpansion");

    public static final RegistryObject<Block> ROSE_GOLD_BLOCK = BLOCKS.register(
            "rose_gold_block",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .strength(5.0f, 6.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.METAL)
            )
    );
    public static final RegistryObject<Block> COMPRESSED_COAL_BLOCK = BLOCKS.register(
            "compressed_coal_block",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .strength(5.0f, 6.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)
            )
    );
    public static final RegistryObject<Block> REFINED_COAL_LUMP_BLOCK = BLOCKS.register(
            "refined_coal_lump_block",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .strength(5.0f, 6.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)
            )
    );
    public static final RegistryObject<Block> GRAPHITE_BLOCK = BLOCKS.register(
            "graphite_block",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .strength(5.0f, 6.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)
            )
    );
    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register(
            "steel_block",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .strength(6.0f, 8.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.METAL)
            )
    );
    public static final RegistryObject<Block> HIGH_CARBON_STEEL_BLOCK = BLOCKS.register(
            "high_carbon_steel_block",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .strength(7.0f, 9.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.METAL)
            )
    );
    public static final RegistryObject<Block> REINFORCED_STEEL_BLOCK = BLOCKS.register(
            "reinforced_steel_block",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .strength(10.0f, 15.0f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.METAL)
            )
    );

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}