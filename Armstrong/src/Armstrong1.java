import java.util.Scanner;

public class Armstrong1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int n=num;
		int r;int sum=0;
		//System.out.println(n);
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=(int) (sum+Math.pow(r, 3));
		}
		if(sum==num) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not a armstrong number");
			
		}
			}

}
