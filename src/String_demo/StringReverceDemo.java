package String_demo;

public class StringReverceDemo {
	private static String reverseString(String s) {
		if(s.isEmpty())
			return s;
		return reverseString(s.substring(1))+s.charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="salim";
		System.out.println(s);
		String result=reverseString(s);
		System.out.println(result);

	}



}
