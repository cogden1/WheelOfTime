package net.cogden1.wheeloftime.tileentity;

import net.cogden1.wheeloftime.container.ModContainers;
import net.cogden1.wheeloftime.crafting.recipe.ModRecipeTypes;
import net.cogden1.wheeloftime.crafting.recipe.PickingTableRecipe;
import net.cogden1.wheeloftime.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.IIntArray;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Optional;

public class PickingTableTile extends TileEntity implements ITickableTileEntity {


    private final ItemStackHandler itemHandler = createHandler();
    private final LazyOptional<IItemHandler> handler = LazyOptional.of(() -> itemHandler);

    public PickingTableTile(TileEntityType<?> p_i48289_1_) {
        super(p_i48289_1_);
    }

    public PickingTableTile(){
        this(ModTileEntities.PICKING_TABLE_TILE.get());
    }

    @Override
    public void load(BlockState p_230337_1_, CompoundNBT p_230337_2_) {
        itemHandler.deserializeNBT(p_230337_2_.getCompound("inv"));
        super.load(p_230337_1_, p_230337_2_);
    }

    @Override
    public CompoundNBT save(CompoundNBT p_189515_1_) {
        p_189515_1_.put("inv",itemHandler.serializeNBT());
        return super.save(p_189515_1_);
    }

    private ItemStackHandler createHandler(){
        return new ItemStackHandler(2)
        {
            @Override
            protected void onContentsChanged(int slot) {
                setChanged();
            }

            @Override
            public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
                return true;
            }

            @Override
            public int getSlotLimit(int slot) {
                return 1;
            }

            @Nonnull
            @Override
            public ItemStack insertItem(int slot, @Nonnull ItemStack stack, boolean simulate) {
                if(!isItemValid(slot,stack)){
                    return stack;
                }

                return super.insertItem(slot,stack,simulate);
            }
        };
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap) {
        if(cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY){
            return handler.cast();
        }
        return super.getCapability(cap);
    }

    static final int WORK_TIME = 40;
    private int progress = 0;

    public void craft() {
        Inventory inv = new Inventory(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inv.setItem(i, itemHandler.getStackInSlot(i));
        }

        Optional<PickingTableRecipe> recipe = level.getRecipeManager()
                .getRecipeFor(ModRecipeTypes.PICKING_RECIPE, inv, level);

        recipe.ifPresent(iRecipe -> {
            ItemStack output = iRecipe.getResultItem();
                craftTheItem(output);

            setChanged();
        });
    }

    private void craftTheItem(ItemStack output) {
            itemHandler.extractItem(0, 1, false);
            itemHandler.extractItem(1, 1, false);
            itemHandler.insertItem(1, output, false);
    }


    @Override
    public void tick() {
        if(this.level == null || this.level.isClientSide())
            return;

        craft();
    }



}
