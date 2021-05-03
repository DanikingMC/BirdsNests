package daniking.birdsnests.common.item;

import daniking.birdsnests.common.registry.LootEntry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BirdNestItem extends Item {

    List<LootEntry>lootList = new ArrayList<>();
    List<LootEntry>lootList2 = new ArrayList<>();


    public BirdNestItem(Settings settings) {
        super(settings);
        handleLoot();
        handleSecondLoot();
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        ItemStack stack = user.getStackInHand(hand);

        if (!user.abilities.creativeMode){
            stack.decrement(1);//Removes the nest
        }

        world.playSound(user, user.getX(), user.getY(), user.getZ(), SoundEvents.BLOCK_GRASS_BREAK, SoundCategory.NEUTRAL, 0.5F, 0.4F);

        if (!world.isClient){
            Random random = new Random();
            LootEntry loot = lootList.get(random.nextInt(lootList.size()));
            ItemStack lootStack = loot.stack;
            lootStack.setCount(random.nextInt(loot.maxCount - loot.minCount + 1) + loot.minCount);
            user.inventory.insertStack(lootStack);

            LootEntry loot2 = lootList2.get(random.nextInt(lootList2.size()));
            ItemStack lootStack2 = loot2.stack;
            lootStack2.setCount(random.nextInt(loot.maxCount - loot.minCount + 1) + loot.minCount);

            if(lootStack2 != lootStack) {
                if (lootStack2.getItem() != Items.DIAMOND) {
                    user.inventory.insertStack(lootStack2);
                }
            }

        }

        return TypedActionResult.success(stack);
    }
    public void handleLoot(){
                                    //----First Loot----//
        lootList.add(new LootEntry(1,2, new ItemStack(Items.STRING)));
        lootList.add(new LootEntry(1,4, new ItemStack(Items.STICK)));
        lootList.add(new LootEntry(1,2, new ItemStack(Items.FLINT)));
        lootList.add(new LootEntry(1,2, new ItemStack(Items.BONE)));
        lootList.add(new LootEntry(1,3, new ItemStack(Items.FEATHER)));
        lootList.add(new LootEntry(1,3, new ItemStack(Items.WHEAT_SEEDS)));
        lootList.add(new LootEntry(1,3, new ItemStack(Items.MELON_SEEDS)));
        lootList.add(new LootEntry(1,3, new ItemStack(Items.PUMPKIN_SEEDS)));
        lootList.add(new LootEntry(1,3, new ItemStack(Items.BEETROOT_SEEDS)));
        lootList.add(new LootEntry(1,5, new ItemStack(Items.IRON_NUGGET)));
        lootList.add(new LootEntry(1,3, new ItemStack(Items.GOLD_NUGGET)));
        lootList.add(new LootEntry(1,2, new ItemStack(Items.COCOA_BEANS)));
        lootList.add(new LootEntry(1,2, new ItemStack(Items.WHEAT)));
        lootList.add(new LootEntry(1,3, new ItemStack(Items.EGG)));
        lootList.add(new LootEntry(1,3, new ItemStack(Items.REDSTONE)));
        lootList.add(new LootEntry(1,2, new ItemStack(Items.IRON_INGOT)));
        lootList.add(new LootEntry(1,2, new ItemStack(Items.GOLD_INGOT)));
        lootList.add(new LootEntry(1,3, new ItemStack(Items.GUNPOWDER)));
        lootList.add(new LootEntry(1,2, new ItemStack(Items.PAPER)));
        lootList.add(new LootEntry(1,2, new ItemStack(Items.INK_SAC)));
        lootList.add(new LootEntry(1,2, new ItemStack(Items.SALMON)));
        lootList.add(new LootEntry(1,2, new ItemStack(Items.LEATHER)));
        lootList.add(new LootEntry(1,3, new ItemStack(Items.CLAY_BALL)));
        lootList.add(new LootEntry(1,2, new ItemStack(Items.GLOWSTONE_DUST)));
        lootList.add(new LootEntry(1,2, new ItemStack(Items.GLASS_BOTTLE)));

                //Only 1 for diamonds, emeralds
        lootList.add(new LootEntry(1,1, new ItemStack(Items.EMERALD)));
        lootList.add(new LootEntry(1,1, new ItemStack(Items.DIAMOND)));
    }

    public void handleSecondLoot(){
                                    //----Second Loot----//
        lootList2.add(new LootEntry(1,2, new ItemStack(Items.STRING)));
        lootList2.add(new LootEntry(1,4, new ItemStack(Items.STICK)));
        lootList2.add(new LootEntry(1,2, new ItemStack(Items.FLINT)));
        lootList2.add(new LootEntry(1,2, new ItemStack(Items.BONE)));
        lootList2.add(new LootEntry(1,3, new ItemStack(Items.FEATHER)));
        lootList2.add(new LootEntry(1,3, new ItemStack(Items.WHEAT_SEEDS)));
        lootList2.add(new LootEntry(1,3, new ItemStack(Items.MELON_SEEDS)));
        lootList2.add(new LootEntry(1,3, new ItemStack(Items.PUMPKIN_SEEDS)));
        lootList2.add(new LootEntry(1,3, new ItemStack(Items.EGG)));
        lootList2.add(new LootEntry(1,3, new ItemStack(Items.REDSTONE)));
        lootList2.add(new LootEntry(1,2, new ItemStack(Items.IRON_INGOT)));
        lootList2.add(new LootEntry(1,2, new ItemStack(Items.GOLD_INGOT)));
        lootList2.add(new LootEntry(1,3, new ItemStack(Items.GUNPOWDER)));
        lootList2.add(new LootEntry(1,2, new ItemStack(Items.PAPER)));
        lootList2.add(new LootEntry(1,2, new ItemStack(Items.INK_SAC)));
        lootList2.add(new LootEntry(1,2, new ItemStack(Items.SALMON)));
        lootList2.add(new LootEntry(1,2, new ItemStack(Items.LEATHER)));
        lootList2.add(new LootEntry(1,3, new ItemStack(Items.CLAY_BALL)));
        lootList2.add(new LootEntry(1,2, new ItemStack(Items.GLOWSTONE_DUST)));
        lootList2.add(new LootEntry(1,2, new ItemStack(Items.GLASS_BOTTLE)));

        lootList2.add(new LootEntry(1,3, new ItemStack(Items.BEETROOT_SEEDS)));
        lootList2.add(new LootEntry(1,5, new ItemStack(Items.IRON_NUGGET)));
        lootList2.add(new LootEntry(1,3, new ItemStack(Items.GOLD_NUGGET)));
        lootList2.add(new LootEntry(1,2, new ItemStack(Items.COCOA_BEANS)));
        lootList2.add(new LootEntry(1,2, new ItemStack(Items.WHEAT)));
                        //Neither diamonds or emeralds for second loot

    }

}
