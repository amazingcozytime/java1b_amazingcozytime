package course23;

public class Practice02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int a=10;
		int b=20;
		
		//int型「a」「b」をメソッドに渡して呼び出す
		plus(a,b);
		System.out.println("呼び出し終わったよ");

	}
	
	//呼び出される側
	//int「a」の値が「x」に「b」の値がint「y」に格納されている
	static void plus(int x,int y) {
		System.out.println(x+y);
		
	}

}
