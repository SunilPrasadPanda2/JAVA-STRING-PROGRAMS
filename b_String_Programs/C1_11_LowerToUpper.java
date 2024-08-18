package a_String_Programs;

import java.util.Scanner;

public class C1_11_LowerToUpper {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string :");
		String s=sc.nextLine();
		System.out.println(lowerToUpper(s));
		sc.close();

	}
	
	public static String lowerToUpper(String s) {
		char[] ch=s.toCharArray();
		String ns="";
		for(int i=0;i<s.length();i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				ch[i]=(char) (ch[i]-32);
			}
			ns+=ch[i];
		}
		return ns;
	}
}
