package com.tvitser.gardenofgrind;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldTypeGardenOfGrind extends WorldType {
    public static WorldTypeGardenOfGrind INSTANCE;

    public WorldTypeGardenOfGrind() {
        super("GARDENOFGRIND");
    }

    @Override
    public String getTranslateName() {
        return "Garden Of Grind";
    }

    @Override
    public IChunkProvider getChunkGenerator(World world, String generatorOptions) {
        return new ChunkProviderGardenOfGrind(world);
    }

    @Override
    public WorldChunkManager getChunkManager(World world) {
        // Try to use RWG biome provider if available, otherwise use default
        try {
            // Attempt to load RWG biome provider
            Class<?> rwgClass = Class.forName("rwg.world.WorldTypeRWG");
            if (rwgClass != null) {
                // RWG is available, try to use its biome provider
                Class<?> biomeProviderClass = Class.forName("rwg.world.biome.WorldChunkManagerRWG");
                if (biomeProviderClass != null) {
                    return (WorldChunkManager) biomeProviderClass.getConstructor(World.class).newInstance(world);
                }
            }
        } catch (Exception e) {
            // RWG not available or failed to load, fall back to default
            System.out.println("[Garden Of Grind] RWG not found or failed to load, using default biome provider");
        }
        
        // Fallback to default vanilla biome provider
        return world.provider.worldChunkMgr;
    }
}
