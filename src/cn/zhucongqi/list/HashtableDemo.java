package cn.zhucongqi.list;

import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
		
		String sameKey = "tableKey";
		
		Hashtable<String, ObjectModel> table = new Hashtable<String, ObjectModel>();
		
		ObjectModel o1 = new ObjectModel();
		o1.setName("O1Name");
		o1.setAddress("O1Address");
		o1.setPhone("O1Phone");
		
		table.put(sameKey, o1);
		
		System.out.println("table 0"+table.get(sameKey).getAddress());
		
		ObjectModel o2 = new ObjectModel();
		o2.setName("O2Name");
		o2.setAddress("O2Address");
		o2.setPhone("O2Phone");
		

		table.put(sameKey, o2);
		
		System.out.println("table 1"+table.get(sameKey).getAddress());
	}

}
