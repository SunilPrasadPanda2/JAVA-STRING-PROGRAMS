package b_charAT_Method;

import java.util.Scanner;

public class A_2_Reverse_A_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string :");
		String s=sc.nextLine();
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			res=res+s.charAt(i);
		}
		System.out.println("Reversed string is : "+res);
		sc.close();
	}
}