package course29;

public class Drink {
	String name;
	int price;

	//コンストラクタ追加
	//コンストラクタはメインクラスでnewをした時に自動的に発動する。
	Drink(int p, String n) {
		price = p;
		name = n;
	}

	void display() {
		System.out.println("商品名は" + name);
		System.out.println("値段は" + price);
	}

	int calcsum(int price, int suryo) {
		int sum = price * suryo;
		return sum;

	}
}
