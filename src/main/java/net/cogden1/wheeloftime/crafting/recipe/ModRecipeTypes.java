package net.cogden1.wheeloftime.crafting.recipe;

import net.cogden1.wheeloftime.WheelOfTime;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModRecipeTypes {
    public static final DeferredRegister<IRecipeSerializer<?>> RECIPE_SERIALIZER =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, WheelOfTime.MOD_ID);

    public static final RegistryObject<PickingTableRecipe.Serializer> PICKING_SERIALIZER
            = RECIPE_SERIALIZER.register("picking", PickingTableRecipe.Serializer::new);

    public static IRecipeType<PickingTableRecipe> PICKING_RECIPE
            = new PickingTableRecipe.PickingRecipeType();


    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZER.register(eventBus);

        Registry.register(Registry.RECIPE_TYPE, PickingTableRecipe.TYPE_ID, PICKING_RECIPE);
    }
}
