package com.java200.system.hashmap.java7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CarbarnHashMap2 {

	public static void main(String[] args) 
	{
		HashMap<String, Car> hm=new HashMap<>(); 
		hm.put("3",new Taxi());hm.put("4",new Bus());

		Car[] cc=new Car[3];//부모타입으로 선언, 정의
		cc[0] = new Car();  //초기화
		cc[1] = new Taxi(); //heterogeneous
		cc[2] = new Bus();  //heterogeneous
		hm.put("5",cc[0]);   hm.put("6",cc[1]); 
		hm.put("7",cc[2]);
		Set<String> set=hm.keySet();
		for(String str: set){
			System.out.println("key : "+str);
		}
		Iterator<String> iter=set.iterator();
		while(iter.hasNext()){
			String key=iter.next();
			Car car = hm.get(key);
			car.show();
		}
		//public interface Collection<E>extends Iterable<E>
		Collection<Car> cv=hm.values() ;
		for(Car col: cv){
			col.show();
		}
	}

}
