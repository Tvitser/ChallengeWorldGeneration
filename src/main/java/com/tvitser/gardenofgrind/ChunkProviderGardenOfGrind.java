package com.tvitser.gardenofgrind;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;

/**
 * Custom chunk provider that generates absolutely nothing - no blocks, no structures.
 * Only biome information will be present.
 */
public class ChunkProviderGardenOfGrind implements IChunkProvider {
    private World worldObj;
    private Random random;

    public ChunkProviderGardenOfGrind(World world) {
        this.worldObj = world;
        this.random = new Random(world.getSeed());
    }

    @Override
    public boolean chunkExists(int chunkX, int chunkZ) {
        return true;
    }

    @Override
    public Chunk provideChunk(int chunkX, int chunkZ) {
        // Create an empty chunk with no blocks
        Chunk chunk = new Chunk(this.worldObj, chunkX, chunkZ);
        
        // Set biome data - this will be populated by the WorldChunkManager
        byte[] biomeArray = chunk.getBiomeArray();
        BiomeGenBase[] biomes = this.worldObj.getWorldChunkManager().loadBlockGeneratorData(null, chunkX * 16, chunkZ * 16, 16, 16);
        for (int i = 0; i < biomeArray.length; i++) {
            biomeArray[i] = (byte) biomes[i].biomeID;
        }
        
        chunk.generateSkylightMap();
        return chunk;
    }

    @Override
    public Chunk loadChunk(int chunkX, int chunkZ) {
        return this.provideChunk(chunkX, chunkZ);
    }

    @Override
    public void populate(IChunkProvider chunkProvider, int chunkX, int chunkZ) {
        // No population - no structures, no ores, nothing
    }

    @Override
    public boolean saveChunks(boolean saveAll, IProgressUpdate progressUpdate) {
        return true;
    }

    @Override
    public boolean unloadQueuedChunks() {
        return false;
    }

    @Override
    public boolean canSave() {
        return true;
    }

    @Override
    public String makeString() {
        return "GardenOfGrindRandomLevelSource";
    }

    @Override
    public List getPossibleCreatures(EnumCreatureType creatureType, int x, int y, int z) {
        BiomeGenBase biome = this.worldObj.getBiomeGenForCoords(x, z);
        return biome.getSpawnableList(creatureType);
    }

    @Override
    public ChunkPosition func_147416_a(World world, String structureName, int x, int y, int z) {
        // No structures in this world type
        return null;
    }

    @Override
    public int getLoadedChunkCount() {
        return 0;
    }

    @Override
    public void recreateStructures(int chunkX, int chunkZ) {
        // No structures to recreate
    }

    @Override
    public void saveExtraData() {
        // No extra data to save
    }
}
