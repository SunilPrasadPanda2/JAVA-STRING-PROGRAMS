package c_toCharArray_Method;

import java.util.Scanner;

public class A2_30_String_To_CharArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st string :");
		String s = sc.nextLine();
		System.out.println(stringToCharArray(s));
		sc.close();
	}
	
	public static char[] stringToCharArray(String s) {
		int l=s.length();
		char[] charr=new char[l];
		for(int i=0;i<l;i++) {
			char ch=s.charAt(i);
			charr[i]=ch;
		}
		return charr;
	}
}
