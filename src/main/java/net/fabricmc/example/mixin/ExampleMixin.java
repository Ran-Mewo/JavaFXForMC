package net.fabricmc.example.mixin;

import net.fabricmc.example.ExampleScreen;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class ExampleMixin {
	@Inject(at = @At("RETURN"), method = "<init>")
	private void init(CallbackInfo info) {
		ExampleScreen.initialize();
	}
}
