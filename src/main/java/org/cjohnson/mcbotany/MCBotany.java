package org.cjohnson.mcbotany;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class MCBotany extends JavaPlugin {
    public static final Logger logger = Logger.getLogger("Minecraft");

    @Override
    public void onEnable() {
        logger.info("Starting MCBotany Initialization...");
    }

    @Override
    public void onDisable() {
        logger.info("Disabling MCBotany...");
    }
}
