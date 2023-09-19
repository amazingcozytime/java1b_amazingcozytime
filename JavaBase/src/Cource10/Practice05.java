package Cource10;

import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		System.out.println("xをうってね");
		int moji = stdIn.nextInt();


		Scanner stdInB = new Scanner(System.in);
		System.out.println("yをうってね");
		int mojiB = stdIn.nextInt();

		if (moji > mojiB) {
			System.out.println("xがでかい");


		} else {
			if(moji==mojiB) {
				System.out.println("おなじー");
			} else {
				System.out.println("yがでかい");
			}
		}
	}

}
