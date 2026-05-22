package com.example.sbwaddon;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(SBWMultiplayerAddon.MODID)
public class SBWMultiplayerAddon {
    public static final String MODID = "sbwaddon";

    public SBWMultiplayerAddon() {
        MinecraftForge.EVENT_BUS.register(TeamEvents.class);
    }
}
