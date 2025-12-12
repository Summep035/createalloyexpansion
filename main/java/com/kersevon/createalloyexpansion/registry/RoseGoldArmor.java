package com.kersevon.createalloyexpansion.registry;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public enum RoseGoldArmor implements ArmorMaterial {
    ROSE_GOLD("rose_gold", 24, new int[]{3,6,6,2}, 15, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, () -> Ingredient.of(Items.ROSE_GOLD_INGOT.get()));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] armorValues;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final java.util.function.Supplier<Ingredient> repairIngredient;

    RoseGoldArmor(String name, int durabilityMultiplier, int[] armorValues, int enchantability, SoundEvent equipSound, float toughness, java.util.function.Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.armorValues = armorValues;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return switch (type) {
            case HELMET -> 13 * durabilityMultiplier;
            case CHESTPLATE -> 16 * durabilityMultiplier;
            case LEGGINGS -> 15 * durabilityMultiplier;
            case BOOTS -> 11 * durabilityMultiplier;
        };
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return switch (type) {
            case HELMET -> armorValues[0];
            case CHESTPLATE -> armorValues[1];
            case LEGGINGS -> armorValues[2];
            case BOOTS -> armorValues[3];
        };
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }

    @Override
    public String getName() {
        return "createalloyexpansion:" + name;
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}