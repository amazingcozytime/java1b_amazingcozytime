package Cource19;

import java.util.Scanner;

public class question04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
int[] mynumScan = new int[3];
Scanner stdIn = new Scanner(System.in);
System.out.println("数字を打って");
		
		mynumScan[0]=10;
		mynumScan[1]=stdIn.nextInt();
		mynumScan[2]=mynumScan[0] + mynumScan[1] ;
		
		for(int i =0; i<3; i++) {
			System.out.println(mynumScan[i]+"だ。");


	}

}
}