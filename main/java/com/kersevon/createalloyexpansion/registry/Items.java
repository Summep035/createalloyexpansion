package com.kersevon.createalloyexpansion.registry;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "createalloyexpansion");

    public static final RegistryObject<Item> ROSE_GOLD_INGOT = ITEMS.register(
            "rose_gold_ingot",
            () -> new Item(new Item.Properties().stacksTo(64))
    );
    public static final RegistryObject<Item> ROSE_GOLD_BLOCK_ITEM = ITEMS.register(
            "rose_gold_block",
            () -> new BlockItem(Blocks.ROSE_GOLD_BLOCK.get(), new Item.Properties().stacksTo(64))
    );
    public static final RegistryObject<Item> ROSE_GOLD_SWORD = ITEMS.register(
            "rose_gold_sword",
            () -> new SwordItem(Tiers.ROSE_GOLD, 3, -2.4f, new Item.Properties().stacksTo(1))
    );
    public static final RegistryObject<Item> ROSE_GOLD_HELMET = ITEMS.register("rose_gold_helmet",
            () -> new ArmorItem(ArmorMaterials.ROSE_GOLD, ArmorItem.Type.HELMET,
                    new Item.Properties().stacksTo(1))
    );
    public static final RegistryObject<Item> ROSE_GOLD_CHESTPLATE = ITEMS.register("rose_gold_chestplate",
            () -> new ArmorItem(ArmorMaterials.ROSE_GOLD, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().stacksTo(1))
    );
    public static final RegistryObject<Item> ROSE_GOLD_LEGGINGS = ITEMS.register("rose_gold_leggings",
            () -> new ArmorItem(ArmorMaterials.ROSE_GOLD, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().stacksTo(1))
    );
    public static final RegistryObject<Item> ROSE_GOLD_BOOTS = ITEMS.register("rose_gold_boots",
            () -> new ArmorItem(ArmorMaterials.ROSE_GOLD, ArmorItem.Type.BOOTS,
                    new Item.Properties().stacksTo(1))
    );
    public static final RegistryObject<Item> ROSE_GOLD_PICKAXE = ITEMS.register(
            "rose_gold_pickaxe",
            () -> new PickaxeItem(Tiers.ROSE_GOLD, 2, -2.8f, new Item.Properties().stacksTo(1))
    );
    public static final RegistryObject<Item> ROSE_GOLD_AXE = ITEMS.register(
            "rose_gold_axe",
            () -> new AxeItem(Tiers.ROSE_GOLD, 5, -3.2f, new Item.Properties().stacksTo(1))
    );
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}