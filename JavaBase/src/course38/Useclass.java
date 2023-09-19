package course38;

import java.util.Scanner;

public class Useclass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Pocketon poke1 = new Pocketon();
		poke1.name = "銭カメ";
		poke1.power = 100;
		poke1.difficult = 1;

		String[] arr2 = new String[3];

		arr2[0] = "あ";
		arr2[1] = "か";
		arr2[2] = "さ";

		for (int i = 0; i < 3; i++) {
			System.out.println(arr2[i]);
		}

		Pocketon[] myPockes = new Pocketon[3];

		myPockes[0] = poke1;

		Pocketon poke2 = new Pocketon();
		poke2.name = "不思議なリーフ";
		poke2.power = 200;
		poke2.difficult = 3;

		System.out.println(myPockes[0].name);
		System.out.println(myPockes[1].difficult);

		Scanner stdIn = new Scanner(System.in);

		Pocketon poke3 = new Pocketon();
		System.out.println("名前");
		poke3.name = stdIn.next();
		System.out.println("力");
		poke3.power = stdIn.nextInt();
		System.out.println("難易度");
		poke3.difficult = stdIn.nextInt();
		myPockes[2] = poke3;

		System.out.println(myPockes[2].name);
		System.out.println(myPockes[2].power);
		System.out.println(myPockes[2].difficult);

		for (int v = 0; v < 3; v++) {
			System.out.println(myPockes[v].name);
		}
		myPockes[1].display();
	}

}