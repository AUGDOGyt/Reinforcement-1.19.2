package net.reinforcement.item;

import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import java.util.function.Predicate;


public class ModScytheItem extends SwordItem {
    public ModScytheItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings)
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state)
}
