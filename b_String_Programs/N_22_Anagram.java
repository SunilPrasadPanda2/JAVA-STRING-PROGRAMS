package a_String_Programs;

import java.util.Scanner;

public class N_22_Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st string :");
		String s1 = sc.nextLine();
		System.out.print("Enter 2nd string :");
		String s2 = sc.nextLine();
		if(anagram(s1, s2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
		sc.close();

	}
	
	public static boolean anagram(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		for(int i=0;i<s1.length();i++) {
			char ch1=s1.charAt(i);
			for(int j=0;j<s2.length();j++) {
				char ch2=s2.charAt(j);
				if(ch1==ch2) {
					if(i==s1.length()-1) {
						return true;
					}
					break;
				}
			}
		}
		return false;
	}
}
