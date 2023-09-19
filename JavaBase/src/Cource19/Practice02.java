package Cource19;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int[] numArray = new int[3];
		Scanner stdIn = new Scanner(System.in);
		System.out.println("数字を打って");
				
				numArray[0]=stdIn.nextInt();
				numArray[1]=stdIn.nextInt();
				numArray[2]=stdIn.nextInt() ;
				
				for(int i =0; i<3; i++) {
					System.out.println(numArray[i]+"だ。");


	}

}
}