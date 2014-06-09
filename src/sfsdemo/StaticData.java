package sfsdemo;

import java.util.ArrayList;

public class StaticData {

	private static ArrayList<String> names = new ArrayList<String>();

	public static ArrayList<String> getNames() {
		return names;
	}

	public static void setNames(ArrayList<String> names) {
		StaticData.names = names;
	}
	
	
	public static void addName(String name)
	{
		names.add(name);
	}
	
}
