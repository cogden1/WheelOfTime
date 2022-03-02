package net.cogden1.wheeloftime.block.custom;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class EntityTeleportBlockSouth extends Block {


    public EntityTeleportBlockSouth(Properties properties) {
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

            entity.setPos(entity.xo + (0),
                    entity.yo + 0,
                    entity.zo + (20));

        }
    }
}
