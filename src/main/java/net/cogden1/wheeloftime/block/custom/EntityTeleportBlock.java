package net.cogden1.wheeloftime.block.custom;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import net.minecraft.util.Timer;
import java.util.concurrent.TimeUnit;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.toRadians;


public class EntityTeleportBlock extends Block {


    public EntityTeleportBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(World world, BlockPos blockPos, Entity entity) {

        teleportEntity(entity);
        super.stepOn(world, blockPos, entity);

    }

    public static void teleportEntity(Entity entity){

        //entity needs to be sneaking to avoid teleport
        if(entity.isAttackable()
                && !entity.isSteppingCarefully())
        {
            double facing = entity.yRot;
            facing = Math.toRadians(facing);
            entity.setPos(entity.xo - (20 * sin(facing)),
                    entity.yo + 0,
                    entity.zo + (20 * cos(facing)));
        }
    }
}
