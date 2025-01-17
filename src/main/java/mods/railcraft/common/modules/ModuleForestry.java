/*
 * Copyright (c) CovertJaguar, 2014 http://railcraft.info This code is the property of CovertJaguar and may only be used
 * with explicit written permission unless otherwise specified on the license page at
 * http://railcraft.info/wiki/info:license.
 */
package mods.railcraft.common.modules;

import mods.railcraft.common.plugins.forestry.ForestryPlugin;
import cpw.mods.fml.common.Optional;

/**
 * @author CovertJaguar <http://www.railcraft.info>
 */
public class ModuleForestry extends RailcraftModule {

    @Override
    public boolean canModuleLoad() {
        return ForestryPlugin.isForestryInstalled();
    }

    @Override
    @Optional.Method(modid = "Forestry")
    public void initSecond() {
        ForestryPlugin.instance().registerBackpacks();
    }

    @Override
    @Optional.Method(modid = "Forestry")
    public void postInit() {
        ForestryPlugin.instance().setupBackpackContents();
    }
}
