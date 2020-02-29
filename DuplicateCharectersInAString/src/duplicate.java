import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(str);
		int counter;
		char[] ctr=str.toCharArray();
		System.out.println(ctr);
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for (Character c : ctr) {
			if(map.containsKey(c)) {
				counter=map.get(c);
				map.put(c,counter+1);
			}else {
				map.put(c, 1);
			}
		}
		Set<Character>set=map.keySet();
		System.out.println(set);
		for (Character character : set) {
			if(map.get(character)>1) {
				System.out.println(character+" is duplicate one and occuring "+map.get(character)+" times");
		}
			else {
				System.out.println(character+"is not a duplicate charecter");
			}
		}
	}

}
