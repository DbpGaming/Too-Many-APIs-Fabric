package dbp.tma.api;

import java.util.HashSet;

import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Register {
	public static void registerMaterial(String modid, Data mat, Settings settings) {
		for (String part : new HashSet<String>(mat.getHashSetSetting("parts"))) Registry.register(Registry.ITEM, new Identifier(modid, part+"_"+mat.getStringSetting("name")), new Item(settings));
	}
}