package a_String_Programs;

public class X_40_FindHighest3DigNum {

	public static void main(String[] args) {
		String s = "93210968";
		int highest = 0;
		for (int i = 0; i < s.length() - 2; i++) {
			String ss = s.substring(i, i + 3);
			int num = Integer.parseInt(ss);
			if (num > highest) {
				highest = num;
			}
		}
		System.out.println("Highest 3 gid num is : " + highest);

	}

}
