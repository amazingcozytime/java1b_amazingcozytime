package Cource10;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner stdIn=new Scanner(System.in);
		int X = stdIn.nextInt();
		
		int num = X % 2;
		if (num == 0 ) {
			System.out.println("偶数");
			
		}else {
			System.out.println("奇数");
		}
		
		

	}

}
