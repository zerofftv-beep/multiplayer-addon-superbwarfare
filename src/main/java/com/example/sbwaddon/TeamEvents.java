package com.example.sbwaddon;

import net.minecraftforge.event.entity.EntityMountEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SBWMultiplayerAddon.MODID)
public class TeamEvents {

    @SubscribeEvent
    public static void onMount(EntityMountEvent event) {
        // Здесь можно добавить логику, если нужно
        // Пока просто разрешаем посадку
    }
}
