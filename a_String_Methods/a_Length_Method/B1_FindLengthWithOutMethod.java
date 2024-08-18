package a_Length_Method;

import java.util.Scanner;

public class B1_FindLengthWithOutMethod {

	public static void main(String[] args) {
		String s = "Sunil";
		int length = 0;
		Scanner sc = new Scanner(s);
		sc.useDelimiter("");
		while (sc.hasNext()) {
			sc.next();
			length++;
		}
		System.out.println("Length of the String is : " + length);
		sc.close();
	}
}
