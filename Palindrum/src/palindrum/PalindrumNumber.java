package palindrum;

import java.util.Scanner;

public class PalindrumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int temp=number;
		int sum=0;
		while(number>0){
			sum=(sum*10)+number%10;
			number=number/10;
		}if(sum==temp) {
			System.out.println("Palindrum Number");
		}else
			System.out.println("Not a Palindrum");
	}

}
