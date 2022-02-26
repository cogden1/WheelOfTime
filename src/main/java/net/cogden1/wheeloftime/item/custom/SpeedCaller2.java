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

public class SpeedCaller2 extends Item{

    public SpeedCaller2(Properties properties) {
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
            giveEntitySpeed(playerEntity, 2400, 2);
    }

    public static void giveEntitySpeed(PlayerEntity playerEntity,int tick,int level)
    {
        playerEntity.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED,tick,level));
    }

}
