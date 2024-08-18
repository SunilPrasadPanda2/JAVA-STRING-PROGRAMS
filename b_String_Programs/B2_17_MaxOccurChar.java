package a_String_Programs;

import java.util.Scanner;

public class B2_17_MaxOccurChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String s = sc.nextLine();
		maxchar(s);
		sc.close();

	}

	public static void maxchar(String s) {
		char[] ch = s.toCharArray();
		int max = 0;
		char mxch = ' ';
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (ch[i] == ch[j]) {
					count += 1;
					ch[j] = ' ';
				}
			}
			if (max < count && ch[i]!=' ') {
				max = count;
				mxch = ch[i];
			}
		}
		System.out.println(mxch + "=" + max);
	}
}
