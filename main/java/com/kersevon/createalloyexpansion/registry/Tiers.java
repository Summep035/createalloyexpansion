package com.kersevon.createalloyexpansion.registry;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class Tiers {

    public static final Tier ROSE_GOLD = new Tier() {
        @Override
        public int getUses() {
            return 315;
        }

        @Override
        public float getSpeed() {
            return 7f;
        }

        @Override
        public float getAttackDamageBonus() {
            return 2.0f;
        }

        @Override
        public int getLevel() {
            return 2;
        }

        @Override
        public int getEnchantmentValue() {
            return 14;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(Items.ROSE_GOLD_INGOT.get());
        }
    };
}