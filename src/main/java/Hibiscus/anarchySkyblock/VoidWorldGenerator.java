package Hibiscus.anarchySkyblock;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.generator.WorldInfo;

import java.util.Random;

public class VoidWorldGenerator extends ChunkGenerator {

    @Override
    public void generateNoise(WorldInfo worldInfo, Random random, int chunkX, int chunkZ, ChunkData chunkData) {
        // Generate absolutely nothing - leave it all as air
        // The ChunkData is already initialized with air blocks by default

        // If you wanted to add a single block at spawn (0,0) for reference:
        // if (chunkX == 0 && chunkZ == 0) {
        //     chunkData.setBlock(0, 64, 0, Material.GRASS_BLOCK);
        // }
    }
}