package words.string;

import java.util.HashMap;

public class NumbrsOfWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Manoj is a good good boy";
		System.out.println("String is :"+str);
		String[] str1=str.split(" ");
		System.out.println("After Splitting :"+str1);
		HashMap<String, Integer> map =new HashMap<String, Integer>();
		int counter;
		for (String string : str1) {
			if(map.containsKey(string))
			{
				counter=map.get(string);
				map.put(string, counter+1);
			}
			else {
				map.put(string, 1);
			}
		}System.out.println(map);
	}

}
