package com.mooose.medievalwar.init;

import com.mooose.medievalwar.item.ItemCommandFlag;
import com.mooose.medievalwar.item.ItemMW;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Drew on 8/1/2014.
 */
public class ModItems
{
    public static final ItemMW commandFlag = new ItemCommandFlag();

    public static void init()
    {
        GameRegistry.registerItem(commandFlag, "commandFlag");
    }
}
