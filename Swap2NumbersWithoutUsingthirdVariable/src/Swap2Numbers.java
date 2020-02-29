import java.util.Scanner;

public class Swap2Numbers {

	private static Scanner sc1;

	public static void main(String[] args) {
		sc1 = new Scanner(System.in);
		int number1=sc1.nextInt();
		int number2=sc1.nextInt();
		System.out.println("First Number is :"+number1);
		System.out.println("Second Number is :"+number2);
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		System.out.println("After swapping : First Number :"+number1);
		System.out.println("After swapping : Second Number :"+number2);
	}

}
