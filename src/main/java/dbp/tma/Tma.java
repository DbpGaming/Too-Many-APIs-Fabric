package dbp.tma;

import java.util.HashSet;

import dbp.tma.api.Constructor;
import dbp.tma.api.Register;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item.Settings;

public class Tma implements ModInitializer {
	@Override
	public void onInitialize() {
		Register.registerMaterial("modid", Constructor.Material("materialtest", 0xFFFFFF, "test", "reee"), new Settings());
	}
}
