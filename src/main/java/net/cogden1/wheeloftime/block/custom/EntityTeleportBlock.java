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
            /**
            double xo = entity.xo;
            double zo = entity.zo;
            //wait 100ms
            double xf = entity.xo;
            double zf = entity.zo;
            double dx = (xf-xo);
            double dz = (zf-zo);

            entity.setPos(entity.xo + (int)(200*dx),
             entity.yo+0,
             entity.zo + (int)(200*dz));
             */

            double facing = entity.yRot;
            facing = Math.toRadians(facing);
            entity.setPos(entity.xo - (20 * sin(facing)),
                    entity.yo + 0,
                    entity.zo + (20 * cos(facing)));
        }
    }
}
