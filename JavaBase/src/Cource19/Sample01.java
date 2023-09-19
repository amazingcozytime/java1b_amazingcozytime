package Cource19;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String x = "大関";
		String y = "杉本";
		String z = "藤倉";
		String v = "長縄";

		System.out.println(x);
		System.out.println(v);
		System.out.println(z);
		System.out.println(y);

		String a = "臼井";
		String b = "土屋";
		String c = "大倉";
		String d = "鹿嶋";

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		//配列の鉄板構文
		//[]のことを要素と呼ぶ要素は０から始まる
		String[] namelist = new String[10];
		namelist[0] = "大関";
		namelist[1] = "杉本";
		namelist[2] = "藤倉";
		namelist[3] = "長縄";
		namelist[4] = "臼井";
		namelist[5] = "土屋";
		namelist[6] = "大倉";
		namelist[7] = "鹿嶋";
		
		for(int i =0; i<3; i++) {
			System.out.println("俺の友達は"+namelist[i]+"だ。");
		}

	}

}
