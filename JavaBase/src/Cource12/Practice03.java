package Cource12;

public class Practice03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int i = 1;
		int y = 1;

		while (y <= 9) {
			while (i <= 9) {
				System.out.print(i * y + ",");
				i++;

			}
			System.out.println();
			i = 1;
			y++;
		}
	}
}