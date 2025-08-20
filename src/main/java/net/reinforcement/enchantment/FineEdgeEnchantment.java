public class FineEdgeEnchantment extends Enchantment {
    public FineEdgeEnchantment() {
        super(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.SwordItem, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }
}

@Override
public int getMinPower(int level) {
    return 5;
}

@Override
public int getMaxLevel() {
    return 1;
}

public void onTargetDamaged(LivingEntity user, Entity target, int level) {
    if(target instanceof LivingEntity livingEntity) {
        livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffect.BLEEDING, 10));
    }

    super.onTargetDamaged(user,target,level);

}
