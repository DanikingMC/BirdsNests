package daniking.birdsnests.common.registry;

import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.ConstantLootTableRange;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;

public class ModLootTables {

    private static final Identifier OAK_LEAVES_LOOT_TABLE_ID = new Identifier("minecraft", "blocks/oak_leaves");
    private static final Identifier SPRUCE_LEAVES_LOOT_TABLE_ID = new Identifier("minecraft", "blocks/spruce_leaves");
    private static final Identifier BIRCH_LEAVES_LOOT_TABLE_ID = new Identifier("minecraft", "blocks/birch_leaves");
    private static final Identifier JUNGLE_LEAVES_LOOT_TABLE_ID = new Identifier("minecraft", "blocks/jungle_leaves");
    private static final Identifier ACACIA_LEAVES_LOOT_TABLE_ID = new Identifier("minecraft", "blocks/acacia_leaves");
    private static final Identifier DARK_OAK_LEAVES_LOOT_TABLE_ID = new Identifier("minecraft", "blocks/dark_oak_leaves");

    private static void modifyLootTables() {
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
            if (OAK_LEAVES_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootTableRange.create(1))
                        .withCondition(RandomChanceLootCondition.builder(0.1F).build())
                        .withEntry(ItemEntry.builder(ModRegistry.BIRD_NEST).build());
                supplier.withPool(poolBuilder.build());

            }if (SPRUCE_LEAVES_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootTableRange.create(1))
                        .withCondition(RandomChanceLootCondition.builder(0.1F).build())
                        .withEntry(ItemEntry.builder(ModRegistry.BIRD_NEST).build());
                supplier.withPool(poolBuilder.build());

            }if (BIRCH_LEAVES_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootTableRange.create(1))
                        .withCondition(RandomChanceLootCondition.builder(0.1F).build())
                        .withEntry(ItemEntry.builder(ModRegistry.BIRD_NEST).build());
                supplier.withPool(poolBuilder.build());

            }if (JUNGLE_LEAVES_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootTableRange.create(1))
                        .withCondition(RandomChanceLootCondition.builder(0.1F).build())
                        .withEntry(ItemEntry.builder(ModRegistry.BIRD_NEST).build());
                supplier.withPool(poolBuilder.build());

            }if (ACACIA_LEAVES_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootTableRange.create(1))
                        .withCondition(RandomChanceLootCondition.builder(0.1F).build())
                        .withEntry(ItemEntry.builder(ModRegistry.BIRD_NEST).build());
                supplier.withPool(poolBuilder.build());

            }if (DARK_OAK_LEAVES_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootTableRange.create(1))
                        .withCondition(RandomChanceLootCondition.builder(0.1F).build())
                        .withEntry(ItemEntry.builder(ModRegistry.BIRD_NEST).build());
                supplier.withPool(poolBuilder.build());
            }
        });
    }

    public static void init(){
        modifyLootTables();
    }
}
