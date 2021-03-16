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
		switch(obj.getClass().toString()){
			case "class java.util.HashSet": this.settingsHashSet.put(name, (HashSet<String>) obj); break;
			case "class java.lang.String": this.settingsString.put(name, (String) obj); break;
			default: System.out.println(obj.toString() + "unknown object we can't register this so it might break things");
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