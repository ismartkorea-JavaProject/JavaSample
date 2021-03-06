package com.java200.system.legacy;
import java.util.*;
public class StudentHashtableTest {

	public static void main(String[] args) {
		Hashtable<String,Student> table=new Hashtable<>();
		table.put("1",new Student("Jee",1,"Seoul"));//0
		table.clear();//모두 제거
		table.put("2",new Student("Gong",2,"Seoul"));//1
		table.put("3",new Student("Song",3,"Seoul"));//2
		table.put("4",new Student("Lee",4,"Koyang"));//3
		table.put("4",new Student("Lee",4,"Koyang"));//3과 중복x
		System.out.println(table.size());
		System.out.println(table.containsKey("4"));
		table.remove("3"); 
		Student stu=table.get("2");//key
		System.out.println(stu.getId()+"  "+stu.getName()+"  "+stu.getAddr());
		//모든 elements 출력하기
		//Set set=table.keySet();//Map을 참고
		Enumeration<String> enums=table.keys();
		while(enums.hasMoreElements()){
			String key=enums.nextElement() ;//핵심
			Student stus=table.get(key);
			System.out.println(stus.getId()+"  "+stus.getName()+"  "+stus.getAddr());
		}
	}
}
