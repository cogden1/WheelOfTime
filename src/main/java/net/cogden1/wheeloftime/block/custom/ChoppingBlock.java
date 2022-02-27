package net.cogden1.wheeloftime.block.custom;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ChoppingBlock extends Block {


    public ChoppingBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(World world, BlockPos blockPos, Entity entity) {

        giveEntityDamage(entity);
        super.stepOn(world, blockPos, entity);


    }

    public static void giveEntityDamage(Entity entity)
    {
        //entity needs to have a custom name,
        // fire immunity, or be sneaking to avoid chopping
        if(entity.isAttackable()
                && !entity.hasCustomName()
                && !entity.isSteppingCarefully()
                && !entity.fireImmune())
        {
        entity.kill();
        }
    }
}
