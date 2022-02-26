package net.cogden1.wheeloftime.item;

import net.cogden1.wheeloftime.WheelOfTime;
import net.cogden1.wheeloftime.item.custom.*;
import net.cogden1.wheeloftime.util.ModSoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.MusicDiscItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

public class ModItems {

    //items
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WheelOfTime.MOD_ID);

    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> TIN = ITEMS.register("tin",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> STORAGE = ITEMS.register("storage",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> BATTERY = ITEMS.register("battery",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> MOTOR = ITEMS.register("motor",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> TESLANIUM = ITEMS.register("teslanium",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));



    //Callers
    public static final RegistryObject<Item> LIGHTNING_CALLER = ITEMS.register("lightning_caller",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> STRENGTH_CALLER = ITEMS.register("strength_caller",
            () -> new StrengthCaller(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> STRENGTH_CALLER_1 = ITEMS.register("strength_caller_1",
            () -> new StrengthCaller1(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> STRENGTH_CALLER_2 = ITEMS.register("strength_caller_2",
            () -> new StrengthCaller2(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> STRENGTH_CALLER_X = ITEMS.register("strength_caller_x",
            () -> new StrengthCallerX(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> ABSORPTION_CALLER = ITEMS.register("absorption_caller",
            () -> new AbsorptionCaller(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> ABSORPTION_CALLER_1 = ITEMS.register("absorption_caller_1",
            () -> new AbsorptionCaller1(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> ABSORPTION_CALLER_2 = ITEMS.register("absorption_caller_2",
            () -> new AbsorptionCaller2(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> ABSORPTION_CALLER_X = ITEMS.register("absorption_caller_x",
            () -> new AbsorptionCallerX(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> SPEED_CALLER = ITEMS.register("speed_caller",
            () -> new SpeedCaller(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> SPEED_CALLER_1 = ITEMS.register("speed_caller_1",
            () -> new SpeedCaller1(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> SPEED_CALLER_2 = ITEMS.register("speed_caller_2",
            () -> new SpeedCaller2(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> SPEED_CALLER_X = ITEMS.register("speed_caller_x",
            () -> new SpeedCallerX(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));



    //Music Discs
    public static final RegistryObject<Item> RUMBLING_MUSIC_DISC = ITEMS.register("rumbling_music_disc",
            () -> new MusicDiscItem(1, () -> ModSoundEvents.RUMBLING.get(),
                    new Item.Properties().stacksTo(1).tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));



    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
