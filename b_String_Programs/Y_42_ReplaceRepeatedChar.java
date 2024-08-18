package a_String_Programs;

import java.util.Scanner;

public class Y_42_ReplaceRepeatedChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = sc.nextLine();
		System.out.println("Resulted string is : " + replace(s));
		sc.close();
	}

	public static String replace(String s) {
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char ch2 = ch[i];
			boolean flag = false;
			for (int j = i + 1; j < ch.length; j++) {
				char ch3 = ch[j];
				if (ch2 == ch3) {
					flag = true;
					ch[j] = '$';
				}
			}
			if (flag) {
				ch[i] = '$';
			}
		}
		
		String res="";
		for(char c:ch) {
			res+=c;
		}
		return res;
	}

}
