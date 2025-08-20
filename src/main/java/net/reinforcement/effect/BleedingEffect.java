package net.reinforcement.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;

import static net.minecraft.entity.effect.StatusEffects.*;

public class BleedingEffect extends StatusEffect {
    protected BleedingEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (this == CustomEffects.BLEEDING) {

        }
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        if (this == CustomEffects.BLEEDING) {
            int i = 50 >> amplifier;
            if (i > 0) {
                return duration % i == 0;
            }
                return true;
            }
            return false;
        }


    public void onApplied(LivingEntity entity, AttributeContainer attributes, int amplifier) {
        entity.addStatusEffect(new StatusEffectInstance(POISON));

    }
}