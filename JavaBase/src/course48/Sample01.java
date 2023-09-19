package course48;

import java.util.Random;

public class Sample01 {
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
				number[ran ] = 0;
			}
		}
		for (int b = 0; b < 6; b++) {
			for (int c = 0; c < 6; c++) {
				System.out.print(chair[b][c]+",");
			}
			System.out.println();
		}
	}
}