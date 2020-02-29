
public class FullPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		for(int i=rows;i>=1;i--) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print("  ");
			}
			for(int k=2*i-1;k>=1;k--) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
