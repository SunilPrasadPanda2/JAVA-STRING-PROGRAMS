package a_String_Programs;

import java.util.Scanner;

public class T_28_SwapTwoString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st string :");
		String s1 = sc.nextLine();
		System.out.print("Enter 2nd string :");
		String s2 = sc.nextLine();
		swap(s1, s2);
		sc.close();
	}
	
	public static void swap(String s1,String s2) {
		System.out.println("Before swaping :");
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		s1=s1+s2;
		s2=s1.substring(0,(s1.length()-s2.length()));
		s1=s1.substring(s2.length());
		System.out.println("After swaping :");
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
	}
}
