package com.tvitser.gardenofgrind;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        // Register the custom world type
        WorldTypeGardenOfGrind.INSTANCE = new WorldTypeGardenOfGrind();
        GardenOfGrind.LOG.info("Garden Of Grind world type registered");
    }

    public void init(FMLInitializationEvent event) {
        // Initialization logic
    }

    public void postInit(FMLPostInitializationEvent event) {
        // Post-initialization logic
    }

    public void serverStarting(FMLServerStartingEvent event) {
        // Server starting logic
    }
}
