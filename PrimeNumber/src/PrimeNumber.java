import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int flag=0;
		int number=sc.nextInt();
		if (number==0 || number==1) {
			System.out.println("Its not a Prime Number");
		}
		else {
			for(int i=2;i<=number/2;i++) {
				if(number%i==0){
					System.out.println("Its not a Prime Number");
					flag=1;
					break;
				}
			}if (flag==0) {
				System.out.println(number+" Its a prime Number");
			}
		}
	}

}
