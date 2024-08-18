package a_String_Programs;

import java.util.Scanner;
import java.util.regex.*;

public class W_39_Add_Nums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String s = sc.nextLine();
		String exp = "[0-9]*";
		Pattern p = Pattern.compile(exp);
		Matcher m = p.matcher(s);
		int sum = 0;
		while (m.find()) {
			String ss = m.group();
			try {
				sum += Integer.parseInt(ss);
			} catch (NumberFormatException e) {

			}
		}
		System.out.println("Sum of nums : " + sum);
		sc.close();

	}

}
