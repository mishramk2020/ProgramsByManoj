package iterate;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class IterateHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String>map=new HashMap<Integer, String>();
		map.put(1, "Rahul");
		map.put(2, "Manoj");
		System.out.println(map);
		Iterator<Entry<Integer, String>> itr=map.entrySet().iterator();
		Iterator<Integer> key=map.keySet().iterator();
		//Iterator<String> value=map.values().iterator();
		System.out.println("While Loop :");
		while(itr.hasNext()) {
			Entry<Integer, String> me= itr.next();
			System.out.println("In MAP :Keys are :"+me.getKey()+" Values are :"+me.getValue());
		}
		System.out.println("Keys are :");
		while(key.hasNext()) {
			Integer i=key.next();
			System.out.println("Keys are : "+i);
		}
		System.out.println("foreach Loop :");
		for (Entry<Integer, String> map1 : map.entrySet()) {
			System.out.println("In MAP :Keys are :"+map1.getKey()+" Values are :"+map1.getValue());
		}
		System.out.println("Values are :");
		for (String string : map.values()) {
			System.out.println("Values are : "+string);
		}
	}

}
