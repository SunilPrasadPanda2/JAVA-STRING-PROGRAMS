package b_charAT_Method;

import java.util.*;

public class D_5_Add_Nums_Present_In_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :");
		String s = sc.nextLine();
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				// sum+=ch-48;
				sum += ch - '0';
			}
		}

		// Using regex calculating more then single digit number
//		String exp = "[0-9]+";
//		Pattern p = Pattern.compile(exp);
//		Matcher m = p.matcher(s);
//		while (m.find()) {
//			int val = Integer.parseInt(m.group());
//			sum += val;
//		}

		System.out.println("Sum of digits present in " + s + " is :" + sum);
		sc.close();
	}

}
