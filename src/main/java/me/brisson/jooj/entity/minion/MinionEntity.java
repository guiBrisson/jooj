package me.brisson.jooj.entity.minion;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class MinionEntity extends PathAwareEntity {

    public MinionEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }
}