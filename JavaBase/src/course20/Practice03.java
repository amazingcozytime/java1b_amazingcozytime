package course20;

public class Practice03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	
	int[]moji=new int[5];
	moji[0]=10;
	moji[1]=20;
	moji[2]=30;
	moji[3]=40;
	moji[4]=50;
	
	int num =0;
	//左側に取り出した単品
	//右側に取り出し元の配列
	
	for (int i=0;i<moji.length;i++) {
		num=num+moji[i];
		
		System.out.println(num);


}
}
}
