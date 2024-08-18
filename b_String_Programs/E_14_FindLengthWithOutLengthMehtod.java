package a_String_Programs;

import java.util.Scanner;

public class E_14_FindLengthWithOutLengthMehtod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string :");
		String s=sc.nextLine();
		System.out.println(findLength(s));
		sc.close();

	}
	
	public static int findLength(String s) {
		char[] ch=s.toCharArray();
		int count=0;
		for (@SuppressWarnings("unused") char c : ch) {
		           // @SuppressWarnings("unused") is an annotation
			count+=1;
		}
		return count;
	}
}
