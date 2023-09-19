package course27;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//インスタンス
		//「hu１」はHumanのインスタンス（実体）
		//インスタンスに対してパラメータを設定する。
		
		Human hu1 = new Human();
		hu1.name = "坂本";
		hu1.kotoba = "ラブ＆ピース";
		
		hu1.hp=50;
		hu1.neru();
		System.out.println(hu1.name);
		
		//Chrクラスのインスタンス「numata」を生成
		//attack def spd love mp hp に好きなパラメータを設定してみよう
		
		Chr numata = new Chr();
		numata.attack = 175;
		numata.def = 45;
		numata.spd = 50;
		numata.love = 5;
		numata.mp = 175;
		numata.hp = 50;
		
		//Chrクラスのインスタンス「kajima」を生成
		//パラメータを設定してみよう
		
		Chr kajima = new Chr();
		kajima.attack = 250;
		kajima.def = 150;
		kajima.spd = 50;
		kajima.love = 0;
		kajima.mp = 0;
		kajima.hp = 50;
		
		kajima.naguru(kajima.attack,numata.def);
		
	
			
			
		}
		

		
		
		
		
		

		
		

		
		

	}


