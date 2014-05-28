package cn.zhucongqi.list;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

public class SFSListTestingMain {

	public static void main(String[] args) {
		List <ObjectModel>enterList = new ArrayList<ObjectModel>();
		
		for (int i = 0; i < 10; i++) {
			ObjectModel obj = new ObjectModel();
			obj.setName("name"+i);
			obj.setPhone("phone"+i);
			obj.setAddress("address"+i);
			enterList.add(obj);
		}
		
		System.out.println("Before");
		for (ObjectModel objectModel : enterList) {

			System.out.println(objectModel.getName());
		}
		
		
		ObjectModel lastobj = enterList.get(9);
		lastobj.setName("zcq");
		System.out.println("After");
		for (ObjectModel objectModel : enterList) {

			System.out.println(objectModel.getName());
		}
		
		
		Hashtable<String, ObjectModel> table = new Hashtable<String,ObjectModel>();
		for (int i = 0; i < 10; i++) {

			ObjectModel obj = new ObjectModel();
			obj.setName("name"+i);
			obj.setPhone("phone"+i);
			obj.setAddress("address"+i);
			
			table.put(obj.getName(), obj);
		}
		
		System.out.println("alltable");
		for(Iterator itr = table.keySet().iterator(); itr.hasNext();){
			String key = (String) itr.next();
			ObjectModel value = (ObjectModel) table.get(key);
			System.out.println(key+"--"+value.getAddress());
		}
		

		ObjectModel first = (ObjectModel) table.get("name0");
		first.setAddress("new addr");
		
		
		System.out.println("after alltable");
		for(Iterator itr = table.keySet().iterator(); itr.hasNext();){
			String key = (String) itr.next();
			ObjectModel value = (ObjectModel) table.get(key);
			System.out.println(key+"--"+value.getAddress());
		}

		System.out.println("remove");
		table.remove("name4");
		for(Iterator itr = table.keySet().iterator(); itr.hasNext();){
			String key = (String) itr.next();
			ObjectModel value = (ObjectModel) table.get(key);
			System.out.println(key+"--"+value.getAddress());
		}
		
	}

}
