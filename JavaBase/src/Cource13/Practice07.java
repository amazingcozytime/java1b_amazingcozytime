package Cource13;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("数値を入力してね");
		Scanner stdIn = new Scanner(System.in);

		int yy = stdIn.nextInt();
		int xx = yy % 2;

		for (int i = 0; i < yy; i++) {

			System.out.println("現在" + i + "回目のループです。");
			
			if (xx == 0 ) {
			System.out.println("偶数だよ");
			
			} else if (yy >= 100) {
				System.out.println("どれだけ回すの");
			
			} else {
				System.out.println("奇数だよ");
				
			}
		}
	}
}

