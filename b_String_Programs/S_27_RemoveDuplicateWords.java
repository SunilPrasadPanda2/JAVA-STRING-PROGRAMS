package a_String_Programs;

import java.util.Scanner;

public class S_27_RemoveDuplicateWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String s = sc.nextLine();
		System.out.println(removeDuplicateWords(s));
		sc.close();

	}

	public static String removeDuplicateWords(String s) {
		String[] sa = s.split(" ");
		String ns = "";
		for (int i = 0; i < sa.length; i++) {
			if (ns.indexOf(sa[i]) == -1) {
				ns += sa[i] + " ";
			}
		}
		return ns;
	}
}
