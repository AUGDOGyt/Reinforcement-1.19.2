package net.reinforcement.item;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class SharpItem extends SwordItem {

    public SharpItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
}
