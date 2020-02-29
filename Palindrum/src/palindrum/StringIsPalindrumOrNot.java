package palindrum;

import java.util.Scanner;

public class StringIsPalindrumOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		String reverse="";
		for (int i =string.length()-1 ; i>=0 ; i--) {
			reverse=reverse+string.charAt(i);
		}
		if(string.equals(reverse)) {
			System.out.println("String is Palindrum");
		}
		else {
			System.out.println("String is not a Palindrum");
		}
	}

}
