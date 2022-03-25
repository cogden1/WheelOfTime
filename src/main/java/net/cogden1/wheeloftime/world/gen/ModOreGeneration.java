package net.cogden1.wheeloftime.world.gen;

import net.cogden1.wheeloftime.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.*;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class ModOreGeneration {

    public static void generateOres(final BiomeLoadingEvent event){
        for (OreType ore : OreType.values()){
            String biomeName = event.getCategory().getName();
            if(ore.getValidBiomes().contains(biomeName))
            {
                OreFeatureConfig oreFeatureConfig = null;
                if (event.getCategory() == Biome.Category.THEEND)
                {
                    oreFeatureConfig = new OreFeatureConfig(
                            OreType.END_STONE,
                            ore.getBlock().get().defaultBlockState(),
                            ore.getMaxVeinSize());
                }
                else if (event.getCategory() == Biome.Category.NETHER)
                {
                    oreFeatureConfig = new OreFeatureConfig(
                            OreFeatureConfig.FillerBlockType.NETHERRACK,
                            ore.getBlock().get().defaultBlockState(),
                            ore.getMaxVeinSize());
                }
                else if (event.getCategory() != Biome.Category.THEEND && event.getCategory() != Biome.Category.NETHER)
                {
                    oreFeatureConfig = new OreFeatureConfig(
                            OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                            ore.getBlock().get().defaultBlockState(),
                            ore.getMaxVeinSize());
                }

                if(oreFeatureConfig != null) {
                    ConfiguredPlacement<TopSolidRangeConfig> configuredPlacement = Placement.RANGE.configured(
                            new TopSolidRangeConfig(ore.getMinHeight(), ore.getMinHeight(), ore.getMaxHeight())
                    );
                    ConfiguredFeature<?, ?> oreFeature = registerOreFeature(ore, oreFeatureConfig, configuredPlacement);
                    event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, oreFeature);
                }
            }
        }
    }

    private static ConfiguredFeature<?, ?> registerOreFeature(
            OreType ore, OreFeatureConfig oreFeatureConfig, ConfiguredPlacement configuredPlacement){

        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE,ore.getBlock().get().getRegistryName(),
                Feature.ORE.configured(oreFeatureConfig).decorated(configuredPlacement)
                        .squared().count(ore.getMaxVeinSize()));
    }

}
