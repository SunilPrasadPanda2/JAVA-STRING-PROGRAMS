package a_String_Programs;

import java.util.Scanner;

public class Y_41_NearestVowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character : ");
		char c = sc.next().charAt(0);
		System.out.println("Nearest vowel is : " + nearestVowel(c));
		sc.close();

	}

	public static char nearestVowel(char c) {
		String s = "aeiou";
		int a = c;
		char res = 0;
		int min = 26;
		for (int i = 0; i < s.length(); i++) {
			int val = Math.abs(a - s.charAt(i));
			if (val == 0) {
				continue;
			}
			if (val <= min) {
				res = s.charAt(i);
				min = val;
			}
		}
		return res;
	}
}
