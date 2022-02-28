package net.cogden1.wheeloftime.block.custom;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static java.lang.Math.cos;
import static java.lang.Math.sin;


public class ElevatorBlock extends Block {


    public ElevatorBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(World world, BlockPos blockPos, Entity entity) {


        elevateEntity(entity);
        super.stepOn(world, blockPos, entity);


    }

    public static void elevateEntity(Entity entity){

        //entity needs to be sneaking to avoid teleport
        if(entity.isAttackable()
                && !entity.isSteppingCarefully())
        {
            entity.setPos(entity.xo,
                    entity.yo + 10,
                    entity.zo);
        }
    }
}
