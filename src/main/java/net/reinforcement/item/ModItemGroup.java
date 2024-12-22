package net.reinforcement.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.reinforcement.Reinforcement;


public class ModItemGroup {
    public static final ItemGroup REINFORCEMENT = FabricItemGroupBuilder.build(new net.minecraft.util.Identifier(Reinforcement.MOD_ID, "reinforcement"), () -> new ItemStack(ModItems.WOODEN_SPEAR));


}
