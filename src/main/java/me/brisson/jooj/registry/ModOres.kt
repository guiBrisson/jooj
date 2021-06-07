package me.brisson.jooj.registry

import me.brisson.jooj.Jooj
import net.fabricmc.fabric.api.biome.v1.BiomeModifications
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors
import net.minecraft.util.Identifier
import net.minecraft.util.registry.BuiltinRegistries
import net.minecraft.util.registry.Registry
import net.minecraft.util.registry.RegistryKey
import net.minecraft.world.gen.GenerationStep
import net.minecraft.world.gen.decorator.Decorator
import net.minecraft.world.gen.decorator.RangeDecoratorConfig
import net.minecraft.world.gen.feature.ConfiguredFeature
import net.minecraft.world.gen.feature.Feature
import net.minecraft.world.gen.feature.OreFeatureConfig


class ModOres {

    fun registerOres() {
        val rubyOreConfiguredFeature: RegistryKey<ConfiguredFeature<*, *>> = RegistryKey.of(
            Registry.CONFIGURED_FEATURE_WORLDGEN,
            Identifier(Jooj.MOD_ID, "ruby_ore")
        )
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, rubyOreConfiguredFeature.value, rubyOre)
        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Feature.UNDERGROUND_ORES,
            rubyOreConfiguredFeature
        )

    }

    companion object {
        val rubyOre: ConfiguredFeature<*, *> = Feature.ORE
            .configure(
                OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.rubyOre.defaultState,
                    4 // vein size
                )
            )
            .decorate(
                Decorator.RANGE.configure(
                    RangeDecoratorConfig(0, 30, 64)
                )
            )
            .spreadHorizontally()
            .repeat(2) // number of veins per chunk
    }

}