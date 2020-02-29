
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int temp=num;
		int sum=0;int r;
		while(temp>0) {
			r=temp%10;
			temp=temp/10;
			sum=sum+(r*r*r);
			
		}
		if(sum==num) {
			System.out.println("Armstrong Number");
		}
		else
			System.out.println("Not a armstrong number");
	}

}
