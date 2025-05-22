package ru.destroy.logfilter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public final class LogFilter extends JavaPlugin {

    @Override
    public void onEnable() {
        Logger log4jLogger = (Logger) LogManager.getRootLogger();

        log4jLogger.addFilter(new CustomFilter());

        getLogger().info("Log4j filter applied!");
    }

    @Override
    public void onDisable() {
        // dad ad ad
    }
}
