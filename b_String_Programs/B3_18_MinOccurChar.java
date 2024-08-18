package a_String_Programs;

import java.util.Scanner;

public class B3_18_MinOccurChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String s = sc.nextLine();
		minchar(s);
		sc.close();
	}
	
	public static void minchar(String s) {
		char[] ch = s.toCharArray();
		int min = s.length();
		char mnch = ' ';
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (ch[i] == ch[j]) {
					count += 1;
					ch[j] = ' ';
				}
			}
			if (min > count && ch[i]!=' ') {
				min = count;
				mnch = ch[i];
			}
		}
		System.out.println(mnch + "=" + min);
	}
}
