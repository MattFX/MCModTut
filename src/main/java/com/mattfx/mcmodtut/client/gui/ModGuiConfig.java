package com.mattfx.mcmodtut.client.gui;

import com.mattfx.mcmodtut.handler.ConfigurationHandler;
import com.mattfx.mcmodtut.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.List;


public class ModGuiConfig extends GuiConfig
{
    //only one constructor
    public ModGuiConfig(GuiScreen guiScreen)
    {
        //calls parents constructor
        //go to its definition to see what everything is
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), //list of config elements
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }

}
