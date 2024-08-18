package a_String_Programs;

import java.util.Scanner;

public class L2_34_ReverseStringWithSameWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String s = sc.nextLine();
		System.out.println(reverseStringWithSameWord(s));
		sc.close();

	}
	
	public static String reverseStringWithSameWord(String s) {
		String[] sa=s.split(" ");
		String ns="";
		for(int i=sa.length-1;i>=0;i--) {
			ns+=sa[i]+" ";
		}
		return ns;
	}
}
