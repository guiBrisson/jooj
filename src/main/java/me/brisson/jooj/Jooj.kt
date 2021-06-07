package me.brisson.jooj

import me.brisson.jooj.registry.ModBlocks
import me.brisson.jooj.registry.ModItems
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier

class Jooj : ModInitializer {

    private var modItems = ModItems()
    private var modBlocks = ModBlocks()

    override fun onInitialize() {
        modItems.registerItems()
        modBlocks.registerBlocks()
    }

    companion object {
        const val MOD_ID: String = "jooj"

        val itemGroup = FabricItemGroupBuilder.build(Identifier(MOD_ID, "general")) {
            ItemStack(ModItems.ruby)
        }
    }
}