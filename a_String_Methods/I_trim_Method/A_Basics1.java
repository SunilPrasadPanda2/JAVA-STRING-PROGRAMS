package I_trim_Method;

public class A_Basics1 {

	public static void main(String[] args) {
		String s = "     sunil    prasad     panda   ";

		System.out.println("s =" + s);
		System.out.println("Length of s = " + s.length());
		System.out.println("Trim s = " + s.trim()); // here s will not trim
		System.out.println("s =" + s);
		System.out.println("Length of s = " + s.length());

		System.out.println("**********************");

		System.out.println("s =" + s);
		s = s.trim(); // here s will be trimmed
		System.out.println("Trimmed s =" + s);
		System.out.println("Length of trim s = " + s.length());

	}

}
