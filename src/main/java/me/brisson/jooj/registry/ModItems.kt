package me.brisson.jooj.registry

import me.brisson.jooj.Jooj
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class ModItems {


    fun registerItems() {
        Registry.register(Registry.ITEM, Identifier(Jooj.MOD_ID, "ruby"), ruby)
        Registry.register(Registry.ITEM, Identifier(Jooj.MOD_ID, "ruby_block"), rubyBlock)
        Registry.register(Registry.ITEM, Identifier(Jooj.MOD_ID, "ruby_ore"), rubyOre)
    }

    companion object {
        private val itemGroup: ItemGroup = Jooj.itemGroup

        // Items
        val ruby = Item(Item.Settings().group(itemGroup))

        //Block Items
        private val rubyBlock =  BlockItem(ModBlocks.rubyBlock, Item.Settings().group(itemGroup))
        private val rubyOre = BlockItem(ModBlocks.rubyOre, Item.Settings().group(itemGroup))
    }

}