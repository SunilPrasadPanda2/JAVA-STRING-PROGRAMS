package c_toCharArray_Method;

import java.util.Scanner;

public class B4_37_SmallestPallindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String s = sc.next();// Enter single word
		String ns = pallindromSubStrings(s);
		System.out.println(ns);
		String[] sa = ns.split(" ");
		
		String ss = "";
		for (int i = 0; i < sa.length - 1; i++) {
			if (sa[i].length() >= sa[i + 1].length()) {
				ss = sa[i];
			}
		}
		System.out.println("smallest string :" + ss);
		sc.close();
	}

	public static String pallindromSubStrings(String s) {
		String ns = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 2; j < s.length(); j++) {
				String sw = "";
				for (int k = i; k <= j; k++) {
					sw += s.charAt(k);
				}
				// (or) String sw =s.substring(i, j+1);
				if (isPallindrom(sw)) {
					ns += sw + " ";
				}
			}
		}
		return ns;
	}

	public static boolean isPallindrom(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i += 1;
			j -= 1;
		}
		return true;
	}

}
