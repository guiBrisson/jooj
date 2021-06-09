package me.brisson.jooj.registry

import me.brisson.jooj.Jooj
import me.brisson.jooj.entity.minion.MinionEntity
import me.brisson.jooj.entity.minion.MinionEntityRenderer
import net.fabricmc.fabric.api.`object`.builder.v1.entity.FabricDefaultAttributeRegistry
import net.fabricmc.fabric.api.`object`.builder.v1.entity.FabricEntityTypeBuilder
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry
import net.minecraft.client.render.entity.EntityRenderDispatcher
import net.minecraft.entity.EntityDimensions
import net.minecraft.entity.EntityType
import net.minecraft.entity.SpawnGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry


class ModEntity {

    fun registerEntities() {
        FabricDefaultAttributeRegistry.register(minion, MinionEntity.createMobAttributes())

        EntityRendererRegistry.INSTANCE.register(minion) { dispatcher: EntityRenderDispatcher?, _: EntityRendererRegistry.Context? ->
            MinionEntityRenderer(
                dispatcher
            )
        }
    }

    companion object {
        val minion: EntityType<MinionEntity> = Registry.register(
            Registry.ENTITY_TYPE, Identifier(Jooj.MOD_ID, "minion"), FabricEntityTypeBuilder
                .create(SpawnGroup.CREATURE, ::MinionEntity)
                .dimensions(EntityDimensions(0.75f, 0.75f, false))
                .build()
        )
    }


}