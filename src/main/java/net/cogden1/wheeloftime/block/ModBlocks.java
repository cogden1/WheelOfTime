package net.cogden1.wheeloftime.block;

import net.cogden1.wheeloftime.WheelOfTime;
import net.cogden1.wheeloftime.block.custom.ChoppingBlock;
import net.cogden1.wheeloftime.block.custom.ElevatorBlock;
import net.cogden1.wheeloftime.block.custom.EntityTeleportBlock;
import net.cogden1.wheeloftime.item.ModItemGroup;
import net.cogden1.wheeloftime.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.system.CallbackI;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, WheelOfTime.MOD_ID);

    //Ore
    public static final RegistryObject<Block> AMETHYST_ORE = registerBlock("amethyst_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(3).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(3f)));

    public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).harvestLevel(3).harvestTool(ToolType.PICKAXE).
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

    //Resource Block
    public static final RegistryObject<Block> AMETHYST_BLOCK = registerBlock("amethyst_block",
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

    public static final RegistryObject<Block> CHOPPING_BLOCK = registerBlock("chopping_block",
            () -> new ChoppingBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> ENTITY_TELEPORT_BLOCK = registerBlock("entity_teleport_block",
            () -> new EntityTeleportBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

    public static final RegistryObject<Block> ELEVATOR_BLOCK = registerBlock("elevator_block",
            () -> new ElevatorBlock(AbstractBlock.Properties.of(Material.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).
                    requiresCorrectToolForDrops().strength(2f)));

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
