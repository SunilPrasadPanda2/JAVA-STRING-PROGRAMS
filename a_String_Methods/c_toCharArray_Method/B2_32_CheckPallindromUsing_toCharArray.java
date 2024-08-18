package c_toCharArray_Method;

import java.util.Scanner;

public class B2_32_CheckPallindromUsing_toCharArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string :");
		String s=sc.next();
		if (isPallindrom(s)) {
			System.out.println(s+" is a pallindrom string");
		}
		else {
			System.out.println(s+" is not a pallindrom string");
		}
		sc.close();
	}

	public static boolean isPallindrom(String s) {
		int i=0;
		int j=s.length()-1;
		char[] ch=s.toCharArray();
		while (i<j) {
			if (ch[i] != ch[j]) {
				return false;
			}
			i+=1;
			j-=1;
		}
		return true;
	}
}
