package net.reinforcement.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;

public class echoHammer extends Item {

    @Override
    public boolean isDamageable() {
        return super.isDamageable();
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        return super.postHit(stack, target, attacker);
    }

    public echoHammer() {
        super(new FabricItemSettings().group(ModItemGroup.REINFORCEMENT).rarity(Rarity.EPIC));
    }
}
