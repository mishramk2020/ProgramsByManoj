
public class SecondHighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {349,51,66,13,900};
		int largest=0;
		int secondLargest=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>largest) {
				secondLargest=largest;
				largest=ar[i];
				System.out.println("hii");
				System.out.println(ar[i]);
			}
			else if (ar[i]>secondLargest) {
				secondLargest=ar[i];
				System.out.println("hello");
				System.out.println(ar[i]);
			}
		}
		System.out.println("Second highest number is "+secondLargest);
		System.out.println("Highest number is "+largest);
	}

}
