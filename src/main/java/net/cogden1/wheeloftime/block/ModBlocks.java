package net.cogden1.wheeloftime.block;

import net.cogden1.wheeloftime.WheelOfTime;
import net.cogden1.wheeloftime.block.custom.*;
import net.cogden1.wheeloftime.block.custom.trees.FlowerTree;
import net.cogden1.wheeloftime.block.custom.trees.SnubberTree;
import net.cogden1.wheeloftime.item.ModItemGroup;
import net.cogden1.wheeloftime.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, WheelOfTime.MOD_ID);

    //Ore
    public static final RegistryObject<Block> AMETHYST_ORE = registerBlock("amethyst_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(4).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(3f)));

    public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(5).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(3f)));

    public static final RegistryObject<Block> TOPAZ_ORE = registerBlock("topaz_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(4).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(3f)));

    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(7).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(3f)));

    public static final RegistryObject<Block> TURQUOISE_ORE = registerBlock("turquoise_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(6).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(3f)));

    public static final RegistryObject<Block> CRYSTAL_PAIN_ORE = registerBlock("crystal_pain_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(5).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(3f)));

    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(1f)));

    public static final RegistryObject<Block> COPPER_ORE = registerBlock("copper_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(1f)));

    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> NICKEL_ORE = registerBlock("nickel_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> LEAD_ORE = registerBlock("lead_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> PLATINUM_ORE = registerBlock("platinum_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(3).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> ALUMINUM_ORE = registerBlock("aluminum_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> MERCURY_ORE = registerBlock("mercury_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> GLOWSTONIUM_ORE = registerBlock("glowstonium_ore",
            () -> new GlowstoniumOre(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> ICEBURST_STONE_ORE = registerBlock("iceburst_stone_ore",
            () -> new IceburstStoneOre(AbstractBlock.Properties.of(Material.STONE).harvestLevel(7).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> ORGANIC_POLYMER_ORE = registerBlock("organic_polymer_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(3).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> SALT_ORE = registerBlock("salt_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> SULFUR_ORE = registerBlock("sulfur_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    //Resource Block
    public static final RegistryObject<Block> AMETHYST_BLOCK = registerBlock("amethyst_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(3).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(3f)));

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(3).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(3f)));

    public static final RegistryObject<Block> TURQUOISE_BLOCK = registerBlock("turquoise_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(3).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(3f)));

    public static final RegistryObject<Block> TOPAZ_BLOCK = registerBlock("topaz_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(3).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(3f)));

    public static final RegistryObject<Block> CRYSTAL_PAIN_BLOCK = registerBlock("crystal_pain_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(3).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(3f)));

    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(3).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(3f)));

    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(1f)));

    public static final RegistryObject<Block> COPPER_BLOCK = registerBlock("copper_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(1f)));

    public static final RegistryObject<Block> NICKEL_BLOCK = registerBlock("nickel_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> PLATINUM_BLOCK = registerBlock("platinum_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> ALUMINUM_BLOCK = registerBlock("aluminum_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> GLOWSTONIUM_BLOCK = registerBlock("glowstonium_block",
            () -> new GlowstoniumBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> ICEBURST_STONE_BLOCK = registerBlock("iceburst_stone_block",
            () -> new IceburstStoneBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> MERCURY_BLOCK = registerBlock("mercury_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> SALT_BLOCK = registerBlock("salt_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> SULFUR_BLOCK = registerBlock("sulfur_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> TURTANIUM_BLOCK = registerBlock("turtanium_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));



    //machines
    public static final RegistryObject<Block> CHOPPING_BLOCK = registerBlock("chopping_block",
            () -> new ChoppingBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> ENTITY_TELEPORT_BLOCK = registerBlock("entity_teleport_block",
            () -> new EntityTeleportBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> ENTITY_TELEPORT_BLOCK_NORTH = registerBlock("entity_teleport_block_north",
            () -> new EntityTeleportBlockNorth(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> ENTITY_TELEPORT_BLOCK_SOUTH = registerBlock("entity_teleport_block_south",
            () -> new EntityTeleportBlockSouth(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> ENTITY_TELEPORT_BLOCK_EAST = registerBlock("entity_teleport_block_east",
            () -> new EntityTeleportBlockEast(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> ENTITY_TELEPORT_BLOCK_WEST = registerBlock("entity_teleport_block_west",
            () -> new EntityTeleportBlockWest(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> ELEVATOR_BLOCK = registerBlock("elevator_block",
            () -> new ElevatorBlock(AbstractBlock.Properties.of(Material.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));


    //complex machines
    public static final RegistryObject<Block> PICKING_TABLE_BLOCK = registerBlock("picking_table_block",
            () -> new PickingTableBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    //Wood
    public static final RegistryObject<Block> SNUBBER_LOG = registerBlock("snubber_log",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2f).harvestTool(ToolType.AXE)));

    public static final RegistryObject<Block> SNUBBER_WOOD = registerBlock("snubber_wood",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2f).harvestTool(ToolType.AXE)));

    public static final RegistryObject<Block> STRIPPED_SNUBBER_LOG = registerBlock("stripped_snubber_log",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2f).harvestTool(ToolType.AXE)));

    public static final RegistryObject<Block> STRIPPED_SNUBBER_WOOD = registerBlock("stripped_snubber_wood",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD).strength(2f).harvestTool(ToolType.AXE)));

    public static final RegistryObject<Block> SNUBBER_PLANKS = registerBlock("snubber_planks",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(2f).harvestTool(ToolType.AXE)));

    public static final RegistryObject<Block> SNUBBER_LEAVES = registerBlock("snubber_leaves",
            () -> new LeavesBlock(AbstractBlock.Properties.of(Material.LEAVES).harvestTool(ToolType.HOE).strength(.25f)
                    .noOcclusion().sound(SoundType.GRASS)));

    public static final RegistryObject<Block> SNUBBER_SAPLING = registerBlock("snubber_sapling",
            () -> new SaplingBlock(new SnubberTree(), AbstractBlock.Properties.of(Material.PLANT)
                    .noCollission().sound(SoundType.BAMBOO_SAPLING)));




    public static final RegistryObject<Block> PLANT_STEM = registerBlock("plant_stem",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD)));

    public static final RegistryObject<Block> PETAL_BLOCK = registerBlock("petal_block",
            () -> new Block(AbstractBlock.Properties.of(Material.LEAVES).harvestTool(ToolType.HOE).strength(.25f)
                    .sound(SoundType.GRASS)));

    public static final RegistryObject<Block> PLUG_PLANT = registerBlock("plug_plant",
            () -> new SaplingBlock(new FlowerTree(), AbstractBlock.Properties.of(Material.PLANT)
                    .noCollission().sound(SoundType.ANCIENT_DEBRIS)));



    //decor


    public static final RegistryObject<Block> TIN_SHEET_BLOCK = registerBlock("tin_sheet_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> IRON_SHEET_BLOCK = registerBlock("iron_sheet_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> GOLD_SHEET_BLOCK = registerBlock("gold_sheet_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> LEAD_SHEET_BLOCK = registerBlock("lead_sheet_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> COPPER_SHEET_BLOCK = registerBlock("copper_sheet_block",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> TIN_SHEET_STAIRS = registerBlock("tin_sheet_stairs",
            () -> new StairsBlock(() -> TIN_SHEET_BLOCK.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                            requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> IRON_SHEET_STAIRS = registerBlock("iron_sheet_stairs",
            () -> new StairsBlock(() -> IRON_SHEET_BLOCK.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                            requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> GOLD_SHEET_STAIRS = registerBlock("gold_sheet_stairs",
            () -> new StairsBlock(() -> GOLD_SHEET_BLOCK.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                            requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> COPPER_SHEET_STAIRS = registerBlock("copper_sheet_stairs",
            () -> new StairsBlock(() -> COPPER_SHEET_BLOCK.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                            requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> LEAD_SHEET_STAIRS = registerBlock("lead_sheet_stairs",
            () -> new StairsBlock(() -> LEAD_SHEET_BLOCK.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                            requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> SNUBBER_STAIRS = registerBlock("snubber_stairs",
            () -> new StairsBlock(() -> SNUBBER_PLANKS.get().defaultBlockState(),
                    AbstractBlock.Properties.of(Material.WOOD).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                            requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> TIN_SHEET_FENCE = registerBlock("tin_sheet_fence",
            () -> new FenceBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> TIN_SHEET_FENCE_GATE = registerBlock("tin_sheet_fence_gate",
            () -> new FenceGateBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> IRON_SHEET_FENCE = registerBlock("iron_sheet_fence",
            () -> new FenceBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> IRON_SHEET_FENCE_GATE = registerBlock("iron_sheet_fence_gate",
            () -> new FenceGateBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> COPPER_SHEET_FENCE = registerBlock("copper_sheet_fence",
            () -> new FenceBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> COPPER_SHEET_FENCE_GATE = registerBlock("copper_sheet_fence_gate",
            () -> new FenceGateBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> LEAD_SHEET_FENCE = registerBlock("lead_sheet_fence",
            () -> new FenceBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> LEAD_SHEET_FENCE_GATE = registerBlock("lead_sheet_fence_gate",
            () -> new FenceGateBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> GOLD_SHEET_FENCE = registerBlock("gold_sheet_fence",
            () -> new FenceBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> GOLD_SHEET_FENCE_GATE = registerBlock("gold_sheet_fence_gate",
            () -> new FenceGateBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> SNUBBER_FENCE = registerBlock("snubber_fence",
            () -> new FenceBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> SNUBBER_FENCE_GATE = registerBlock("snubber_fence_gate",
            () -> new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> TIN_SHEET_SLAB = registerBlock("tin_sheet_slab",
            () -> new SlabBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> COPPER_SHEET_SLAB = registerBlock("copper_sheet_slab",
            () -> new SlabBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> GOLD_SHEET_SLAB = registerBlock("gold_sheet_slab",
            () -> new SlabBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> IRON_SHEET_SLAB = registerBlock("iron_sheet_slab",
            () -> new SlabBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> LEAD_SHEET_SLAB = registerBlock("lead_sheet_slab",
            () -> new SlabBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> SNUBBER_SLAB = registerBlock("snubber_slab",
            () -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> LEAD_SHEET_DOOR = registerBlock("lead_sheet_door",
            () -> new DoorBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f).noOcclusion()));

    public static final RegistryObject<Block> LEAD_SHEET_TRAPDOOR = registerBlock("lead_sheet_trapdoor",
            () -> new TrapDoorBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f).noOcclusion()));

    public static final RegistryObject<Block> TIN_SHEET_DOOR = registerBlock("tin_sheet_door",
            () -> new DoorBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f).noOcclusion()));

    public static final RegistryObject<Block> TIN_SHEET_TRAPDOOR = registerBlock("tin_sheet_trapdoor",
            () -> new TrapDoorBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f).noOcclusion()));

    public static final RegistryObject<Block> GOLD_SHEET_DOOR = registerBlock("gold_sheet_door",
            () -> new DoorBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f).noOcclusion()));

    public static final RegistryObject<Block> GOLD_SHEET_TRAPDOOR = registerBlock("gold_sheet_trapdoor",
            () -> new TrapDoorBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f).noOcclusion()));

    public static final RegistryObject<Block> IRON_SHEET_DOOR = registerBlock("iron_sheet_door",
            () -> new DoorBlock(AbstractBlock.Properties.of(Material.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f).noOcclusion()));

    public static final RegistryObject<Block> IRON_SHEET_TRAPDOOR = registerBlock("iron_sheet_trapdoor",
            () -> new TrapDoorBlock(AbstractBlock.Properties.of(Material.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f).noOcclusion()));

    public static final RegistryObject<Block> COPPER_SHEET_DOOR = registerBlock("copper_sheet_door",
            () -> new DoorBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f).noOcclusion()));

    public static final RegistryObject<Block> COPPER_SHEET_TRAPDOOR = registerBlock("copper_sheet_trapdoor",
            () -> new TrapDoorBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f).noOcclusion()));

    public static final RegistryObject<Block> SNUBBER_DOOR = registerBlock("snubber_door",
            () -> new DoorBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f).noOcclusion()));

    public static final RegistryObject<Block> SNUBBER_TRAPDOOR = registerBlock("snubber_trapdoor",
            () -> new TrapDoorBlock(AbstractBlock.Properties.of(Material.WOOD).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f).noOcclusion()));





    //crops
    public static final RegistryObject<Block> GROUND_DURIAN = BLOCKS.register("ground_durian_crop",
            ()-> new GroundDurianBlock(AbstractBlock.Properties.of(Material.PLANT).noCollission()));


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block)
    {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModItemGroup.WHEELOFTIME_GROUP)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }


}
