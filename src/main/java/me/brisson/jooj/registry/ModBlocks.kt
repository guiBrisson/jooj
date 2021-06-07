package me.brisson.jooj.registry

import me.brisson.jooj.Jooj
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags
import net.minecraft.block.Block
import net.minecraft.block.Material
import net.minecraft.sound.BlockSoundGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry


class ModBlocks {

    fun registerBlocks() {
        Registry.register(Registry.BLOCK, Identifier(Jooj.MOD_ID, "ruby_block"), rubyBlock)
        Registry.register(Registry.BLOCK, Identifier(Jooj.MOD_ID, "ruby_ore"), rubyOre)
    }

    companion object {
        val rubyBlock = Block(FabricBlockSettings
                .of(Material.METAL)
                .breakByTool(FabricToolTags.PICKAXES, 2)
                .strength(5.0f, 30.0f)
                .sounds(BlockSoundGroup.METAL))

        val rubyOre = Block(FabricBlockSettings
                .of(Material.STONE)
                .requiresTool()
                .breakByTool(FabricToolTags.PICKAXES, 2)
                .strength(3.0f, 15.0f)
                .sounds(BlockSoundGroup.STONE))

    }
}