package cn.zhucongqi.list;

import java.util.Hashtable;
import java.util.Iterator;

public class StaticList {


	private static Hashtable<String,String> userList = null;
	private static Hashtable<String, String> driverList = null;
	static
	{
		userList = new Hashtable<String, String>();
		driverList = new Hashtable<String, String>();
	}
	
	public static void putUser(String key, String value)
	{
		userList.put(key, value);
//		print();
	}
	
	public static void putDriver(String key, String value)
	{
		driverList.put(key, value);
	}
	
	public static void print()
	{
		Hashtable ht = userList;
		for(Iterator<?> itr = ht.keySet().iterator(); itr.hasNext();){
			String key = (String) itr.next();
			Object value =  ht.get(key);
			System.out.println(key+"--"+value);
		}
	}
}
