package g_indexOf_Method;

public class A_Basics {

	public static void main(String[] args) {
		String s = "sunil prasad panda";

		System.out.println("Index of a is : " + s.indexOf('a'));// 8
		System.out.println("Index of d is : " + s.indexOf('d'));// 11

		System.out.println("Index of pra is : " + s.indexOf("pra"));// 6
		System.out.println("Index of pan is : " + s.indexOf("pan"));// 13

		System.out.println("Index of x is : " + s.indexOf('x'));// -1
		System.out.println("Index of pro is : " + s.indexOf("pro"));// -1
		System.out.println("Index of 5 is : " + s.indexOf(5));// -1
		System.out.println("Index of 2 is : " + s.indexOf(2));// -1

	}

}
