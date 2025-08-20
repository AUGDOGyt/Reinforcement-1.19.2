package net.reinforcement.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.reinforcement.Reinforcement;

public class ModItems {

    //Crafting Items
    public static final Item REINFORCED_STICK = registerItem("reinforced_stick",
            new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item REINFORCED_HANDLE = registerItem("reinforced_handle",
            new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item REINFORCED_PLANK = registerItem("reinforced_plank",
            new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item REINFORCED_NETHERITE_INGOT = registerItem("reinforced_netherite_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item IRON_FIBRE = registerItem("iron_fibre",
            new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item COMPRESSED_DIAMOND = registerItem("compressed_diamond",
            new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));

    //spears
    public static final Item WOODEN_SPEAR = registerItem("wooden_spear",
            new SwordItem(ToolMaterials.WOOD, 2, -2.7f,
                new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item STONE_SPEAR = registerItem( "stone_spear",
            new SwordItem(ToolMaterials.STONE, 3, -2.7f,
                    new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item IRON_SPEAR = registerItem("iron_spear",
            new SwordItem(ToolMaterials.IRON, 4, -2.7f,
                new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item GOLD_SPEAR = registerItem("gold_spear",
            new SwordItem(ToolMaterials.GOLD, 3, -2.7f,
                new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item DIAMOND_SPEAR = registerItem("diamond_spear",
            new SwordItem(ToolMaterials.DIAMOND, 4, -2.7f,
                new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item NETHERITE_SPEAR = registerItem("netherite_spear",
            new SwordItem(ToolMaterials.NETHERITE, 5, -2.7f,
                new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item REINFORCED_NETHERITE_SPEAR = registerItem("reinforced_netherite_spear",
            new SwordItem(ToolMaterials.NETHERITE, 6, -2.7f,
            new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));

    //sabres
    public static final Item IRON_SABRE = registerItem("iron_sabre",
            new SwordItem(ToolMaterials.IRON, 3, -1.9f,
                    new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item GOLD_SABRE = registerItem("gold_sabre",
            new SwordItem(ToolMaterials.GOLD, 2, -1.9f,
                    new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item DIAMOND_SABRE = registerItem("diamond_sabre",
            new SwordItem(ToolMaterials.DIAMOND, 4, -1.9f,
                    new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item NETHERITE_SABRE = registerItem("netherite_sabre",
            new SwordItem(ToolMaterials.NETHERITE, 4, -1.9f,
                    new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item REINFORCED_NETHERITE_SABRE = registerItem("reinforced_netherite_sabre",
            new SwordItem(ToolMaterials.NETHERITE, 4, -1.9f,
                    new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));

    //vanilla weapons
    public static final Item REINFORCED_NETHERITE_SWORD = registerItem("reinforced_netherite_sword",
            new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item REINFORCED_NETHERITE_AXE = registerItem("reinforced_netherite_AXE",
            new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item REINFORCED_NETHERITE_PICKAXE = registerItem("reinforced_netherite_pickaxe",
            new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item REINFORCED_NETHERITE_SHOVEL = registerItem("reinforced_netherite_shovel",
            new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item REINFORCED_NETHERITE_HOE = registerItem("reinforced_netherite_hoe",
            new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item TOWER_SHIELD = registerItem("tower_shield",
            new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item HEAVY_CROSSBOW = registerItem("heavy_crossbow",
            new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));

    //vanilla armor
    public static final Item REINFORCED_NETHERITE_HELMET = registerItem("reinforced_netherite_helmet",
            new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item REINFORCED_NETHERITE_CHESTPLATE = registerItem("reinforced_netherite_chestplate",
            new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item REINFORCED_NETHERITE_LEGGINGS = registerItem("reinforced_netherite_leggings",
            new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item REINFORCED_NETHERITE_BOOTS = registerItem("reinforced_netherite_boots",
            new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));

    //sickles
    public static final Item WOODEN_SICKLE = registerItem("wooden_sickle",
            new SwordItem(ToolMaterials.WOOD, 2, -2.7f,
                new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item STONE_SICKLE = registerItem( "stone_SICKLE",
            new SwordItem(ToolMaterials.STONE, 3, -2.7f,
                    new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item IRON_SICKLE = registerItem("iron_sickle",
            new SwordItem(ToolMaterials.IRON, 4, -2.7f,
                new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item GOLD_SICKLE = registerItem("gold_sickle",
            new SwordItem(ToolMaterials.GOLD, 3, -2.5f,
                new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item DIAMOND_SICKLE = registerItem("diamond_sickle",
            new SwordItem(ToolMaterials.DIAMOND, 4, -2.7f,
                new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item NETHERITE_SICKLE = registerItem("netherite_sickle",
            new SwordItem(ToolMaterials.NETHERITE, 5, -2.7f,
                new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item REINFORCED_NETHERITE_SICKLE = registerItem("reinforced_netherite_sickle",
            new SwordItem(ToolMaterials.NETHERITE, 6, -2.7f,
            new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));

    //scythes
    public static final Item WOODEN_SCYTHE = registerItem("wooden_scythe",
        new SwordItem(ToolMaterials.WOOD, 3, -2.2f,
                new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item STONE_SCYTHE = registerItem("stone_scythe",
        new SwordItem(ToolMaterials.STONE, 4, -2.2f,
                new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item IRON_SCYTHE = registerItem("iron_scythe",
        new SwordItem(ToolMaterials.IRON, 5, -2.2f,
                new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item GOLDEN_SCYTHE = registerItem("golden_scythe",
        new SwordItem(ToolMaterials.GOLD, 4, -2.0f,
                new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item DIAMOND_SCYTHE = registerItem("diamond_scythe",
        new SwordItem(ToolMaterials.DIAMOND, 5, -2.2f,
                new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item NETHERITE_SCYTHE = registerItem("netherite_scythe",
        new SwordItem(ToolMaterials.NETHERITE, 6, -2.2f,
                new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item REINFORCED_NETHERITE_SCYTHE = registerItem("reinforced_netherite_scythe",
        new SwordItem(ToolMaterials.NETHERITE, 8, -2.2f,
                new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));

    //maces
    public static final Item IRON_MACE = registerItem("iron_mace",
            new SwordItem(ToolMaterials.IRON, 4, -3f,
                    new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item GOLD_MACE = registerItem("gold_mace",
            new SwordItem(ToolMaterials.GOLD, 2, -2.8f,
                    new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item DIAMOND_MACE = registerItem("diamond_mace",
            new SwordItem(ToolMaterials.DIAMOND, 5, -3f,
                    new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item NETHERITE_MACE = registerItem("netherite_mace",
            new SwordItem(ToolMaterials.NETHERITE, 6, -3f,
                    new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item REINFORCED_NETHERITE_MACE = registerItem("reinforced_netherite_mace",
            new SwordItem(ToolMaterials.NETHERITE, 8, -3f,
                    new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    //hammer
        //hammer heads
        public static final Item WOODEN_HAMMER_HEAD = registerItem("wooden_hammer_head",
                new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
        public static final Item STONE_HAMMER_HEAD = registerItem("stone_hammer_head",
                new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
        public static final Item GOLDEN_HAMMER_HEAD = registerItem("golden_hammer_head",
                new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
        public static final Item IRON_HAMMER_HEAD = registerItem("iron_hammer_head",
                new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
        public static final Item DIAMOND_HAMMER_HEAD = registerItem("diamond_hammer_head",
                new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
        public static final Item NETHERITE_HAMMER_HEAD = registerItem("netherite_hammer_head",
                new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
        public static final Item REINFORCED_NETHERITE_HAMMER_HEAD = registerItem("reinforced_netherite_hammer_head",
                new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
        //hammers complete
        public static final Item WOODEN_HAMMER = registerItem("wooden_hammer",
                new SwordItem(ToolMaterials.WOOD, 4, -3.8f,
                        new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
        public static final Item STONE_HAMMER = registerItem("stone_hammer",
                new SwordItem(ToolMaterials.STONE, 5, -3.8f,
                        new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
        public static final Item IRON_HAMMER = registerItem("iron_hammer",
                new SwordItem(ToolMaterials.IRON, 6, -3.8f,
                        new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
        public static final Item GOLDEN_HAMMER = registerItem("golden_hammer",
                new SwordItem(ToolMaterials.GOLD, 4, -3.5f,
                        new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
        public static final Item DIAMOND_HAMMER = registerItem("diamond_hammer",
                new SwordItem(ToolMaterials.DIAMOND, 7, -3.8f,
                        new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
        public static final Item NETHERITE_HAMMER = registerItem("netherite_hammer",
                new SwordItem(ToolMaterials.NETHERITE, 8, -3.8f,
                        new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
        public static final Item REINFORCED_NETHERITE_HAMMER = registerItem("reinforced_netherite_hammer",
                new SwordItem(ToolMaterials.NETHERITE, 8, -3.8f,
                        new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));

    /*echo
    public static final Item ECHO_INGOT = registerItem("echo_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item ECHO_CORE = registerItem("echo_core",
            new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item ECHO_HAMMER_HEAD = registerItem("echo_hammer_head",
            new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item ECHO_RIFLE_COOLING_CHAMBER = registerItem("echo_rifle_cooling_chamber",
            new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item ECHO_RIFLE_CHASSIS = registerItem("echo_rifle_chassis",
            new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item ECHO_GLAIVE_STAFF = registerItem("echo_glaive_staff",
            new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item ECHO_GLAIVE_HEAD = registerItem("echo_glaive_head",
            new Item(new FabricItemSettings().group(ModITemGroup.REINFORCEMENT)));
    public static final Item ECHO_HAMMER = registerItem("echo_hammer",
            new SwordItem(ToolMaterials.NETHERITE, 9, -3.2f,
                    new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item ECHO_GLAIVE = registerItem("echo_glaive",
            new SwordItem(ToolMaterials.NETHERITE, 7, -1.9f,
                    new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item ECHO_RIFLE = registerItem("echo_rifle",
            new BowItem(ToolMaterials.NETHERITE, 10, -4.5f,
                    new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));*/

    public static  void registerModItems() {

        Reinforcement.LOGGER.debug("Registering Mod Items for " + Reinforcement.MOD_ID);

    }
    private static net.minecraft.item.Item registerItem(String name, net.minecraft.item.Item item){
        return Registry.register(Registry.ITEM, new Identifier(Reinforcement.MOD_ID, name), item);
    }
}
