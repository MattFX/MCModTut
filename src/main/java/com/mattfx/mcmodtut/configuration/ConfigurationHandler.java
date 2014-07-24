package com.mattfx.mcmodtut.configuration;


import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        // Create the configuration object from the given configuration file
        Configuration configuration = new Configuration(configFile);

        try
        {
            // Load the configuration file
            configuration.load();

            //Read in properties from configuration file
            boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);
            //System.out.println("Configuration test: " + configValue);
        }
        catch (Exception e)
        {
            // Log the exception
        }
        finally
        {
            // Save the configuration file
            configuration.save();
        }
    }
}
