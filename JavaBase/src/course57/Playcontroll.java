package course57;

import java.util.Random;
import java.util.Scanner;

public class Playcontroll {
	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner stdIn = new Scanner(System.in);
		int ransu = rnd.nextInt(5) + 1;
		int ranus = rnd.nextInt(13) + 3;

		Player me = new Player();
		me.setKinryoku(rnd.nextInt(5) + 1);
		me.setGakuryoku(rnd.nextInt(5) + 1);
		me.setMitame(rnd.nextInt(5) + 1);
		me.setOmosiro(rnd.nextInt(5) + 1);
		Target koku = new Target();
		koku.setHituyougaku(rnd.nextInt(11) + 3);
		koku.setHituyoukin(rnd.nextInt(11) + 3);
		koku.setHituyoumita(rnd.nextInt(11) + 3);
		koku.setHituyouomo(rnd.nextInt(11) + 3);

		for (int count = 0; count < 7; count++) {

			//⑤
			System.out.println(me.getGakuryoku());
			System.out.println(me.getKinryoku());
			System.out.println(me.getMitame());
			System.out.println(me.getOmosiro());

			System.out.println("トレーニングメニューを選択（数字）");
			System.out.println("0.筋トレ,1.勉強,2.整形,3.人と喋る");

			//⑥
			int pr = stdIn.nextInt(4);
			if (pr == 0) {
				me.setKinryoku(me.getKinryoku()+1);
			} else if (pr == 1) {
				me.setGakuryoku(me.getGakuryoku()+1);
			} else if (pr == 2) {
				me.setMitame(me.getMitame()+1);
			} else if (pr == 3) {
				me.setOmosiro(me.getOmosiro()+1);
			}
			//⑦
			int prm = rnd.nextInt(4);
			if (prm == 0) {
				System.out.println("面白さ"+koku.getHituyouomo());
			} else if (prm == 1) {
				System.out.println("見た目"+koku.getHituyoumita());
			} else if (prm == 2) {
				System.out.println("筋肉"+koku.getHituyoukin());
			} else if (prm == 3) {
				System.out.println("学力"+koku.getHituyougaku());
				
			}
			}
			//⑨
			System.out.println("告白する！！！！能力選んで！！！");
			int userParam = stdIn.nextInt();
			int winFlag = 0;
			if (userParam == 1 && me.getKinryoku() >= koku.getHituyoukin()) {
				System.out.println("筋肉は勝った。");
				winFlag = winFlag + 1;
			} else if (userParam == 2 && me.getGakuryoku() >= koku.getHituyougaku()) {
				System.out.println("学力は勝った。");
				winFlag = winFlag + 1;
			} else if (userParam == 3 && me.getMitame() >= koku.getHituyoumita()) {
				System.out.println("見た目は勝った。");
				winFlag = winFlag + 1;
			} else if (userParam == 4 && me.getOmosiro() >= koku.getHituyouomo()) {
				System.out.println("面白は勝った。");
				winFlag = winFlag + 1;
			}

			//ランダムなパラメータを比較
			int randomParam = rnd.nextInt(4);
			if (randomParam == 0 && me.getKinryoku() >= koku.getHituyoukin()) {
				winFlag = winFlag + 1;
			} else if (randomParam == 1 && me.getGakuryoku() >= koku.getHituyougaku()) {
				winFlag = winFlag + 1;
			} else if (randomParam == 2 && me.getMitame() >= koku.getHituyoumita()) {
				winFlag = winFlag + 1;
			} else if (randomParam == 3 && me.getOmosiro() >= koku.getHituyouomo()) {
				winFlag = winFlag + 1;
			}
			if (winFlag > 1) {
				System.out.println("あなたは勝ちました。");
			} else {
				System.out.println("死亡しました。");
			}
		}
	}			
			
			
			
		
	


	
