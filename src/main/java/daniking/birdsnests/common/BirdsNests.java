package daniking.birdsnests.common;

import daniking.birdsnests.common.registry.ModLootTables;
import daniking.birdsnests.common.registry.ModRegistry;
import net.fabricmc.api.ModInitializer;

public class BirdsNests implements ModInitializer {

    public static final String MODID = "birdsnests";

    @Override
    public void onInitialize() {
        ModRegistry.init();
        ModLootTables.init();
    }
}
