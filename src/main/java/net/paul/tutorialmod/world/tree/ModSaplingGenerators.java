package net.paul.tutorialmod.world.tree;

import net.minecraft.block.SaplingGenerator;
import net.paul.tutorialmod.TutorialMod;
import net.paul.tutorialmod.world.ModConfiguredFeatures;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator DRIFTWOOD = new SaplingGenerator(TutorialMod.MOD_ID + ":driftwood",
            Optional.empty(), Optional.of(ModConfiguredFeatures.DRIFTWOOD_KEY), Optional.empty());
}
