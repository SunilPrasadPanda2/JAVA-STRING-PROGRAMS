package a_String_Programs;

import java.util.Scanner;

public class G_16_PrintVowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String s = sc.nextLine();
		printVowel(s);
		sc.close();

	}

	public static void printVowel(String s) {
		char[] ch = s.toCharArray();
		// int sum=0;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				count = 1;
				for (int j = i + 1; j < s.length(); j++) {
					if (ch[i] == ch[j]) {
						count += 1;
						ch[j] = ' ';
					}
				}
				System.out.println(ch[i] + "=" + count);
				// sum+=count;
			}
		}
		// System.out.println("Total vowels ="+sum);
	}
}
