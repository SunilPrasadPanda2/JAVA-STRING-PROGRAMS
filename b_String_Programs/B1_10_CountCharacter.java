package a_String_Programs;

import java.util.Scanner;

public class B1_10_CountCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String s = sc.nextLine();
		countCharacter(s);
		sc.close();
	}

	public static void countCharacter(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (ch[i] == ch[j]) {
					count += 1;
					ch[j] = ' ';
				}
			}
			if (ch[i] != ' ') {
				System.out.println(ch[i] + "=" + count);
			}
		}
	}
}
