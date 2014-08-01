package com.mattfx.mcmodtut;

import com.mattfx.mcmodtut.handler.ConfigurationHandler;
import com.mattfx.mcmodtut.init.ModItems;
import com.mattfx.mcmodtut.proxy.IProxy;
import com.mattfx.mcmodtut.reference.Reference;
import com.mattfx.mcmodtut.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class MCModTut {

    @Mod.Instance(Reference.MOD_ID)
    public static MCModTut instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialisation Complete!");

        ModItems.init();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialisation Complete!");

    }

    @Mod.EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialisation Complete!");

    }
}
