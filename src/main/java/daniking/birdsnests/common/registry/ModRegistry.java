package daniking.birdsnests.common.registry;

import daniking.birdsnests.common.BirdsNests;
import daniking.birdsnests.common.item.BirdNestItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRegistry {

    public static final Item BIRD_NEST = new BirdNestItem(new FabricItemSettings().group(ItemGroup.MISC).maxCount(1));

    public static void init(){
        Registry.register(Registry.ITEM, new Identifier(BirdsNests.MODID, "bird_nest"), BIRD_NEST);
    }
}
