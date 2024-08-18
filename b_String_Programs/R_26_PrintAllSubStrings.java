package a_String_Programs;

import java.util.Scanner;

public class R_26_PrintAllSubStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String s = sc.nextLine();
		subStrings(s);
		sc.close();

	}
	
	public static void subStrings(String s) {
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(s.charAt(k));
				}
				System.out.println();
			}
		}
	}
}
