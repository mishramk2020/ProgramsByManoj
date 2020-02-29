package string.reverse;

public class ReverseWithoutUsingReverseFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Manoj Mishra";
		char[] charecters=name.toCharArray();
		System.out.println("String is :"+name);
		System.out.println("Length is:"+charecters.length);
		//StringBuilder revString=new StringBuilder();
		String xyz="";
		for (int i = charecters.length-1; i>=0 ; i--) {
			//revString.append(charecters[i]);
			xyz=xyz+charecters[i];
			
			//System.out.println("Rev String is :"+revString);
			//String reverseString=revString.toString();
			//System.out.println("Reverse String is :"+reverseString);
		}System.out.println(xyz);
	}

}
