package net.cogden1.wheeloftime.world;

import net.cogden1.wheeloftime.WheelOfTime;
import net.cogden1.wheeloftime.world.gen.ModOreGeneration;
import net.cogden1.wheeloftime.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = WheelOfTime.MOD_ID)
public class ModWorldEvents {


    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event)
    {
        ModOreGeneration.generateOres(event);
        ModTreeGeneration.generateTrees(event);
    }

}
