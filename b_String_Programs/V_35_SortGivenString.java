package a_String_Programs;

import java.util.Scanner;

public class V_35_SortGivenString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String s = sc.nextLine();
		System.out.println(sort(s));
		sc.close();

	}

	public static char[] sort(String s) {
		s = s.toLowerCase();
		char[] ca = s.toCharArray();
		for (int i = 0; i < ca.length; i++) {
			for (int j = 0; j < ca.length - 1 - i; j++) {
				if (ca[j] > ca[j + 1]) {
					char temp = ca[j + 1];
					ca[j + 1] = ca[j];
					ca[j] = temp;
				}
			}
		}
		return ca;
	}
}
