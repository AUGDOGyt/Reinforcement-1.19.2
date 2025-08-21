package net.reinforcement.item;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class BluntItem extends SwordItem {

    public BluntItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
}