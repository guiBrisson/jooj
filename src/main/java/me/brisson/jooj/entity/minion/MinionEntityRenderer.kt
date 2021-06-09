package me.brisson.jooj.entity.minion

import me.brisson.jooj.Jooj
import net.minecraft.client.render.entity.EntityRenderDispatcher
import net.minecraft.client.render.entity.MobEntityRenderer
import net.minecraft.util.Identifier


class MinionEntityRenderer(entityRenderDispatcher: EntityRenderDispatcher?, ) :
    MobEntityRenderer<MinionEntity?, MinionEntityModel>(entityRenderDispatcher,
        MinionEntityModel(), 0.5f) {

    override fun getTexture(entity: MinionEntity?): Identifier {
        return Identifier(Jooj.MOD_ID, "textures/entity/minion/minion.png")
    }


}