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
            () -> new ArmorItem(RoseGoldArmor.ROSE_GOLD, ArmorItem.Type.HELMET,
                    new Item.Properties().stacksTo(1))
    );
    public static final RegistryObject<Item> ROSE_GOLD_CHESTPLATE = ITEMS.register("rose_gold_chestplate",
            () -> new ArmorItem(RoseGoldArmor.ROSE_GOLD, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().stacksTo(1))
    );
    public static final RegistryObject<Item> ROSE_GOLD_LEGGINGS = ITEMS.register("rose_gold_leggings",
            () -> new ArmorItem(RoseGoldArmor.ROSE_GOLD, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().stacksTo(1))
    );
    public static final RegistryObject<Item> ROSE_GOLD_BOOTS = ITEMS.register("rose_gold_boots",
            () -> new ArmorItem(RoseGoldArmor.ROSE_GOLD, ArmorItem.Type.BOOTS,
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
    public static final RegistryObject<Item> COMPRESSED_COAL_BLOCK = ITEMS.register(
            "compressed_coal_block",
            () -> new BlockItem(Blocks.COMPRESSED_COAL_BLOCK.get(), new Item.Properties().stacksTo(64))
    );
    public static final RegistryObject<Item> REFINED_COAL_LUMP_BLOCK = ITEMS.register(
            "refined_coal_lump_block",
            () -> new BlockItem(Blocks.REFINED_COAL_LUMP_BLOCK.get(), new Item.Properties().stacksTo(64))
    );
    public static final RegistryObject<Item> REFINED_COAL_LUMP = ITEMS.register(
            "refined_coal_lump",
            () -> new Item(new Item.Properties().stacksTo(64))
    );
    public static final RegistryObject<Item> COMPRESSED_COAL = ITEMS.register(
            "compressed_coal",
            () -> new Item(new Item.Properties().stacksTo(64))
    );
    public static final RegistryObject<Item> UNREFINED_GRAPHITE_CHUNK = ITEMS.register(
            "unrefined_graphite_chunk",
            () -> new Item(new Item.Properties().stacksTo(64))
    );
    public static final RegistryObject<Item> GRAPHITE_CHUNK = ITEMS.register(
            "graphite_chunk",
            () -> new Item(new Item.Properties().stacksTo(64))
    );
    public static final RegistryObject<Item> GRAPHITE_BLOCK = ITEMS.register(
            "graphite_block",
            () -> new BlockItem(Blocks.GRAPHITE_BLOCK.get(), new Item.Properties().stacksTo(64))
    );
    public static final RegistryObject<Item> GRAPHITE_CAKE_BASE = ITEMS.register(
            "graphite_cake_base",
            () -> new Item(new Item.Properties().stacksTo(64))
    );
    public static final RegistryObject<Item> GRAPHITE_CAKE = ITEMS.register(
            "graphite_cake",
            () -> new Item(new Item.Properties().stacksTo(64))
    );
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register(
            "steel_ingot",
            () -> new Item(new Item.Properties().stacksTo(64))
    );
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register(
            "steel_nugget",
            () -> new Item(new Item.Properties().stacksTo(64))
    );
    public static final RegistryObject<Item> STEEL_PLATE = ITEMS.register(
            "steel_plate",
            () -> new Item(new Item.Properties().stacksTo(64))
    );
    public static final RegistryObject<Item> STEEL_BLOCK = ITEMS.register(
            "steel_block",
            () -> new BlockItem(Blocks.STEEL_BLOCK.get(), new Item.Properties().stacksTo(64))
    );
    public static final RegistryObject<Item> HIGH_CARBON_STEEL_INGOT = ITEMS.register(
            "high_carbon_steel_ingot",
            () -> new Item(new Item.Properties().stacksTo(64))
    );
    public static final RegistryObject<Item> HIGH_CARBON_STEEL_NUGGET = ITEMS.register(
            "high_carbon_steel_nugget",
            () -> new Item(new Item.Properties().stacksTo(64))
    );
    public static final RegistryObject<Item> HIGH_CARBON_STEEL_PLATE = ITEMS.register(
            "high_carbon_steel_plate",
            () -> new Item(new Item.Properties().stacksTo(64))
    );
    public static final RegistryObject<Item> HIGH_CARBON_STEEL_BLOCK = ITEMS.register(
            "high_carbon_steel_block",
            () -> new BlockItem(Blocks.HIGH_CARBON_STEEL_BLOCK.get(), new Item.Properties().stacksTo(64))
    );
    public static final RegistryObject<Item> REINFORCED_STEEL_INGOT = ITEMS.register(
            "reinforced_steel_ingot",
            () -> new Item(new Item.Properties().stacksTo(64))
    );
    public static final RegistryObject<Item> REINFORCED_STEEL_PLATE = ITEMS.register(
            "reinforced_steel_plate",
            () -> new Item(new Item.Properties().stacksTo(64))
    );
    public static final RegistryObject<Item> REINFORCED_STEEL_BLOCK = ITEMS.register(
            "reinforced_steel_block",
            () -> new BlockItem(Blocks.REINFORCED_STEEL_BLOCK.get(), new Item.Properties().stacksTo(64))
    );
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register(
            "steel_sword",
            () -> new SwordItem(Tiers.STEEL, 3, -2.4f, new Item.Properties().stacksTo(1))
    );
    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new ArmorItem(SteelArmor.STEEL, ArmorItem.Type.HELMET,
                    new Item.Properties().stacksTo(1))
    );
    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new ArmorItem(SteelArmor.STEEL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().stacksTo(1))
    );
    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new ArmorItem(SteelArmor.STEEL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().stacksTo(1))
    );
    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new ArmorItem(SteelArmor.STEEL, ArmorItem.Type.BOOTS,
                    new Item.Properties().stacksTo(1))
    );
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register(
            "steel_pickaxe",
            () -> new PickaxeItem(Tiers.STEEL, 2, -2.8f, new Item.Properties().stacksTo(1))
    );
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register(
            "steel_axe",
            () -> new AxeItem(Tiers.STEEL, 5, -3.2f, new Item.Properties().stacksTo(1))
    );
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}