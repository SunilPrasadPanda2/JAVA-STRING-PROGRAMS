package a_String_Programs;

import java.util.Scanner;

public class L_20_ReverseWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String s = sc.nextLine();
		System.out.println(reverseWord(s));
		sc.close();
	}

	public static String reverseWord(String s) {
		s = s + " ";
		String rs = "";
		String wd = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != ' ') {
				wd = ch + wd;
			} else {
				rs += wd + " ";
				wd = "";
			}
		}
		return rs;
	}
}
