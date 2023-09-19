package Cource17;

import java.util.Scanner;

public class Sample03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数:");
		int x = stdIn.nextInt();

		System.out.printf("１０進数では%dです。＼ｎ", x);//10進数で表示
		System.out.printf("8進数では%oです。＼ｎ", x);//8進数で表示
		System.out.printf("１6進数では%xです。＼ｎ", x);//16進数で表示

	}

}
