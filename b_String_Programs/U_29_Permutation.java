package a_String_Programs;

public class U_29_Permutation {

	public static String Swap(String s, int i, int j) {
		char[] ch = s.toCharArray();
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return new String(ch);
	}

	public static void isPerumutation(String s, int st, int end) {
		if (st == end) {
			System.out.println(s);
			return;
		}
		for (int i = st; i < end; i++) {
			String s1 = Swap(s, st, i);
			isPerumutation(s1, st + 1, end);
		}
	}

	public static void main(String[] args) {
		String s = "abc";
		int i = 0;
		int j = s.length();
		isPerumutation(s, i, j);

	}
}
