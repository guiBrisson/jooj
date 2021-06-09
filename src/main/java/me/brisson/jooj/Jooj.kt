package me.brisson.jooj

import me.brisson.jooj.registry.ModBlocks
import me.brisson.jooj.registry.ModEntity
import me.brisson.jooj.registry.ModItems
import me.brisson.jooj.registry.ModOres
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier

class Jooj : ModInitializer {

    private var modItems = ModItems()
    private var modBlocks = ModBlocks()
    private var modOres = ModOres()
    private var modEntity = ModEntity()

    override fun onInitialize() {
        modItems.registerItems()
        modBlocks.registerBlocks()
        modOres.registerOres()
        modEntity.registerEntities()
    }

    companion object {
        const val MOD_ID: String = "jooj"

        val itemGroup: ItemGroup = FabricItemGroupBuilder.build(Identifier(MOD_ID, "general")) {
            ItemStack(ModItems.ruby)
        }
    }
}