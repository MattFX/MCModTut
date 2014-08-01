package com.mattfx.mcmodtut.init;

import com.mattfx.mcmodtut.item.ItemMCMT;
import com.mattfx.mcmodtut.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Matthias on 1/08/2014.
 */
public class ModItems {

    public static final ItemMCMT mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
