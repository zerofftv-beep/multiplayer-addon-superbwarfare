package com.example.sbwaddon;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber(modid = SBWMultiplayerAddon.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec.IntValue MAX_PASSENGERS = BUILDER
            .comment("Maximum number of players that can ride in Superb Warfare vehicles")
            .defineInRange("maxPassengers", 4, 1, 20);

    public static final ForgeConfigSpec SPEC = BUILDER.build();

    public static int maxPassengers = 4;

    @SubscribeEvent
    public static void onLoad(final ModConfigEvent.Loading event) {
        maxPassengers = MAX_PASSENGERS.get();
    }

    @SubscribeEvent
    public static void onReload(final ModConfigEvent.Reloading event) {
        maxPassengers = MAX_PASSENGERS.get();
    }
}