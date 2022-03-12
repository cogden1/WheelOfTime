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

    //resources
    public static final RegistryObject<Item> MERCURY = ITEMS.register("mercury",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> ICEBURST_STONE = ITEMS.register("iceburst_stone",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> ORGANIC_POLYMER = ITEMS.register("organic_polymer",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> CRYSTAL_PAIN = ITEMS.register("crystal_pain",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    //Gems
    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> TURQUOISE = ITEMS.register("turquoise",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> PRISTINE_AMETHYST = ITEMS.register("pristine_amethyst",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> PRISTINE_SAPPHIRE = ITEMS.register("pristine_sapphire",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> PRISTINE_TOPAZ = ITEMS.register("pristine_topaz",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> PRISTINE_RUBY = ITEMS.register("pristine_ruby",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> PRISTINE_TURQUOISE = ITEMS.register("pristine_turquoise",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> PRISTINE_DIAMOND = ITEMS.register("pristine_diamond",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));



    //Metals
    public static final RegistryObject<Item> TESLANIUM = ITEMS.register("teslanium",
                () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> TIN = ITEMS.register("tin",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> TURTANIUM_INGOT = ITEMS.register("turtanium_ingot",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));


    //dusts
    public static final RegistryObject<Item> ALUMINUM_DUST = ITEMS.register("aluminum_dust",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> COAL_DUST = ITEMS.register("coal_dust",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> GOLD_DUST = ITEMS.register("gold_dust",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> GLOWSTONIUM = ITEMS.register("glowstonium",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> LEAD_DUST = ITEMS.register("lead_dust",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> NICKEL_DUST = ITEMS.register("nickel_dust",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> PLATINUM_DUST = ITEMS.register("platinum_dust",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> SALT = ITEMS.register("salt",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> SILVER_DUST = ITEMS.register("silver_dust",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> STEEL_DUST = ITEMS.register("steel_dust",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> SULFUR = ITEMS.register("sulfur",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> TIN_DUST = ITEMS.register("tin_dust",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));


    //Components
    public static final RegistryObject<Item> STORAGE = ITEMS.register("storage",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> BATTERY = ITEMS.register("battery",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> MOTOR = ITEMS.register("motor",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));


    //Callers
    public static final RegistryObject<Item> LIGHTNING_CALLER = ITEMS.register("lightning_caller",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> HERO_CALLER = ITEMS.register("hero_caller",
            () -> new HeroCaller(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> INVISIBILITY_CALLER = ITEMS.register("invisibility_caller",
            () -> new InvisibilityCaller(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> VISION_CALLER = ITEMS.register("vision_caller",
            () -> new VisionCaller(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> LEVITATION_CALLER = ITEMS.register("levitation_caller",
            () -> new LevitationCaller(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    //
    public static final RegistryObject<Item> STRENGTH_CALLER = ITEMS.register("strength_caller",
            () -> new StrengthCaller(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> STRENGTH_CALLER_1 = ITEMS.register("strength_caller_1",
            () -> new StrengthCaller1(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> STRENGTH_CALLER_2 = ITEMS.register("strength_caller_2",
            () -> new StrengthCaller2(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> STRENGTH_CALLER_X = ITEMS.register("strength_caller_x",
            () -> new StrengthCallerX(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    //
    public static final RegistryObject<Item> ABSORPTION_CALLER = ITEMS.register("absorption_caller",
            () -> new AbsorptionCaller(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> ABSORPTION_CALLER_1 = ITEMS.register("absorption_caller_1",
            () -> new AbsorptionCaller1(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> ABSORPTION_CALLER_2 = ITEMS.register("absorption_caller_2",
            () -> new AbsorptionCaller2(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> ABSORPTION_CALLER_X = ITEMS.register("absorption_caller_x",
            () -> new AbsorptionCallerX(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    //
    public static final RegistryObject<Item> SPEED_CALLER = ITEMS.register("speed_caller",
            () -> new SpeedCaller(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> SPEED_CALLER_1 = ITEMS.register("speed_caller_1",
            () -> new SpeedCaller1(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> SPEED_CALLER_2 = ITEMS.register("speed_caller_2",
            () -> new SpeedCaller2(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> SPEED_CALLER_X = ITEMS.register("speed_caller_x",
            () -> new SpeedCallerX(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    //
    public static final RegistryObject<Item> JUMP_CALLER = ITEMS.register("jump_caller",
            () -> new JumpCaller(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> JUMP_CALLER_1 = ITEMS.register("jump_caller_1",
            () -> new JumpCaller1(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> JUMP_CALLER_2 = ITEMS.register("jump_caller_2",
            () -> new JumpCaller2(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> JUMP_CALLER_X = ITEMS.register("jump_caller_x",
            () -> new JumpCallerX(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    //
    public static final RegistryObject<Item> FIRE_CALLER = ITEMS.register("fire_caller",
            () -> new FireCaller(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> FIRE_CALLER_1 = ITEMS.register("fire_caller_1",
            () -> new FireCaller1(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> FIRE_CALLER_2 = ITEMS.register("fire_caller_2",
            () -> new FireCaller2(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> FIRE_CALLER_X = ITEMS.register("fire_caller_x",
            () -> new FireCallerX(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    //
    public static final RegistryObject<Item> HASTE_CALLER = ITEMS.register("haste_caller",
            () -> new HasteCaller(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> HASTE_CALLER_1 = ITEMS.register("haste_caller_1",
            () -> new HasteCaller1(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> HASTE_CALLER_2 = ITEMS.register("haste_caller_2",
            () -> new HasteCaller2(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> HASTE_CALLER_X = ITEMS.register("haste_caller_x",
            () -> new HasteCallerX(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    //Music Discs
    public static final RegistryObject<Item> RUMBLING_MUSIC_DISC = ITEMS.register("rumbling_music_disc",
            () -> new MusicDiscItem(1, () -> ModSoundEvents.RUMBLING.get(),
                    new Item.Properties().stacksTo(1).tab(ModItemGroup.WHEELOFTIME_GROUP)));



    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
