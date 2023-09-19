package Cource10;

import java.util.Scanner;

public class Practice08 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
}
	
	Scanner stdIn=new Scanner(System.in);
	System.out.println("Xをうってね");
	int X = stdIn.nextInt();
	
	Scanner stdIn1=new Scanner(System.in);
	System.out.println("yをうってね");
	int y = stdIn.nextInt();
	
	Scanner stdIn2=new Scanner(System.in);
	System.out.println("zをうってね");
	int z = stdIn.nextInt();{
	
	if (X>y&&y>z) {
		System.out.println(X+"が一番大きい");
		
	}else{	
		if (y>X&&X>z) {
			System.out.println(y+"が一番大きい");
			
		} else {
			System.out.println("zがでかい");
	}

}
}
}