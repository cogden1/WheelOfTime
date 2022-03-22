package net.cogden1.wheeloftime.world.gen;

import net.cogden1.wheeloftime.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraftforge.common.util.Lazy;

import java.util.ArrayList;
import java.util.Arrays;

public enum OreType {

    AMETHYST(Lazy.of(ModBlocks.AMETHYST_ORE),3,3,32,
            new ArrayList<>(Arrays.asList(
                    Biome.Category.EXTREME_HILLS.getName()))),
    SAPPHIRE(Lazy.of(ModBlocks.SAPPHIRE_ORE),3,3,32,
            new ArrayList<>(Arrays.asList(
                    Biome.Category.EXTREME_HILLS.getName()))),
    TOPAZ(Lazy.of(ModBlocks.TOPAZ_ORE),3,3,32,
            new ArrayList<>(Arrays.asList(
                    Biome.Category.EXTREME_HILLS.getName()))),
    TURQUOISE(Lazy.of(ModBlocks.TURQUOISE_ORE),3,3,32,
            new ArrayList<>(Arrays.asList(
                    Biome.Category.EXTREME_HILLS.getName()))),
    RUBY(Lazy.of(ModBlocks.RUBY_ORE),3,3,32,
            new ArrayList<>(Arrays.asList(
                    Biome.Category.EXTREME_HILLS.getName()))),

    COPPER(Lazy.of(ModBlocks.COPPER_ORE),4,3,52),
    LEAD(Lazy.of(ModBlocks.LEAD_ORE),4,3,32),
    NICKEL(Lazy.of(ModBlocks.NICKEL_ORE),3,3,32),
    PLATINUM(Lazy.of(ModBlocks.PLATINUM_ORE),3,3,32,
            new ArrayList<>(Arrays.asList(
                    Biome.Category.EXTREME_HILLS.getName()))),
    SILVER(Lazy.of(ModBlocks.SILVER_ORE),3,3,32),
    ALUMINUM(Lazy.of(ModBlocks.ALUMINUM_ORE),3,3,32),
    TIN(Lazy.of(ModBlocks.TIN_ORE),4,3,52),

    MERCURY(Lazy.of(ModBlocks.MERCURY_ORE),3,3,70,
            new ArrayList<>(Arrays.asList(Biome.Category.THEEND.getName()))),
    ICEBURST_STONE(Lazy.of(ModBlocks.ICEBURST_STONE_ORE),3,3,70,
            new ArrayList<>(Arrays.asList(Biome.Category.THEEND.getName()))),

    SULFUR(Lazy.of(ModBlocks.SULFUR_ORE),7,3,122,
            new ArrayList<>(Arrays.asList(Biome.Category.NETHER.getName()))),
    ORGANIC_POLYMER(Lazy.of(ModBlocks.ORGANIC_POLYMER_ORE),3,3,122,
            new ArrayList<>(Arrays.asList(Biome.Category.NETHER.getName()))),
    CRYSTAL_PAIN(Lazy.of(ModBlocks.CRYSTAL_PAIN_ORE),3,3,122,
            new ArrayList<>(Arrays.asList(Biome.Category.NETHER.getName()))),
    GLOWSTONIUM(Lazy.of(ModBlocks.GLOWSTONIUM_ORE),5,3,122,
            new ArrayList<>(Arrays.asList(Biome.Category.NETHER.getName()))),
    SALT(Lazy.of(ModBlocks.SALT_ORE),7,3,122,
            new ArrayList<>(Arrays.asList(Biome.Category.NETHER.getName())))

    ;


    public static final RuleTest END_STONE = new BlockMatchRuleTest(Blocks.END_STONE);
    public static final RuleTest DIRT = new BlockMatchRuleTest(Blocks.DIRT);


    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;
    private final ArrayList<String> validBiomes;

    private final ArrayList<String> validBiomesOverworld = new ArrayList<>(Arrays.asList(
            Biome.Category.FOREST.getName(), Biome.Category.JUNGLE.getName(),
            Biome.Category.SAVANNA.getName(),Biome.Category.MESA.getName(),
            Biome.Category.MUSHROOM.getName(),Biome.Category.EXTREME_HILLS.getName(),
            Biome.Category.TAIGA.getName(),Biome.Category.OCEAN.getName(),Biome.Category.SWAMP.getName(),
            Biome.Category.PLAINS.getName(),Biome.Category.ICY.getName(),Biome.Category.DESERT.getName(),
            Biome.Category.BEACH.getName(),Biome.Category.RIVER.getName()));


    OreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight, ArrayList<String> validBiomes) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.validBiomes = validBiomes;
    }

    OreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.validBiomes = validBiomesOverworld;
    }

    public Lazy<Block> getBlock() {
        return block;
    }

    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public ArrayList<String> getValidBiomes() {
        return validBiomes;
    }

    public ArrayList<String> getValidBiomesOverworld() {
        return validBiomesOverworld;
    }

    public static OreType get(Block block){
        for(OreType ore : values()){
            if(block == ore.block) {
                return ore;
            }
        }
        return null;
    }
}
