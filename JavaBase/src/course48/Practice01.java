package course48;

import java.util.Random;

public class Practice01 {

	public static void main(String[] args) {
		Random random1 = new Random();

		int[][] chair = new int[6][6];
		int[] number = new int[36];
		for (int a = 0; a < number.length; a++) {
			number[a] = a + 1;
		}
		for (int j = 0; j < 6; j++) {
			for (int i = 0; i < 6; i++) {

				int ran = random1.nextInt(36) + 1;
				ran--;
				while (number[ran] == 0) {
					ran = random1.nextInt(36) + 1;
					ran--;
				}
				chair[j][i] = number[ran];
				number[ran] = 0;
			}
			
		}
	}
}

//席替えプログラム
//６＊６のクラスの席替え、パターン１完全ランダム。パターン２ユーザーが左上から順番に座席を指定する。
/*                                                (
 * 席埋まったら確定か変更かユーザーに入力させる
 * 確定の場合席表示して終わり
 * 変更の場合、変更する席の座標入力
 *（０，０）の場所と（３，２）の場所
 *コメントを必ず入れる
 *変数何に使うか
 *if何を判定させるか
 *繰り返しいつまでループか
 *担当　座席指定
 */
