package dbp.tma.api;

import java.util.Arrays;
import java.util.HashSet;

public class Constructor {
	public static Data Material(String name, int color, HashSet<String> parts) {
		Data material = new Data();
		material.setSetting("name", name);
		material.setSetting("color", color);
		material.setSetting("parts", parts);
		return material;
	}

	public static Data Material(String name, int color, String... parts) {
		return Material(name, color, new HashSet<>(Arrays.asList(parts)));
	}
}
