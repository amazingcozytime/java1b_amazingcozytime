package course20;

public class Practice02 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] moji = new int[5];
		moji[0] = 10;
		moji[1] = 20;
		moji[2] = 30;
		moji[3] = 40;
		moji[4] = 50;

		for (int i = 0; i < moji.length; i++) {
			if (moji[i] > 29) {
				System.out.println(i + "番目の要素は３０より大きい");
			}

		}
	}
}
