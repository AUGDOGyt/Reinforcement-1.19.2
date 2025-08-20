package net.reinforcement.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.reinforcement.Reinforcement;

public class CustomEffects {

    public static StatusEffect DISORIENTED;
    public static StatusEffect BLEEDING;

    public static StatusEffect registerBleedingEffect

    public static StatusEffect registerDisorientedEffect(String name){
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(Reinforcement.MOD_ID, name),
                new DisorientedEffect(StatusEffectCategory.HARMFUL, 1582940));
    }

    public static void registerEffects(){
        DISORIENTED = registerDisorientedEffect("disoriented");
    }

}