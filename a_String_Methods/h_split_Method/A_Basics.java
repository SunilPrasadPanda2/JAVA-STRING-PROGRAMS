package h_split_Method;

public class A_Basics {

	public static void main(String[] args) {
		String s = "sunil prasad panda";

		String[] ns1 = s.split("");// without space, It will break from every character
		System.out.println("Length of ns1 =" + ns1.length); // length is a variable in array
		System.out.println("ns1[0] = " + ns1[0]);
		for (int i = 0; i < ns1.length; i++) { // we can not use length() method for array
			System.out.println(ns1[i]);
		}

		System.out.println("**********************");

		String[] ns2 = s.split(" ");// with space, It will break from, where space is present
		System.out.println("Length of ns2 =" + ns2.length); // length is a variable in array
		System.out.println("ns2[0] = " + ns2[0]);
		for (int i = 0; i < ns2.length; i++) { // we can not use length() method for array
			System.out.println(ns2[i]);
		}

		System.out.println("**********************");

		String[] ns3 = s.split("x");// with string not available in string,
		// It will break from, where given string is present
		System.out.println("Length of ns3 =" + ns3.length); // length is a variable in array
		System.out.println("ns3[0] = " + ns3[0]);
		for (int i = 0; i < ns3.length; i++) { // we can not use length() method for array
			System.out.println(ns3[i]);
		}

		System.out.println("**********************");

		String[] ns4 = s.split("a");// with string available in string,
		// It will break from, where given string is present
		System.out.println("Length of ns4 =" + ns4.length); // length is a variable in array
		System.out.println("ns4[0] = " + ns4[0]);
		for (int i = 0; i < ns4.length; i++) { // we can not use length() method for array
			System.out.println(ns4[i]);
		}
	}
	/*
	 * split() method it will remove the given string and will break the string from
	 * the given string.
	 */
}
