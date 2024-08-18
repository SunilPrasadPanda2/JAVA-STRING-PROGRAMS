package b_charAT_Method;

import java.util.Scanner;

public class F_7_Change_Char {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string :");
		String s=sc.nextLine();
		System.out.print("Enter the character need to replace :");
		char c=sc.next().charAt(0);
		System.out.print("Enter the new character :");
		char rc=sc.next().charAt(0);
		String ns="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if (ch==c) {
				ch=rc;
			}
			ns+=ch;
		}
		System.out.println(ns);
		sc.close();
	}

}
