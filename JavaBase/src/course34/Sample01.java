package course34;

import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn=new Scanner(System.in);
		
		int x=stdIn.nextInt();
		
		int[] variable =new int[x];

		
		offOff();
		
		String moji=prapra("練習問題");
		System.out.println(moji);
		
		
		
		
		
		

}
	static String prapra(String x) {
		String moji=x+"を受け取りました";
		return moji;
	}
	
	static void offOff() {
		System.out.println("呼び出されました");
	}
}


