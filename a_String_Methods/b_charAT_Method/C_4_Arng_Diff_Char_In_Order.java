package b_charAT_Method;

import java.util.Scanner;

public class C_4_Arng_Diff_Char_In_Order {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string :");
		String s=sc.nextLine();
		String num="";
		String spChar="";
		String smChar="";
		String bigChar="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z') {
				bigChar+=ch;
			}
			else if(ch>='a' && ch<='z') {
				smChar+=ch;
			}
			else if(ch>='0' && ch<='9') {
				num+=ch;
			}
			else {
				spChar+=ch;
			}
		}
		String s1=num + spChar + smChar + bigChar;
		System.out.println(s1);
		sc.close();
	}

}
