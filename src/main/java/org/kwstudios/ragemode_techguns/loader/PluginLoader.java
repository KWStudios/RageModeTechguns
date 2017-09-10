package org.kwstudios.ragemode_techguns.loader;

import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(id = "ragemode_techguns", name = "RageMode Techguns", version = "1.0.0")
/**
 * Created by koray on 10/09/2017.
 */
public class PluginLoader {

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        System.out.println("The Plugin was loaded!");
    }
}
