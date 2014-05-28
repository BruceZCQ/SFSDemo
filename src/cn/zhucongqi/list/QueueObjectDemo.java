package cn.zhucongqi.list;

import java.util.LinkedList;

public class QueueObjectDemo {
	public static void main(String arg[])
	{
		LinkedList<ObjectModel> queue = new LinkedList<ObjectModel>();  
		
		for (int i = 0; i < 10; i++) {
			ObjectModel m = new ObjectModel();
			m.setName("name "+i);
			m.setAddress("address "+i);
			m.setPhone("phone "+i);
			queue.offer(m);
		}
		
//		ObjectModel obj = null;  
//        while((obj=queue.poll())!=null){  
//            System.out.print(obj.getAddress());  
//        }  
        
        ObjectModel ii = queue.get(1);
        ii.setAddress("new Address1");
        
        System.out.println("aa");
        ObjectModel obj = null;  
        while((obj=queue.poll())!=null){  
            System.out.print(obj.getAddress());  
        }  
        
	}
}
