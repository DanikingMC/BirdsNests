package daniking.birdsnests.common.registry;

import net.minecraft.item.ItemStack;

public class LootEntry {

    public int minCount;
    public int maxCount;
    public ItemStack stack;

    public LootEntry(int minCount, int maxCount, ItemStack stack){
        this.minCount = minCount;
        this.maxCount = maxCount;
        this.stack = stack;
    }

}
