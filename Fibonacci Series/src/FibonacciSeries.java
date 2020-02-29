import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int noOfTimes=sc.nextInt();
		int a=0;int b=0;int c=1;
		for (int i = 0; i < noOfTimes; i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println("Fibonacci Series : "+a);
			
		}
	}

}
