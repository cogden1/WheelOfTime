package net.cogden1.wheeloftime.item;

import net.cogden1.wheeloftime.block.ModBlocks;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {
    TOPAZ(4, 1030, 7.0F, 3.0F, 15,
            () -> Ingredient.of(ModItems.PRISTINE_TOPAZ.get())),

    AMETHYST(5, 1221, 8.0F, 3.0F, 16,
            () -> Ingredient.of(ModItems.PRISTINE_AMETHYST.get())),

    SAPPHIRE(6, 2037, 9.0F, 4.0F, 17,
            () -> Ingredient.of(ModItems.PRISTINE_SAPPHIRE.get())),

    TURQUOISE(7, 2605, 9.0F, 5.0F, 18,
            () -> Ingredient.of(ModItems.PRISTINE_TURQUOISE.get())),

    RUBY(8, 3594, 10.0F, 6.0F, 19,
            () -> Ingredient.of(ModItems.PRISTINE_RUBY.get())),

    PLATINUM(9, 5059, 11.0F, 7.0F, 20,
            () -> Ingredient.of(ModBlocks.PLATINUM_BLOCK.get()));

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyValue<Ingredient> repairIngredient;

    ModItemTier(int level, int uses, float speed, float damage,
                int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }

    @Override
    public int getUses() {
        return uses;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return damage;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }
}
