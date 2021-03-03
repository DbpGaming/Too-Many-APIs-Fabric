package dbp.tma.api;

import java.util.Arrays;
import java.util.HashSet;

public class Constructor {
	public static Data Material(String name, int color, HashSet parts){
		Data material = new Data();
		material.setSetting("name", name);
		material.setSetting("color", color);
		material.setSetting("parts", parts);
		return material;
	}

	public static Data Material(String name, int color, String... parts){
		HashSet<String> partthing = new HashSet<>();
		partthing.addAll(Arrays.asList(parts));
		return Material(name, color, partthing);
	}
}
