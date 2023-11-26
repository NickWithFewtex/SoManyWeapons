package net.mrnick.somanyweapons;

import net.fabricmc.api.ModInitializer;

import net.mrnick.somanyweapons.item.ModItemGroups;
import net.mrnick.somanyweapons.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SoManyWeapons implements ModInitializer {
	public static final String MOD_ID = "somanyweapons";
    public static final Logger LOGGER = LoggerFactory.getLogger("somanyweapons");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();

		LOGGER.info("Hello Fabric world!");
	}
}