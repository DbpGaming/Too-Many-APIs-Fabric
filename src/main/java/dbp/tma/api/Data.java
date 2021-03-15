package dbp.tma.api;

import java.util.HashMap;
import java.util.HashSet;

public class Data {
	protected final HashMap<String, String> settingsString = new HashMap<>();
	protected final HashMap<String, Integer> settingsInt = new HashMap<>();
	protected final HashMap<String, Boolean> settingsBool = new HashMap<>();
	protected final HashMap<String, HashSet<String>> settingsHashSet = new HashMap<>();

	public Data setSetting(String name, int setting) {
		this.settingsInt.put(name, setting);
		return this;
	}

	public Data setSetting(String name, boolean setting) {
		this.settingsBool.put(name, setting);
		return this;
	}

	public Data setSetting(String name, Object obj){
		if (obj.getClass() == String.class) this.settingsString.put(name, (String) obj);
		if (obj.getClass() == HashSet.class) this.settingsHashSet.put(name, (HashSet<String>) obj);
		if (obj.getClass() != String.class || obj.getClass() !=  HashSet.class){
			this.settingsString.put(name, (String) obj.toString());
			System.out.println(obj.toString() + "unknown object registered as a setting, registering it as a string setting, this may break things");
		}
		return this;
	}

	public String getStringSetting(String name) {
		return settingsString.get(name);
	}

	public int getIntSetting(String name) {
		return settingsInt.get(name);
	}

	public boolean getBoolSetting(String name) {
		return settingsBool.get(name);
	}

	public HashSet<String> getHashSetSetting(String name) {
		return settingsHashSet.get(name);
	}
}