package com.kersevon.createalloyexpansion.registry;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class Tiers {

    public static final Tier ROSE_GOLD = new Tier() {
        @Override
        public int getUses() {
            return 825;
        }

        @Override
        public float getSpeed() {
            return 7f;
        }

        @Override
        public float getAttackDamageBonus() {
            return 2f;
        }

        @Override
        public int getLevel() {
            return 2;
        }

        @Override
        public int getEnchantmentValue() {
            return 1;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(Items.ROSE_GOLD_INGOT.get());
        }
    };
    public static final Tier STEEL = new Tier() {
        @Override
        public int getUses() {
            return 1215;
        }

        @Override
        public float getSpeed() {
            return 7.5f;
        }

        @Override
        public float getAttackDamageBonus() {
            return 2.5f;
        }

        @Override
        public int getLevel() {
            return 2;
        }

        @Override
        public int getEnchantmentValue() {
            return 15;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(Items.ROSE_GOLD_INGOT.get());
        }
    };
}