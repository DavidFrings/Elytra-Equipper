package de.coolertyp99;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElytraEquipper implements ModInitializer {
	public static final String MOD_ID = "elytra-equipper";
    public static final Logger LOGGER = LoggerFactory.getLogger("elytra-equipper");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}