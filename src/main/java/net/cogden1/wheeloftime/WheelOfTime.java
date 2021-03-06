package net.cogden1.wheeloftime;

import com.google.common.collect.ImmutableMap;
import net.cogden1.wheeloftime.block.ModBlocks;
import net.cogden1.wheeloftime.container.ModContainers;
import net.cogden1.wheeloftime.crafting.recipe.ModRecipeTypes;
import net.cogden1.wheeloftime.item.ModItems;
import net.cogden1.wheeloftime.screen.PickingTableScreen;
import net.cogden1.wheeloftime.tileentity.ModTileEntities;
import net.cogden1.wheeloftime.util.ModSoundEvents;
import net.cogden1.wheeloftime.world.structure.ModStructures;
import net.minecraft.block.Block;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.AxeItem;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(WheelOfTime.MOD_ID)
public class WheelOfTime
{
	public static final String MOD_ID = "wheeloftime";
	
	
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public WheelOfTime() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModTileEntities.register(eventBus);
        ModContainers.register(eventBus);
        ModRecipeTypes.register(eventBus);
        ModSoundEvents.register(eventBus);
        ModStructures.register(eventBus);


        eventBus.addListener(this::setup);
        // Register the enqueueIMC method for modloading
        eventBus.addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        eventBus.addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        eventBus.addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(()->{
            AxeItem.STRIPABLES =
                    new ImmutableMap.Builder<Block,Block>().putAll(AxeItem.STRIPABLES)
                            .put(ModBlocks.SNUBBER_LOG.get(),ModBlocks.STRIPPED_SNUBBER_LOG.get())
                            .put(ModBlocks.SNUBBER_WOOD.get(),ModBlocks.STRIPPED_SNUBBER_WOOD.get()).build();
            //ModStructures.setupStructures();
        });
    }

    private void doClientStuff(final FMLClientSetupEvent event) 
    {
        event.enqueueWork(()->{
            RenderTypeLookup.setRenderLayer(ModBlocks.TIN_SHEET_TRAPDOOR.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.TIN_SHEET_DOOR.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.LEAD_SHEET_TRAPDOOR.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.LEAD_SHEET_DOOR.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.COPPER_SHEET_TRAPDOOR.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.COPPER_SHEET_DOOR.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.IRON_SHEET_TRAPDOOR.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.IRON_SHEET_DOOR.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.GOLD_SHEET_TRAPDOOR.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.GOLD_SHEET_DOOR.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SNUBBER_TRAPDOOR.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SNUBBER_DOOR.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SNUBBER_LEAVES.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.SNUBBER_SAPLING.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.GROUND_DURIAN.get(), RenderType.cutout());
            RenderTypeLookup.setRenderLayer(ModBlocks.PLUG_PLANT.get(), RenderType.cutout());

            ScreenManager.register(ModContainers.PICKING_TABLE_CONTAINER.get(),
                    PickingTableScreen::new);

        });
       
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("wheeloftime", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }
}
