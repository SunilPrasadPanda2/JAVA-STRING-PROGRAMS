package a_String_Programs;

import java.util.Scanner;

public class O_36_RemoveDuplicateChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String s = sc.nextLine();
		System.out.println(removeDuplicateChar(s));
		sc.close();

	}

	public static String removeDuplicateChar(String s) {
		char[] ca = s.toCharArray();
		String ns = "";
		for (int i = 0; i < ca.length; i++) {
			int count = 1;
			for (int j = i + 1; j < ca.length; j++) {
				if (ca[i] == ca[j]) {
					count += 1;
					ca[j] = ' ';
				}
				if (count == 1 && j == ca.length - 1) {
					ns += ca[i];
				}
			}
		}
		return ns;
	}
}
