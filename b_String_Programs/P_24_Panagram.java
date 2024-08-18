package a_String_Programs;

import java.util.Scanner;

public class P_24_Panagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String s = sc.nextLine();
		if (panagram(s)) {
			System.out.println("Panagram");
		} else {
			System.out.println("Not Panagram");
		}
		sc.close();

	}

	public static boolean panagram(String s) {
		s = s.toLowerCase();

		if (s.length() < 26) {
			return false;
		}

		String ns = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z' && ns.indexOf(ch) == -1) {
				ns += ch;
			}
			if (ns.length() == 26) {
				return true;
			}
		}
		return false;
	}
}
