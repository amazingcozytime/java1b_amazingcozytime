package course21;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);

		System.out.println("地震or台風or降水量");
		int x = stdIn.nextInt(1);
		int y = stdIn.nextInt(2);
		int z = stdIn.nextInt(3);
		int menu1=stdIn.nextInt();
		System.out.println("年別か月別を選んでください");
		System.out.println("1:年別　2:月別");
		int menu2 = stdIn.nextInt();


		int[] typhoon = new int[12];
		typhoon[0] = 1;
		typhoon[1] = 1;
		typhoon[2] = 0;
		typhoon[3] = 0;
		typhoon[4] = 0;
		typhoon[5] = 1;
		typhoon[6] = 4;
		typhoon[7] = 5;
		typhoon[8] = 6;
		typhoon[9] = 4;
		typhoon[10] = 6;
		typhoon[11] = 1;

		int tuki = 1;
		for (int num : typhoon) {

			if (x == typhoon[tuki]) {
				System.out.println(tuki + "月は" + num + "件です。");
				tuki = tuki + 1;
				
				//入力内容に応じて表示メニュー切り分け
				if (menu1 == 1) {
					if (menu2 == 1) {
						//台風の年別を選んだ場合
						int sum = 0;
						for (int i = 0; i < typhoon.length; i++) {
							sum = sum + typhoon[i];
						}
						System.out.println("1年間に起こった台風の総件数は" + sum + "件です。");
					} else {
						//台風の月別を選んだ場合
						System.out.println("見たい月を入力してください。");
						int menu3 = stdIn.nextInt();
						System.out.println(menu3 + "月の台風件数は" + typhoon[menu3 - 1] + "です。");
					}
				}


				int[] quake = new int[12];
				quake[0] = 153;
				quake[1] = 127;
				quake[2] = 130;
				quake[3] = 109;
				quake[4] = 118;
				quake[5] = 164;
				quake[6] = 130;
				quake[7] = 103;
				quake[8] = 103;
				quake[9] = 104;
				quake[10] = 123;
				quake[11] = 141;

				int kensu = 1;
				for (int mun : quake) {

					if (y == quake[kensu]) {
						System.out.println(kensu + "月は" + mun + "件です。");
						kensu = kensu + 1;
						
						//入力内容に応じて表示メニュー切り分け
						if (menu1 == 1) {
							if (menu2 == 1) {
								//台風の年別を選んだ場合
								int sum = 0;
								for (int i = 0; i < quake.length; i++) {
									sum = sum + quake[i];
								}
								System.out.println("1年間に起こった地震の総件数は" + sum + "件です。");
							} else {
								//台風の月別を選んだ場合
								System.out.println("見たい月を入力してください。");
								int menu3 = stdIn.nextInt();
								System.out.println(menu3 + "月の地震件数は" + quake[menu3 - 1] + "です。");
							}
						}









						int[] rain = new int[12];
						rain[0] = 20;
						rain[1] = 58;
						rain[2] = 107;
						rain[3] = 87;
						rain[4] = 114;
						rain[5] = 187;
						rain[6] = 200;
						rain[7] = 59;
						rain[8] = 169;
						rain[9] = 441;
						rain[10] = 158;
						rain[11] = 94;

						int kousui = 1;
						for (int umn : rain) {

							if (z == rain[kousui]) {
								System.out.println(kousui + "月は" + umn + "件です。");
								kousui = kousui + 1;
								
								//入力内容に応じて表示メニュー切り分け
								if (menu1 == 1) {
									if (menu2 == 1) {
										//台風の年別を選んだ場合
										int sum = 0;
										for (int i = 0; i < rain.length; i++) {
											sum = sum + rain[i];
										}
										System.out.println("1年間に起こった雨の降水量は" + sum + "件です。");
									} else {
										//台風の月別を選んだ場合
										System.out.println("見たい月を入力してください。");
										int menu3 = stdIn.nextInt();
										System.out.println(menu3 + "雨の降水量は" + rain[menu3 - 1] + "です。");
									}
								}









							}

						}
					}
				}
			}
		}
	}
}
