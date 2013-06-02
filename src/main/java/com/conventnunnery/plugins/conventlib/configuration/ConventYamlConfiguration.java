package com.conventnunnery.plugins.conventlib.configuration;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.IOException;

public class ConventYamlConfiguration extends YamlConfiguration {

    private final File file;

    /**
     * Instantiates a new ConventYamlConfiguration.
     *
     * @param file File to use as the basis
     */
    public ConventYamlConfiguration(File file) {
        super();
        this.file = file;
    }

    /**
     * Instantiates a new ConventYamlConfiguration.
     *
     * @param plugin Plugin that the file is used by
     * @param filename Name of the file used by the plugin
     */
    public ConventYamlConfiguration(Plugin plugin, String filename) {
        this(new File(plugin.getDataFolder(), filename));
    }

    /**
     * Loads the file specified by the constructor.
     * @return if the file was correctly loaded
     */
    public boolean load() {
        try {
            load(file);
            return true;
        } catch (Exception e) {
            Bukkit.getLogger().severe(e.getMessage());
            return false;
        }
    }

    /**
     * Saves the file specified by the constructor.
     * @return if the file was correctly saved
     */
    public boolean save() {
        try {
            save(file);
            return true;
        } catch (IOException e) {
            Bukkit.getLogger().severe(e.getMessage());
            return false;
        }
    }

}
