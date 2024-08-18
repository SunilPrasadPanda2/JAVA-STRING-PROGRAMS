package a_String_Programs;

import java.util.Scanner;

public class D_13_InitialCapital {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string :");
		String s=sc.nextLine();
		System.out.println(initialCapital(s));
		sc.close();

	}
	
	public static char[] initialCapital(String s) {
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(i==0 || ch[i-1]==' ') {
				ch[i]=(char)(ch[i]-32);
			}
		}
		return ch;
	}
}
