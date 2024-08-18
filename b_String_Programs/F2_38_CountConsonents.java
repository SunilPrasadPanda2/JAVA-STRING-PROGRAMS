package a_String_Programs;

import java.util.Scanner;

/*
 * count consonants if number of consonants more then 5 then
 * replace all the consonants with space.
 * */
public class F2_38_CountConsonents {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string :");
		String s=sc.nextLine();
		s=s.toLowerCase();
		String ns="";

		if(consonantsMoreThan5(s)) {
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
					ch=' ';
				}
				ns+=ch;
			}
			System.out.println("final string :"+ns);
		}else {
			System.out.println("final string :"+s);
		}
		
		
//If want to remove the spaces from the final string
		
//		String fs="";
//		for (int i = 0; i < ns.length(); i++) {
//			char ch = ns.charAt(i);
//			if(ch!=' ') {
//				fs+=ch;
//			}
//		}
//		System.out.println("final string :"+fs);
		sc.close();
	}

	public static boolean consonantsMoreThan5(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				count += 1;
				if (count > 5)
					return true;
			}
		}
		return false;
	}
}
