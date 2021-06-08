package me.brisson.jooj.registry

import me.brisson.jooj.Jooj
import me.brisson.jooj.materials.RubyArmorMaterial
import me.brisson.jooj.materials.RubyToolsMaterial
import net.minecraft.entity.EquipmentSlot
import net.minecraft.item.*
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class ModItems {

    fun registerItems() {
        // Items
        registryRegister("ruby", ruby)
        // Blocks
        registryRegister("ruby_block", rubyBlock)
        registryRegister("ruby_ore", rubyOre)
        // Armor
        registryRegister("ruby_helmet", rubyHelmet)
        registryRegister("ruby_chestplate", rubyChestplate)
        registryRegister("ruby_leggings", rubyLeggings)
        registryRegister("ruby_boots", rubyBoots)
        //Tools
        registryRegister("ruby_shovel", rubyShovel)
        registryRegister("ruby_sword", rubySword)
        registryRegister("ruby_pickaxe", rubyPickaxe)
        registryRegister("ruby_axe", rubyAxe)
        registryRegister("ruby_hoe", rubyHoe)

    }

    private fun registryRegister(path: String, item: Item){
        Registry.register(Registry.ITEM, Identifier(Jooj.MOD_ID, path), item)
    }

    companion object {
        private val itemGroup: ItemGroup = Jooj.itemGroup
        private val rubyArmorMaterial = RubyArmorMaterial()

        // Items
        val ruby = Item(Item.Settings().group(itemGroup))

        //Block Items
        private val rubyBlock =  BlockItem(ModBlocks.rubyBlock, Item.Settings().group(itemGroup))
        private val rubyOre = BlockItem(ModBlocks.rubyOre, Item.Settings().group(itemGroup))

        //  Ruby Armor
        val rubyHelmet = ArmorItem(rubyArmorMaterial, EquipmentSlot.HEAD, Item.Settings().group(itemGroup))
        val rubyChestplate = ArmorItem(rubyArmorMaterial, EquipmentSlot.CHEST, Item.Settings().group(itemGroup))
        val rubyLeggings = ArmorItem(rubyArmorMaterial, EquipmentSlot.LEGS, Item.Settings().group(itemGroup))
        val rubyBoots = ArmorItem(rubyArmorMaterial, EquipmentSlot.FEET, Item.Settings().group(itemGroup))

        // Tools
        //todo: unfinished tools textures
        val rubyShovel = ShovelItem(RubyToolsMaterial.newInstance(), 1.5f, -3f, Item.Settings().group(itemGroup))
        val rubySword = SwordItem(RubyToolsMaterial.newInstance(), 7, -2.4f, Item.Settings().group(itemGroup)) // finished
        val rubyPickaxe = RubyToolsMaterial.CustomPickaxeItem(RubyToolsMaterial.newInstance(), 5, 1.3f, Item.Settings().group(itemGroup))
        val rubyAxe = RubyToolsMaterial.CustomAxeItem(RubyToolsMaterial.newInstance(), 7.0f, 1.0f, Item.Settings().group(itemGroup))
        val rubyHoe = RubyToolsMaterial.CustomHoeItem(RubyToolsMaterial.newInstance(), 1, 0.5f, Item.Settings().group(itemGroup)) //finished

    }

}