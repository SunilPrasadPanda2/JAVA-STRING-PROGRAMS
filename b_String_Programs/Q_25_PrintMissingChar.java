package a_String_Programs;

import java.util.Scanner;

public class Q_25_PrintMissingChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String s = sc.nextLine();
		System.out.println(missingChar(s));
		sc.close();

	}
	
	public static String missingChar(String s) {
		s=s.toLowerCase();
		String ns="";
		for(char ch='a';ch<='z';ch++) {
			if(s.indexOf(ch)==-1) {
				ns+=ch;
			}
		}
		return ns;
	}
}
