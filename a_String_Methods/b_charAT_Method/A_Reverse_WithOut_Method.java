package b_charAT_Method;

import java.util.Scanner;

public class A_Reverse_WithOut_Method {

	public static void main(String[] args) {
		String s = "Sunil";
		String res = "";
		Scanner sc = new Scanner(s);
		sc.useDelimiter("");
		while (sc.hasNext()) {
			res = sc.next() + res;
		}
		System.out.println("Reverse String : " + res);
		sc.close();

	}

}
