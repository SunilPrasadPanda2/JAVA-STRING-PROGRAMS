package b_charAT_Method;

import java.util.Scanner;

public class E_6_Find_Index_Position {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string :");
		String s=sc.next();
		System.out.print("Enter a character :");
		char c=sc.next().charAt(0);
		System.out.println(find(s,c));
		sc.close();
	}

	public static int find(String s, char c) {
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if (c==ch) {
				return i;
			}
		}
		return -1;
	}

}
