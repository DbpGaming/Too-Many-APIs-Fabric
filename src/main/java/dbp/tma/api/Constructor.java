package dbp.tma.api;

import java.util.Arrays;
import java.util.HashSet;

public class Constructor {
	public static Data Material(HashSet parts){
		return new Data().setSetting("parts", parts);
	}

	public static Data Material(String... parts){
		return Material(new HashSet<>(Arrays.asList(parts)));
	}

	public static Data Material(Object... parts){
		HashSet<String> toAdd = new HashSet<>();
		for (Object partObj: parts) toAdd.add(partObj.toString());
		return Material(toAdd);
	}
}