package net.cogden1.wheeloftime.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResultType;
import net.minecraft.world.World;

public class VisionCaller extends Item{

    public VisionCaller(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType onItemUseFirst(ItemStack stack, ItemUseContext context) {
        World world = context.getPlayer().getCommandSenderWorld();

        if(!world.isClientSide){
            PlayerEntity playerEntity = context.getPlayer();
            BlockState clickedBlock = world.getBlockState(context.getClickedPos());

            rightClickOnCertainBlockState(clickedBlock, context, playerEntity);
            stack.shrink(1);
        }


        return super.onItemUseFirst(stack, context);
    }

    private void rightClickOnCertainBlockState(
            BlockState clickedBlock, ItemUseContext context, PlayerEntity playerEntity)
    {
            giveEntityVision(playerEntity, 20000);
    }

    public static void giveEntityVision(PlayerEntity playerEntity,int tick)
    {
        playerEntity.addEffect(new EffectInstance(Effects.NIGHT_VISION,tick));
    }

}
