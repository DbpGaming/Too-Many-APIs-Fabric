package dbp.tma.api;

import java.util.Arrays;
import java.util.HashSet;

public class Constructor {
	public static Data Material(String name, HashSet parts){
		return new Data().setSetting("name", name).setSetting("parts", parts);
	}

	public static Data Material(String name, String... parts){
		return Material(name, new HashSet<>(Arrays.asList(parts)));
	}
}