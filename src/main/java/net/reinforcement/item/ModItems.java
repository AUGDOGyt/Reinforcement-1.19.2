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

    //vanilla

    //sickles

    //maces
    public static final Item IRON_MACE = registerItem("iron_mace",
            new SwordItem(ToolMaterials.IRON, 4, -3f,
                    new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item GOLD_MACE = registerItem("gold_mace",
            new SwordItem(ToolMaterials.GOLD, 2, -3f,
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


        //hammers

    //echo
    public static final Item ECHO_INGOT = registerItem("echo_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item ECHO_CORE = registerItem("echo_core",
            new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item ECHO_HAMMER_HEAD = registerItem("echo_hammer_head",
            new Item(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));
    public static final Item ECHO_HAMMER = registerItem("echo_hammer",
            new SwordItem(ToolMaterials.NETHERITE, 9, -3.2f,
                    new FabricItemSettings().group(ModItemGroup.REINFORCEMENT)));

    public static  void registerModItems() {

        Reinforcement.LOGGER.debug("Registering Mod Items for " + Reinforcement.MOD_ID);

    }
    private static net.minecraft.item.Item registerItem(String name, net.minecraft.item.Item item){
        return Registry.register(Registry.ITEM, new Identifier(Reinforcement.MOD_ID, name), item);
    }
}
