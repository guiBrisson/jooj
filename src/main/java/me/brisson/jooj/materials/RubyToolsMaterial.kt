package me.brisson.jooj.materials

import me.brisson.jooj.registry.ModItems
import net.minecraft.item.AxeItem
import net.minecraft.item.HoeItem
import net.minecraft.item.PickaxeItem
import net.minecraft.item.ToolMaterial
import net.minecraft.recipe.Ingredient

class RubyToolsMaterial: ToolMaterial {

    companion object{
        fun newInstance() = RubyToolsMaterial()
    }

    override fun getDurability(): Int {
        return 1750
    }

    override fun getMiningSpeedMultiplier(): Float {
        return 8.5f
    }

    override fun getAttackDamage(): Float {
        return 0.0f
    }

    override fun getMiningLevel(): Int {
        return 3
    }

    override fun getEnchantability(): Int {
        return 20
    }

    override fun getRepairIngredient(): Ingredient {
        return Ingredient.ofItems(ModItems.ruby)
    }

    //PickaxeItem, HoeItem and AxeItem have protected constructors, which means it needs its own sub-class with a public constructor:

    class CustomPickaxeItem(material: ToolMaterial?, attackDamage: Int, attackSpeed: Float, settings: Settings?) :
        PickaxeItem(material, attackDamage, attackSpeed, settings)

    class CustomAxeItem(material: ToolMaterial?, attackDamage: Float, attackSpeed: Float, settings: Settings) :
    AxeItem(material, attackDamage, attackSpeed, settings)

    class CustomHoeItem(material: ToolMaterial?, attackDamage: Int, attackSpeed: Float, settings: Settings) :
        HoeItem(material, attackDamage, attackSpeed, settings)

}