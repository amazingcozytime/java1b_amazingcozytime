package course31;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Computer mypc = new Computer("初期ネーム","初期ＣＰＵ",0,"初期ＧＵＲＡＢＯ",100);
		

		mypc.name = "KOKURI MACHINE";
		mypc.cpu = "intel core-i9 139000H";
		mypc.memory = 16;
		mypc.gurabo = "RTX4070";
		mypc.price =250000;
		
		
		mypc.display();
		
		int x=mypc.nebiki(500);
		System.out.println("合計は"+x);
		
		int modori=mypc.cyonebiki(2000);
		System.out.println("合計は"+modori);

}
	
}



		