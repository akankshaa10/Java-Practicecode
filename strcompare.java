package Strings;

public class compareToDemo {

	public static void main(String[] args) {
		String s1 = "Akanksha";
		String s2 = "akanksha";
		
		String s3 = "akanksha";
		String s4 = "akanksha";
		
		System.out.println(s1.compareTo(s2));		//-32
		System.out.println(s3.compareTo(s4));		//32
	}
}