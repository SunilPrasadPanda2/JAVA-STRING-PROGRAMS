package a_String_Programs;

import java.util.Scanner;

public class O_23_PrintUniqueChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String s = sc.nextLine();
		System.out.println(uniqueChar(s));
		sc.close();

	}
	
	// Without using index of method
	
//	public static String uniqueChar(String s) {
//		String ns="";
//		for(int i=0;i<s.length();i++) {
//			char ch1=s.charAt(i);
//			if(ns.length()==0) {
//				ns+=ch1;
//			}
//			for(int j=0;j<ns.length();j++) {
//				char ch2=ns.charAt(j);
//				if(ch1!=ch2 && j==ns.length()-1) {
//					ns+=ch1;
//				}
//				if(ch1==ch2) {
//					break;
//				}
//			}
//		}
//		return ns;
//	}
	
	
	// Using index of method
	
	public static String uniqueChar(String s) {
		String ns="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ns.indexOf(ch)==-1) {
				ns+=ch;
			}
		}
		return ns;
	}
}
