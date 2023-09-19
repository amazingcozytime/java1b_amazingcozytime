package course48;

import java.util.Random;

public class Sample2 {
	public static void main(String[] args) {

		//		int x = 5;
		//
		//		if (ran == x) {
		//			System.out.println("一緒です");
		//		} else {
		//			System.out.println("違うよ");
		//
		//		}
		//
		//		int[] y = new int[2];
		//
		//		y[0] = 0;
		//		y[1] = 6;
		//
		//		if (y[0] == ran) {
		//			System.out.println("onaji");
		//		}
		//
		//		if (y[1] == ran) {
		//			System.out.println("onaji");
		//		}

		Random random1 = new Random();

		int[][] z = new int[6][6];

		int[] arr = new int[36];
		
		//36のランダムな変数用意
		for(int i = 0; i < 10;i++) {
			int x=random1.nextInt(36)+1;
			arr[i] = x;
			
			//ランダムな変数が前のものと被ってるか識別
			if(x == arr[i]) {
			 	//重複していた場合重複しなくなるまで数字を入れる
			} else {
				//していなかったらそのまま変数を入れる
				i = 1000;
			}
		}
		
	}
}
