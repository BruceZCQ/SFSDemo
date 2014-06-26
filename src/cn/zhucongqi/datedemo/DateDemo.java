package cn.zhucongqi.datedemo;

import java.util.*;

public class DateDemo {

	public static void main(String[] args) {
		Date date = new Date();
		long datetime = date.getTime() / 1000;
		System.out.println(datetime);
	}

}
