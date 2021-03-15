package dbp.tma;

import dbp.tma.api.Constructor;
import dbp.tma.api.Register;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item.Settings;

public class Tma implements ModInitializer {
	@Override
	public void onInitialize() {
		Register.registerMaterial("tma", Constructor.Material("copper", "ingot", "nugget"), new Settings());
	}
}
