package b_charAT_Method;

import java.util.Scanner;

public class B2_3_Count_Num_Of_Words {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string :");
		String s=sc.nextLine();
		int count = 1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				count+=1;
			}
		}
		System.out.println("Number of words in \""+s+"\" is : "+count);
		sc.close();
	}

}
