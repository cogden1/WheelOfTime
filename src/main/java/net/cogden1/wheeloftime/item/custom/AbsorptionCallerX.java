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

public class AbsorptionCallerX extends Item{

    public AbsorptionCallerX(Properties properties) {
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
            giveEntityAbsorption(playerEntity, 3000, 4);
    }

    public static void giveEntityAbsorption(PlayerEntity playerEntity,int tick,int level)
    {
        playerEntity.addEffect(new EffectInstance(Effects.ABSORPTION,tick,level));
        playerEntity.addEffect(new EffectInstance(Effects.REGENERATION,tick,level));
        playerEntity.addEffect(new EffectInstance(Effects.HEAL,1,2));
        playerEntity.addEffect(new EffectInstance(Effects.HEALTH_BOOST,tick,level));
    }

}
