public class FrostEnchantment extends Enchantment {
    public FrostEnchantment() {
        super(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[] {EquipmentSlot.MAINHAND});
    }
}

@Override
public int getMinPower(int level) {
    return 1;
}

@Override
public int getMaxLevel() {
    return 3;
}

@Override 
public void onTargetDamaged(LivingEntity user, Entity target, int level) {
    if(target instanceof LivingEntity livingEntity) {
        livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffect.SLOWNESS, 20 * 2 * level, level - 1));
    }

    super.onTargetDamaged(user,target,level);

}

