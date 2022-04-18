package net.cogden1.wheeloftime.tileentity;

import net.cogden1.wheeloftime.WheelOfTime;
import net.cogden1.wheeloftime.block.ModBlocks;
import net.cogden1.wheeloftime.util.ModSoundEvents;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntities {

    public static DeferredRegister<TileEntityType<?>> TILE_ENTITIES =
            DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, WheelOfTime.MOD_ID);

    public static RegistryObject<TileEntityType<PickingTableTile>> PICKING_TABLE_TILE =
            TILE_ENTITIES.register("picking_table_tile", () -> TileEntityType.Builder.of(
                    PickingTableTile::new, ModBlocks.PICKING_TABLE_BLOCK.get()).build(null));


    public static void register(IEventBus eventBus){
        TILE_ENTITIES.register(eventBus);
    }

}
