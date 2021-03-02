package dbp.tma.api;

import java.util.HashSet;

public class Constructor {
	public static Data Material(String name, int color, String textureSet, HashSet parts){
		Data material = new Data();
		material.setSetting("name", name);
		material.setSetting("color", color);
		material.setSetting("TextureSet", textureSet);
		material.setSetting("parts", parts);
		return material;
	}
}
