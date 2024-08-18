package a_String_Programs;

import java.util.Scanner;

public class M_21_H_He_Hel_Hell_Hello_Hellow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String s = sc.nextLine();
		addWord(s);
		sc.close();
	}
	
	public static void addWord(String s) {
		String word="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			word+=ch;
			System.out.println(word);
		}
	}
}
