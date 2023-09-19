package course20;

public class Practice06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String[] moji = new String[5];
		moji[0] = "x";
		moji[1] = "y";
		moji[2] = "x";
		moji[3] = "y";
		moji[4] = "x";
		int i = 0;
		for (String suuji : moji) {

			if ("x".equals( moji[i])) {
				System.out.println("x");
				i++;
			} else {
				System.out.println("y");
				i++;

			}
			System.out.println(i);
		}

	}
}