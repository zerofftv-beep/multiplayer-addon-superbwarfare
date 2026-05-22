package com.example.sbwaddon.mixin;

import com.example.sbwaddon.Config;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.VehicleEntity;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(VehicleEntity.class)
public abstract class VehiclePassengerMixin extends Entity {

    public VehiclePassengerMixin(EntityType<?> entityType, Level level) {
        super(entityType, level);
    }

    @Inject(method = "getMaxPassengers", at = @At("RETURN"), cancellable = true)
    private void onGetMaxPassengers(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(Config.maxPassengers);
    }
}