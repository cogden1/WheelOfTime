package net.cogden1.wheeloftime.world;

import com.mojang.serialization.Codec;
import net.cogden1.wheeloftime.WheelOfTime;
import net.cogden1.wheeloftime.world.gen.ModOreGeneration;
import net.cogden1.wheeloftime.world.gen.ModStructureGeneration;
import net.cogden1.wheeloftime.world.gen.ModTreeGeneration;
import net.cogden1.wheeloftime.world.structure.ModStructures;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.FlatChunkGenerator;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.settings.DimensionStructuresSettings;
import net.minecraft.world.gen.settings.StructureSeparationSettings;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import org.apache.logging.log4j.LogManager;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber(modid = WheelOfTime.MOD_ID)
public class ModWorldEvents {


    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event)
    {
        ModStructureGeneration.generateStructures(event);
        ModOreGeneration.generateOres(event);
        ModTreeGeneration.generateTrees(event);
    }


    @SubscribeEvent
    public static void addDimensionalSpacing(final WorldEvent.Load event) {
        if(event.getWorld() instanceof ServerWorld) {
            ServerWorld serverWorld = (ServerWorld) event.getWorld();

            try {
                Method GETCODEC_METHOD =
                        ObfuscationReflectionHelper.findMethod(ChunkGenerator.class, "func_230347_a_");
                ResourceLocation cgRL = Registry.CHUNK_GENERATOR.getKey(
                        (Codec<? extends ChunkGenerator>)GETCODEC_METHOD.invoke(serverWorld.getChunkSource().generator));

                if (cgRL != null && cgRL.getNamespace().equals("terraforged")) {
                    return;
                }
            } catch (Exception e) {
                LogManager.getLogger().error("Was unable to check if " + serverWorld.dimension().getRegistryName()
                        + " is using Terraforged's ChunkGenerator.");
            }

            if (serverWorld.getChunkSource().generator instanceof FlatChunkGenerator &&
                    serverWorld.dimension().equals(World.OVERWORLD)) {
                return;
            }
            /**
            Map<Structure<?>, StructureSeparationSettings> tempMap =
                    new HashMap<>(serverWorld.getChunkSource().generator.getSettings().structureConfig());
            tempMap.putIfAbsent(ModStructures.SPINE.get(),
                    DimensionStructuresSettings.DEFAULTS.get(ModStructures.SPINE.get()));
            serverWorld.getChunkSource().generator.getSettings().structureConfig = tempMap;
             */
        }
    }
}
