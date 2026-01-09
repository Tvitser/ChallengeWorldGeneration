package com.tvitser.gardenofgrind;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.DimensionManager;

@Mod(modid = GardenOfGrind.MODID, name = GardenOfGrind.NAME, version = GardenOfGrind.VERSION)
public class GardenOfGrind {
    public static final String MODID = "gardenofgrind";
    public static final String NAME = "Garden Of Grind";
    public static final String VERSION = "1.0.0";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // Register the custom world type
        WorldTypeGardenOfGrind.INSTANCE = new WorldTypeGardenOfGrind();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // Initialization logic
    }
}
