package course54_55;
import java.util.Scanner;
public class TyphoonControll {
	public static void main(String[] args) {
		System.out.println("0・・・アジア名表示");
		System.out.println("99・・・台風情報編集");
		System.out.println("55・・・新規追加");
		Scanner stdIn = new Scanner(System.in);
		int a=stdIn.nextInt();
		
		Typhoon typhoon1=new Typhoon(1,"20220408","マラカス");
		Typhoon typhoon2=new Typhoon(2,"20220410","メーギー");
		Typhoon typhoon3=new Typhoon(3,"20220630","チャバ");
		Typhoon typhoon4=new Typhoon(4,"20220701","アイレー");
		Typhoon typhoon5=new Typhoon(5,"20220728","ソングダー");
		Typhoon typhoon6=new Typhoon(6,"20220731","トローセス");
		Typhoon typhoon7=new Typhoon(7,"20220809","ムーラン");
		Typhoon typhoon8=new Typhoon(8,"20220812","メアリー");
		Typhoon typhoon9=new Typhoon(9,"20220822","マーゴン");
		Typhoon typhoon10=new Typhoon(10,"","");
		Typhoon typhoon11=new Typhoon(11,"","");
		Typhoon typhoon12=new Typhoon(12,"","");
		Typhoon typhoon13=new Typhoon(13,"","");
		Typhoon typhoon14=new Typhoon(14,"","");
		Typhoon typhoon15=new Typhoon(15,"","");
		
		
		Typhoon[]typhoonList=new Typhoon[15];
		typhoonList[0]=typhoon1;
		typhoonList[1]=typhoon2;
		typhoonList[2]=typhoon3;
		typhoonList[3]=typhoon4;
		typhoonList[4]=typhoon5;
		typhoonList[5]=typhoon6;
		typhoonList[6]=typhoon7;
		typhoonList[7]=typhoon8;
		typhoonList[8]=typhoon9;
		typhoonList[9]=typhoon10;
		typhoonList[10]=typhoon11;
		typhoonList[11]=typhoon12;
		typhoonList[12]=typhoon13;
		typhoonList[13]=typhoon14;
		typhoonList[14]=typhoon15;
		
		if(a==0) {
		for(int i=0;i<9;i++) {
		System.out.println(typhoonList[i].getAsiaName());
		}
		}
		if(a==99) {
			System.out.println("台風番号入力");
			int x=stdIn.nextInt();
			System.out.println("名前変更");
			String y=stdIn.next();
			typhoonList[x-1].setAsiaName(y);
			for(int i=0;i<9;i++) {
				System.out.println(typhoonList[i].getAsiaName());
			
		}
		

	}
		
		if(a==55) {
			
			System.out.println("台風番号入力");
			int z=stdIn.nextInt();
			System.out.println("発生日");
			String xx=stdIn.next();
			System.out.println("台風名");
			String yy=stdIn.next();
			typhoonList[z-1].setHasseibi(xx);
			typhoonList[z-1].setAsiaName(yy);
			for(int i=0;i<14;i++) {
				System.out.println(typhoonList[i].getTyphoonbango());
				System.out.println(typhoonList[i].getHasseibi());
				System.out.println(typhoonList[i].getAsiaName());
				
				
				
				
			}
				
		}

}
}
