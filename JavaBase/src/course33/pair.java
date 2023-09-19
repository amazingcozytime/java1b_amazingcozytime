package course33;

import java.util.Scanner;

public class pair {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);
		System.out.println("x");
		int x = stdIn.nextInt();
		System.out.println("y");
		int y = stdIn.nextInt();

		if (x < y) {
			System.out.println("yがおおきい");

			if (x > y) {
				System.out.println("xがおおきい");

			} else {
				System.out.println("同じ");
			}

		}
	}
}