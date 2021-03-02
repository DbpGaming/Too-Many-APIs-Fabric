package dbp.tma;

import java.util.HashSet;

import dbp.tma.api.Constructor;
import dbp.tma.api.Register;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item.Settings;

public class Tma implements ModInitializer {
	HashSet<String> parts = new HashSet<>();

	@Override
	public void onInitialize() {
		parts.add("test");
		parts.add("reee");
		Register.registerMaterial("modid", Constructor.Material("materialtest", 0xFFFFFF, "default", parts), new Settings());
	}
}
