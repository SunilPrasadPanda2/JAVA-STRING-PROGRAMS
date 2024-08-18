package c_toCharArray_Method;

import java.util.Scanner;

public class B3_33_PrintPallindromWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string :");
		String s=sc.nextLine();
		findPallindroms(s);
		sc.close();

	}
	
	public static void findPallindroms(String s) {
		String[] sa=s.split(" ");
		for(int i=0;i<sa.length;i++) {
			String sw=sa[i];
			String srw="";
			for(int j=sw.length()-1;j>=0;j--) {
				srw+=sw.charAt(j);
			}
			if(sw.equals(srw)) {
				System.out.print(sw+" ");
			}
		}
	}
}
