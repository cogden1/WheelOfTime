package net.cogden1.wheeloftime.item;

import net.cogden1.wheeloftime.WheelOfTime;
import net.cogden1.wheeloftime.block.ModBlocks;
import net.cogden1.wheeloftime.item.custom.*;
import net.cogden1.wheeloftime.util.ModSoundEvents;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

public class ModItems {

    //items
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WheelOfTime.MOD_ID);


    //tools
    public static final RegistryObject<Item> TOPAZ_SWORD = ITEMS.register("topaz_sword",
            () -> new SwordItem(ModItemTier.TOPAZ, 2, -2.4f,
                    new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> TOPAZ_PICKAXE = ITEMS.register("topaz_pickaxe",
            () -> new PickaxeItem(ModItemTier.TOPAZ, 0, -3f,
                    new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> TOPAZ_AXE = ITEMS.register("topaz_axe",
            () -> new AxeItem(ModItemTier.TOPAZ, 4, -3f,
                    new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> TOPAZ_SHOVEL = ITEMS.register("topaz_shovel",
            () -> new ShovelItem(ModItemTier.TOPAZ, -1, -3f,
                    new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));



    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword",
            () -> new SwordItem(ModItemTier.AMETHYST, 2, -2.4f,
                    new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe",
            () -> new PickaxeItem(ModItemTier.AMETHYST, 0, -3f,
                    new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe",
            () -> new AxeItem(ModItemTier.AMETHYST, 4, -3f,
                    new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel",
            () -> new ShovelItem(ModItemTier.AMETHYST, -1, -3f,
                    new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));



    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(ModItemTier.SAPPHIRE, 2, -2.4f,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModItemTier.SAPPHIRE, 0, -3f,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModItemTier.SAPPHIRE, 4, -3f,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModItemTier.SAPPHIRE, -1, -3f,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));



    public static final RegistryObject<Item> TURQUOISE_SWORD = ITEMS.register("turquoise_sword",
            () -> new SwordItem(ModItemTier.TURQUOISE, 2, -2.4f,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> TURQUOISE_PICKAXE = ITEMS.register("turquoise_pickaxe",
            () -> new PickaxeItem(ModItemTier.TURQUOISE, 0, -3f,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> TURQUOISE_AXE = ITEMS.register("turquoise_axe",
            () -> new AxeItem(ModItemTier.TURQUOISE, 4, -3f,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> TURQUOISE_SHOVEL = ITEMS.register("turquoise_shovel",
            () -> new ShovelItem(ModItemTier.TURQUOISE, -1, -3f,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));



    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModItemTier.RUBY, 2, -2.4f,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModItemTier.RUBY, 0, -3f,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModItemTier.RUBY, 4, -3f,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModItemTier.RUBY, -1, -3f,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));



    public static final RegistryObject<Item> PLATINUM_SWORD = ITEMS.register("platinum_sword",
            () -> new SwordItem(ModItemTier.PLATINUM, 2, -2.2f,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> PLATINUM_PICKAXE = ITEMS.register("platinum_pickaxe",
            () -> new PickaxeItem(ModItemTier.PLATINUM, 0, -3f,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> PLATINUM_AXE = ITEMS.register("platinum_axe",
            () -> new AxeItem(ModItemTier.PLATINUM, 4, -2.6f,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> PLATINUM_SHOVEL = ITEMS.register("platinum_shovel",
            () -> new ShovelItem(ModItemTier.PLATINUM, -1, -3f,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));



    //armor
    public static final RegistryObject<Item> PLATINUM_HELMET = ITEMS.register("platinum_helmet",
            () -> new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlotType.HEAD,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> PLATINUM_BOOTS = ITEMS.register("platinum_boots",
            () -> new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlotType.FEET,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> PLATINUM_PANTS = ITEMS.register("platinum_pants",
            () -> new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlotType.LEGS,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> PLATINUM_CHESTPLATE = ITEMS.register("platinum_chestplate",
            () -> new ArmorItem(ModArmorMaterial.PLATINUM, EquipmentSlotType.CHEST,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));



    public static final RegistryObject<Item> TURTANIUM_HELMET = ITEMS.register("turtanium_helmet",
            () -> new ArmorItem(ModArmorMaterial.TURTANIUM, EquipmentSlotType.HEAD,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> TURTANIUM_BOOTS = ITEMS.register("turtanium_boots",
            () -> new ArmorItem(ModArmorMaterial.TURTANIUM, EquipmentSlotType.FEET,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> TURTANIUM_PANTS = ITEMS.register("turtanium_pants",
            () -> new ArmorItem(ModArmorMaterial.TURTANIUM, EquipmentSlotType.LEGS,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> TURTANIUM_CHESTPLATE = ITEMS.register("turtanium_chestplate",
            () -> new ArmorItem(ModArmorMaterial.TURTANIUM, EquipmentSlotType.CHEST,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));



    public static final RegistryObject<Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet",
            () -> new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.HEAD,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots",
            () -> new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.FEET,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> SAPPHIRE_PANTS = ITEMS.register("sapphire_pants",
            () -> new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.LEGS,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate",
            () -> new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.CHEST,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));



    public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> RUBY_PANTS = ITEMS.register("ruby_pants",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST,
                    new Item.Properties().fireResistant().tab(ModItemGroup.WHEELOFTIME_GROUP)));




    //resources
    public static final RegistryObject<Item> MERCURY = ITEMS.register("mercury",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> ICEBURST_STONE = ITEMS.register("iceburst_stone",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> ORGANIC_POLYMER = ITEMS.register("organic_polymer",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> CRYSTAL_PAIN = ITEMS.register("crystal_pain",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));

    public static final RegistryObject<Item> GROUND_DURIAN = ITEMS.register("ground_durian",
            () -> new BlockItem(ModBlocks.GROUND_DURIAN.get(),
                    new Item.Properties().food(new Food.Builder().nutrition(2).saturationMod(4f)
                            .effect(()-> new EffectInstance(Effects.POISON,40),1f)
                                    .build())
                    .tab(ModItemGroup.WHEELOFTIME_GROUP)));

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

    public static final RegistryObject<Item> STEEL_TOOL_ROD = ITEMS.register("steel_tool_rod",
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
    public static final RegistryObject<Item> XP_CALLER = ITEMS.register("xp_caller",
            () -> new XPCaller(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> XP_CALLER_1 = ITEMS.register("xp_caller_1",
            () -> new XPCaller1(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> XP_CALLER_2 = ITEMS.register("xp_caller_2",
            () -> new XPCaller2(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

    public static final RegistryObject<Item> XP_CALLER_X = ITEMS.register("xp_caller_x",
            () -> new XPCallerX(new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP_CALLER)));

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
