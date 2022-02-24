package net.cogden1.wheeloftime.item;

import net.cogden1.wheeloftime.WheelOfTime;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WheelOfTime.MOD_ID);

    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> TIN = ITEMS.register("tin",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
