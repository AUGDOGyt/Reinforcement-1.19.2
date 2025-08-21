package net.reinforcement;

import net.fabricmc.api.ModInitializer;

import net.reinforcement.effect.CustomEffects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Reinforcement implements ModInitializer {
	public static final String MOD_ID = "reinforcement";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		net.reinforcement.item.ModItems.registerModItems();
		CustomEffects.registerEffects();

	}
}