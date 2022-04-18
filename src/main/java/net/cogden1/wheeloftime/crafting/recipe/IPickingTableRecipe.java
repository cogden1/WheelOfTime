package net.cogden1.wheeloftime.crafting.recipe;

import net.cogden1.wheeloftime.WheelOfTime;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

public interface IPickingTableRecipe extends IRecipe<Inventory> {
    ResourceLocation TYPE_ID = new ResourceLocation(WheelOfTime.MOD_ID, "picking");

    @Override
    default IRecipeType<?> getType(){
        return Registry.RECIPE_TYPE.getOptional(TYPE_ID).get();
    }

    @Override
    default boolean canCraftInDimensions(int p_194133_1_, int p_194133_2_) {
        return true;
    }

    @Override
    default boolean isSpecial() {
        return true;
    }
}
