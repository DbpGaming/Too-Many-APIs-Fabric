package dbp.tma.api;

import java.util.HashMap;
import java.util.HashSet;

public class Data {
	protected final HashMap<String, String> settingsString = new HashMap<>();
	protected final HashMap<String, Integer> settingsInt = new HashMap<>();
	protected final HashMap<String, Boolean> settingsBool = new HashMap<>();
	protected final HashMap<String, HashSet<String>> settingsHashSet = new HashMap<>();

	public void setSetting(String name, String setting) {
		this.settingsString.put(name, setting);
	}

	public void setSetting(String name, int setting) {
		this.settingsInt.put(name, setting);
	}

	public void setSetting(String name, boolean setting) {
		this.settingsBool.put(name, setting);
	}

	public void setSetting(String name, HashSet<String> setting) {
		this.settingsHashSet.put(name, setting);
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
