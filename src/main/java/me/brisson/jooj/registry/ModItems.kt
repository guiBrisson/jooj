package me.brisson.jooj.registry

import me.brisson.jooj.Jooj
import me.brisson.jooj.materials.RubyArmorMaterial
import net.minecraft.entity.EquipmentSlot
import net.minecraft.item.*
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class ModItems {


    fun registerItems() {
        // Items
        Registry.register(Registry.ITEM, Identifier(Jooj.MOD_ID, "ruby"), ruby)
        // Blocks
        Registry.register(Registry.ITEM, Identifier(Jooj.MOD_ID, "ruby_block"), rubyBlock)
        Registry.register(Registry.ITEM, Identifier(Jooj.MOD_ID, "ruby_ore"), rubyOre)
        // Armor
        Registry.register(Registry.ITEM, Identifier(Jooj.MOD_ID, "ruby_helmet"), rubyHelmet)
        Registry.register(Registry.ITEM, Identifier(Jooj.MOD_ID, "ruby_chestplate"), rubyChestplate)
        Registry.register(Registry.ITEM, Identifier(Jooj.MOD_ID, "ruby_leggings"), rubyLeggings)
        Registry.register(Registry.ITEM, Identifier(Jooj.MOD_ID, "ruby_boots"), rubyBoots)

    }

    companion object {
        private val itemGroup: ItemGroup = Jooj.itemGroup
        private val rubyArmorMaterial = RubyArmorMaterial()

        // Items
        val ruby = Item(Item.Settings().group(itemGroup))

        //  Ruby Armor
        val rubyHelmet = ArmorItem(rubyArmorMaterial, EquipmentSlot.HEAD, Item.Settings().group(itemGroup))
        val rubyChestplate = ArmorItem(rubyArmorMaterial, EquipmentSlot.CHEST, Item.Settings().group(itemGroup))
        val rubyLeggings = ArmorItem(rubyArmorMaterial, EquipmentSlot.LEGS, Item.Settings().group(itemGroup))
        val rubyBoots = ArmorItem(rubyArmorMaterial, EquipmentSlot.FEET, Item.Settings().group(itemGroup))

        //Block Items
        private val rubyBlock =  BlockItem(ModBlocks.rubyBlock, Item.Settings().group(itemGroup))
        private val rubyOre = BlockItem(ModBlocks.rubyOre, Item.Settings().group(itemGroup))

    }

}