package a_String_Programs;

import java.util.Scanner;

public class C3_31_LowerToUpper_UpperToLower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string :");
		String s=sc.nextLine();
		System.out.println(lowerToUpper_UpperToLower(s));
		sc.close();

	}

	public static String lowerToUpper_UpperToLower(String s) {
		String ns="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z') {
				ch=(char) (ch-32);
			}
			else if(ch>='A' && ch<='Z') {
				ch=(char) (ch+32);
			}
			ns+=ch;
		}
		return ns;
	}
}
