package com.mooose.medievalwar.handler;

import com.mooose.medievalwar.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Drew on 7/31/2014.
 */
public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;
    public static void init(File configFile)
    {

        boolean configValue = false;
       if(configuration == null)
       {
           configuration = new Configuration(configFile);
           loadConfiguration();

       }
    }
    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            //resync configs

        }
    }

    private static void loadConfiguration()
    {
        testValue = configuration.getBoolean("configValue",Configuration.CATEGORY_GENERAL,false, "This is an example config value.");

        if(configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
