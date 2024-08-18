package d_replace_Method;

public class A_Basics {

	public static void main(String[] args) {
		String s = "Ramana";
		System.out.println("s =" + s);
		s = s.replace('a', 'o');
		System.out.println("s =" + s);
		s = "Ramana";
		s = s.replace("Ram", "Shyam");
		System.out.println("s =" + s);
	}

}
