package org.burgerbude.labymod.addons.example;

import net.labymod.api.LabyModAddon;
import net.labymod.settings.elements.SettingsElement;

import java.util.List;

/**
 * An example addon
 */
public class ExampleAddon extends LabyModAddon {

    /**
     * Called when the addon gets enabled
     */

    @Override
    public void onEnable() {

    }

    /**
     * Called when this addon's configuration was loaded and is ready to use
     */

    @Override
    public void loadConfig() {

    }

    /**
     * Called when the addon's ingame settings should be filled
     *
     * @param subSettings a list containing the addon's setting' elements
     */

    @Override
    protected void fillSettings(List<SettingsElement> subSettings) {

    }
}
