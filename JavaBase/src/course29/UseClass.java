package course29;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		

		
		Drink drink  =new Drink(100,"初期データ");
		drink.display();
		
		drink.name="午後の紅茶";
		drink.price=150;
		
		drink.display();
		
	int sum=drink.calcsum(drink.price, 17);
	System.out.println("合計は"+sum);
		
		

	}

}
