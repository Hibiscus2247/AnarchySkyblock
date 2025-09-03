package Hibiscus.anarchySkyblock;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public final class AnarchySkyblock extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Skyblock plugin enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Skyblock plugin disabled!");
    }

    // This method tells Bukkit to use your custom generator
    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new VoidWorldGenerator();
    }
}
