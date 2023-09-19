package Cource17;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		char c1 = 50;
		char c2 = 'A';
		char c3 = '字';
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);

		//実践

		int num = 50;
		char moji = 50;

		System.out.println("intだったら５０は:" + num);
		System.out.println("charだったら５０は:" + moji);

		//数値を扱う型

		byte byteNum = 127;

		short shortNum = 32767;

		int intNum = 2147483647;

		System.out.println(byteNum);
		System.out.println(shortNum);
		System.out.println(intNum);

		//しまえる範囲を超えてしまうと・・・
		//エラーになる

		//マイナスの値はマイナスつけて変数にしまえば０

		shortNum = -32768;

		System.out.println(shortNum);

		int x = 8;

		//>>は右に２ビットずらす
		x = x << 2;
		System.out.println(x);

		int y = 8;

		//<<は左にずらす
		y = y << 2;
		System.out.println(y);

		//ちなみに
		int z = 8;
		
		//こう書くと４ビットずらす
		z=z<<4;
		System.out.println(z);
		

	}

}
