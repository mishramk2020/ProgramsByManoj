
public class DuplicateUsingComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Manoj Mishra";
		int count=0;
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i]==ch[j]) {
					count=count+1;
					System.out.println(ch[j]+" is a duplicate charecter");
					break;
				}
			}
		}
	}

}
