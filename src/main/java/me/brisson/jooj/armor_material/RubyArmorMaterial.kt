package me.brisson.jooj.armor_material

import me.brisson.jooj.registry.ModItems
import net.minecraft.entity.EquipmentSlot
import net.minecraft.item.ArmorMaterial
import net.minecraft.recipe.Ingredient
import net.minecraft.sound.SoundEvent
import net.minecraft.sound.SoundEvents


class RubyArmorMaterial: ArmorMaterial {

    companion object {
        // item Order(helmet, chestplate, leggings, boots)
        private val PROTECTION_VALUES = intArrayOf(4, 7, 9, 4)
        private val BASE_DURABILITY = intArrayOf(13, 15, 16, 11)
    }

    override fun getDurability(slot: EquipmentSlot): Int {
        return BASE_DURABILITY[slot.entitySlotId] * 40
    }

    override fun getProtectionAmount(slot: EquipmentSlot): Int {
        return PROTECTION_VALUES[slot.entitySlotId]
    }

    override fun getEnchantability(): Int {
        return 15
    }

    override fun getEquipSound(): SoundEvent {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND
    }

    override fun getRepairIngredient(): Ingredient {
        return Ingredient.ofItems(ModItems.ruby)
    }

    override fun getName(): String {
        return "ruby"
    }

    override fun getToughness(): Float {
        return 3.0f
    }

    override fun getKnockbackResistance(): Float {
        return 0.1F
    }
}