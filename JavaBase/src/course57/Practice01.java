package course57;

import java.util.Random;
import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		//1-100までのランダムな数値を生成し、変数「ransu」に格納する。
				Random rnd = new Random();
				Scanner stdIn = new Scanner(System.in);
				System.out.println("1～100の中で好きな数字を選んでね。");
				int ransu = rnd.nextInt(100) + 1;
				int kaisu=1;
				
				for(int x=0;x<=100;) {
					System.out.println("数字を入力");
					int keisoku=stdIn.nextInt();
					if(ransu==keisoku) {
						System.out.println("あたり");
						System.out.println(kaisu+"回目で当たった");
						break;
					}	else if(ransu<keisoku) {
						System.out.println("ひくい");
						 kaisu=kaisu+1;
					}	else if(ransu>keisoku) {
						System.out.println("たかい");
						kaisu=kaisu+1;
					}
				}

	}

}
