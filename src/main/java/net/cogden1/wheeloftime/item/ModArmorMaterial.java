package net.cogden1.wheeloftime.item;

import net.cogden1.wheeloftime.WheelOfTime;
import net.cogden1.wheeloftime.block.ModBlocks;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {

    SAPPHIRE("sapphire", 23, new int[]{3, 6, 8, 3}, 17,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F,
            0.1F, () -> {return Ingredient.of(ModItems.PRISTINE_SAPPHIRE.get());}),

    RUBY("ruby", 42, new int[]{3, 6, 8, 3}, 20,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 4.0F,
            0.2F, () -> {return Ingredient.of(ModItems.PRISTINE_RUBY.get());}),

    TURTANIUM("turtanium", 34, new int[]{3, 6, 8, 3}, 19,
            SoundEvents.ARMOR_EQUIP_TURTLE, 4.0F,
            0.3F, () -> {return Ingredient.of(ModItems.TURTANIUM_INGOT.get());}),

    PLATINUM("platinum", 53, new int[]{4, 7, 9, 4}, 22,
            SoundEvents.ARMOR_EQUIP_IRON, 5.0F,
            0.5F, () -> {return Ingredient.of(ModBlocks.PLATINUM_BLOCK.get());})

    ;

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairIngredient;

    private ModArmorMaterial(String p_i231593_3_, int p_i231593_4_, int[] p_i231593_5_, int p_i231593_6_, SoundEvent p_i231593_7_, float p_i231593_8_, float p_i231593_9_, Supplier<Ingredient> p_i231593_10_) {
        this.name = p_i231593_3_;
        this.durabilityMultiplier = p_i231593_4_;
        this.slotProtections = p_i231593_5_;
        this.enchantmentValue = p_i231593_6_;
        this.sound = p_i231593_7_;
        this.toughness = p_i231593_8_;
        this.knockbackResistance = p_i231593_9_;
        this.repairIngredient = new LazyValue<>(p_i231593_10_);
    }


    public int getDurabilityForSlot(EquipmentSlotType p_200896_1_) {
        return HEALTH_PER_SLOT[p_200896_1_.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlotType p_200902_1_) {
        return this.slotProtections[p_200902_1_.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return WheelOfTime.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}