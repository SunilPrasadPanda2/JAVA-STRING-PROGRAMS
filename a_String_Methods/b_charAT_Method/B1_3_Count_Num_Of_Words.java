package b_charAT_Method;

public class B1_3_Count_Num_Of_Words {

	public static void main(String[] args) {
		String s="sunil prasad panda";
		int count = 1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ')
				count+=1;
		}
		System.out.println("Number of words in \""+s+"\" is : "+count);
	}

}
