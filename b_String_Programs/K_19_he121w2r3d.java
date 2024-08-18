package a_String_Programs;

import java.util.Scanner;

public class K_19_he121w2r3d {
	/*
	 * i/p - helloworld => o/p - he121w2r3d
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String s = sc.next();
		System.out.println(countRepChar(s));
		sc.close();
	}

	public static char[] countRepChar(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 49;
			boolean flag = true;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count += 1;
					ch[j] = (char) count;
					flag = false;
				}
			}
			if (!flag) {
				ch[i] = 49;
			}
		}
		return ch;
	}
}
