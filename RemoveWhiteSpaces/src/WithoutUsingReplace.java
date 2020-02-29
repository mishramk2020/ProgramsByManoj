
public class WithoutUsingReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Manoj is a good boy";
		char[] chars=str.toCharArray();
		StringBuffer sb=new StringBuffer();
		for (int i = 0; i < chars.length; i++) {
			if((chars[i]!=' ')&&(chars[i]!='\t')){
				sb.append(chars[i]);
			}
		}
		System.out.println(sb);
	}

}
