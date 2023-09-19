package course41;

import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//模擬テスト１
		String moji = "模擬テスト。１００点とります";

		System.out.println(moji);
		//模擬テスト２
		int x = 50;
		int y = 100;
		int z = x * y;
		System.out.println(z);
		//模擬テスト３
		Scanner stdIn = new Scanner(System.in);
		String a = stdIn.next();
		System.out.println(a);
		//模擬テスト４
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		//模擬テスト５
		int b = stdIn.nextInt();
		if (b >= 50) {
			System.out.println("５０以上です。");
		} else {
			System.out.println("４９以下です");
		}
		//模擬テスト６
		boolean isRaining = true;

		if (isRaining) {
			System.out.println("傘を持ってけー");
		} else {
			System.out.println("良い一日を！");
		}
		//模擬テスト７
		int[] numArr = { 10, 50, 30, 20, 40 };
		//模擬テスト８
		for (int i = 0; i < numArr.length; i++) {

			System.out.println(numArr[i]);
		}
		//模擬テスト９
		int max = 0;
		int[] number1 = { 10, 50, 30, 20, 40 };
		for (int c : number1) {
			if (max <= c) {
				max = c;
		
		

			}
		}

	}
}
