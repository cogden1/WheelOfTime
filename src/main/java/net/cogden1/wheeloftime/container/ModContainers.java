package net.cogden1.wheeloftime.container;

import net.cogden1.wheeloftime.WheelOfTime;
import net.cogden1.wheeloftime.block.ModBlocks;
import net.cogden1.wheeloftime.tileentity.PickingTableTile;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainers {

    public static DeferredRegister<ContainerType<?>> CONTAINERS =
            DeferredRegister.create(ForgeRegistries.CONTAINERS, WheelOfTime.MOD_ID);

    public static RegistryObject<ContainerType<PickingTableContainer>> PICKING_TABLE_CONTAINER =
            CONTAINERS.register("picking_table_container",
                    () -> IForgeContainerType.create(((windowId, inv, data) -> {
                        BlockPos blockPos = data.readBlockPos();
                        World world = inv.player.getCommandSenderWorld();
                        return new PickingTableContainer(windowId, world, blockPos, inv, inv.player);
                    })));


    public static void register(IEventBus eventBus){
        CONTAINERS.register(eventBus);
    }

}
