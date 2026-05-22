package com.example.sbwaddon;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(SBWMultiplayerAddon.MODID)
public class SBWMultiplayerAddon {
    public static final String MODID = "sbwaddon";
    public static final Logger LOGGER = LogManager.getLogger();

    public SBWMultiplayerAddon() {
        LOGGER.info("Superb Warfare Multiplayer Vehicles Addon loaded!");
    }
}