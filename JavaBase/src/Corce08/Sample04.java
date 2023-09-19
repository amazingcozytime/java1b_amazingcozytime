package Corce08;

import java.util.Scanner;

public class Sample04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("肉、魚、野菜、何が好きですか");
		String like= stdIn.next();
		//swith文鉄板構文
		switch(like) {
		case"魚":
		System.out.println("魚が好きです。");
		//以降の判定をスキップ
		break;
		
		case"肉":
		System.out.println("肉が好きです。");
		break;
		//どれにも該当しない場合
		default:
		System.out.println("野菜派です。");
		

		
	}

}
}
