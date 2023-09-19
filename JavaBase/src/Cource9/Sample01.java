package Cource9;

import java.util.Scanner;

public class Sample01 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("数値を入力してください");
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();

		switch (num) {
		case 1:
			System.out.println("１ですね？");
			break;
		case 2:
			System.out.println("２ですね？");
			break;
		case 10:
			System.out.println("１０ですね？");
			break;

		default:
			System.out.println("該当せず");
			
		}
	}
}