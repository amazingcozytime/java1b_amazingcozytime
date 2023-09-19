package course40;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int number = 15;
		if (number > 10) {
			System.out.println("でか！！！！！！");
		}
		int age = 20;
		if (age >= 18) {
			System.out.println("大人っすね");

		} else {
			System.out.println("キッズだね");
		}
		int score=85;
		if(score>90) {
			System.out.println("Excellent");
		}else if(score<80&&score<=90) {
			System.out.println("good");
		}else {
			System.out.println("勉強しましょう");
		}
		boolean isRaining=true;
		
		if(isRaining) {
			System.out.println("傘を持ってけー");
		}else {
			System.out.println("良い一日を！");
		}
		
		int num=21;
		int mun=num%2;
		if(mun==0) {
			System.out.println("偶数でっせ");
		}else {
			System.out.println("奇数でっせ");
		}
		
		for(int i=1;i<11;i++) {
			System.out.println(i);
		}
		for(int i=1;i<101;i++) {
			System.out.println(i);
			int hensu=i%2;
			if(hensu==0) {
				System.out.println("現在"+i+"回目のループです。偶数です");
			}
			for(int v=11;v<1;v--) {
				System.out.println(v);
			}
			int sum=0;
				for(int z=1;z<101;z++) {
					sum=sum+z;
				}
				System.out.println(sum);
					
				
				
				
			
		
		
		
			
			

		}

	}
}
