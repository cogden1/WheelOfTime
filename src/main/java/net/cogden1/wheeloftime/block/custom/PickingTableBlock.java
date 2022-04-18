package net.cogden1.wheeloftime.block.custom;

import net.cogden1.wheeloftime.container.PickingTableContainer;
import net.cogden1.wheeloftime.tileentity.ModTileEntities;
import net.cogden1.wheeloftime.tileentity.PickingTableTile;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.Nullable;
import java.nio.channels.NetworkChannel;

public class PickingTableBlock extends Block {

    public PickingTableBlock(Properties p_i48440_1_) {
        super(p_i48440_1_);
    }

    @Override
    public ActionResultType use(BlockState p_225533_1_, World p_225533_2_, BlockPos p_225533_3_, PlayerEntity p_225533_4_, Hand p_225533_5_, BlockRayTraceResult p_225533_6_) {
        if(!p_225533_2_.isClientSide()){
            TileEntity tileEntity = p_225533_2_.getBlockEntity(p_225533_3_);

            if(tileEntity instanceof PickingTableTile){
                INamedContainerProvider containerProvider = createContainerProvider(p_225533_2_,p_225533_3_);

                NetworkHooks.openGui(((ServerPlayerEntity) p_225533_4_), containerProvider, tileEntity.getBlockPos());
            }
            else{
                throw new IllegalStateException("Our Container Provider Is Missing!");
            }
        }

        return ActionResultType.SUCCESS;
    }

    private INamedContainerProvider createContainerProvider(World p_225533_2_, BlockPos p_225533_3_) {
        return new INamedContainerProvider() {
            @Override
            public ITextComponent getDisplayName() {
                return new TranslationTextComponent("screen.wheeloftime.picking_table_screen");
            }

            @Nullable
            @Override
            public Container createMenu(int p_createMenu_1_, PlayerInventory p_createMenu_2_, PlayerEntity p_createMenu_3_) {
                return new PickingTableContainer(p_createMenu_1_, p_225533_2_, p_225533_3_, p_createMenu_2_, p_createMenu_3_);
            }
        };
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return ModTileEntities.PICKING_TABLE_TILE.get().create();
    }
}
