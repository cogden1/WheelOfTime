package net.cogden1.wheeloftime.world.gen;

import net.cogden1.wheeloftime.block.ModBlocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.DarkOakFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.MegaPineFoliagePlacer;
import net.minecraft.world.gen.trunkplacer.FancyTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.ForkyTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.MegaJungleTrunkPlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

public class ModConfiguredFeatures {

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SNUBBER =
            register("snubber", Feature.TREE.configured((
                    new BaseTreeFeatureConfig.Builder(
                            new SimpleBlockStateProvider(ModBlocks.SNUBBER_LOG.get().defaultBlockState()),
                            new SimpleBlockStateProvider(ModBlocks.SNUBBER_LEAVES.get().defaultBlockState()),
                            new BlobFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(0), 3),
                            new StraightTrunkPlacer(5, 3, 1),
                            new TwoLayerFeature(1, 0, 1))).ignoreVines().build()));

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> FLOWER =
            register("flower", Feature.TREE.configured((
                    new BaseTreeFeatureConfig.Builder(
                            new SimpleBlockStateProvider(ModBlocks.PLANT_STEM.get().defaultBlockState()),
                            new SimpleBlockStateProvider(ModBlocks.PETAL_BLOCK.get().defaultBlockState()),
                            new DarkOakFoliagePlacer(FeatureSpread.fixed(2),FeatureSpread.fixed(1)),
                            new StraightTrunkPlacer(5,3,1),
                            new TwoLayerFeature(1, 0, 1))).ignoreVines().build()));



    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String p_243968_0_, ConfiguredFeature<FC, ?> p_243968_1_) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, p_243968_0_, p_243968_1_);
    }


}
