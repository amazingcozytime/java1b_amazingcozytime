package course28;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Character me = new Character();

		System.out.println("プレイヤー１のパラメータを設定");

		Scanner stdIn = new Scanner(System.in);

		System.out.println("名前は？");
		me.name = stdIn.next();
		System.out.println("hpは？");
		me.hp = stdIn.nextInt();
		System.out.println("攻撃力は？");
		me.str = stdIn.nextInt();
		System.out.println("命中率は？");
		me.dex = stdIn.nextInt();
		System.out.println("回避率は？");
		me.agi = stdIn.nextInt();
		System.out.println("防御力は？");
		me.def = stdIn.nextInt();

		me.viewStatus();

		Character tonari = new Character();

		System.out.println("プレイヤー２のパラメータを設定");

		Scanner stdIn1 = new Scanner(System.in);

		System.out.println("名前は？");
		tonari.name = stdIn1.next();
		System.out.println("hpは？");
		tonari.hp = stdIn1.nextInt();
		System.out.println("攻撃力は？");
		tonari.str = stdIn1.nextInt();
		System.out.println("命中率は？");
		tonari.dex = stdIn1.nextInt();
		System.out.println("回避率は？");
		tonari.agi = stdIn1.nextInt();
		System.out.println("防御力は？");
		tonari.def = stdIn1.nextInt();

		tonari.viewStatus();

		me.battle(me, tonari);
		
		
		


	}

}


