package dbp.tma.api;

import java.util.HashSet;

import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Register {
	public static void registerMaterial(String modid, Data material, Settings settings) {
		HashSet<String> parts = material.getHashSetSetting("parts");
		String name = material.getStringSetting("name");

		for (String part : parts) {
			Registry.register(Registry.ITEM, new Identifier(modid, part + "/" + name), new Item(settings));
		}
	}
}
