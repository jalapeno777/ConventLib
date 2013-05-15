package com.conventnunnery.plugins.conventlib.configuration;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class ConventYamlConfiguration extends YamlConfiguration {

    private final File file;

    public ConventYamlConfiguration(File file) {
        super();
        this.file = file;
    }

    public boolean load() {
        try {
            load(file);
            return true;
        } catch (Exception e) {
            Bukkit.getLogger().severe(e.getMessage());
            return false;
        }
    }

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
