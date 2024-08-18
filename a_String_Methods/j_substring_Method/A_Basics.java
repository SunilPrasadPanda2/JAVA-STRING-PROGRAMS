package j_substring_Method;

public class A_Basics {

	public static void main(String[] args) {
		String s="sunil prasad panda";
		
		System.out.println("s = "+s);
		System.out.println(s.substring(0, 5));//print index 0 to 4
		System.out.println(s.substring(3, 10));// print index 3 to 9
		
		System.out.println("****************");
		
		System.out.println("s = "+s);
		System.out.println(s.substring(0));// print index 0 to last
		System.out.println(s.substring(1));// print index 1 to last
		System.out.println(s.substring(3));// print index 3 to last
		
		System.out.println("****************");
		
		s="java";
		System.out.println("s = "+s);
		System.out.println(s.substring(0, 3));//print index 0 to 2
		System.out.println(s.substring(1));//print index 1 to last
	}

}
