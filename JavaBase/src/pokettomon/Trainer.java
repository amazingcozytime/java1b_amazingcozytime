package pokettomon;
import java.util.Random;

public class Trainer {
	String name;
	pocketon[]myPockes;
	Trainer(){
		name="";
		myPockes=new pocketon[6];
		
		
			
		}
	
	void capture(pocketon pocke) {
		Random rand=new Random();
		int ransu=rand.nextInt(10)+1;
		if(ransu>pocke.difficult) {
			System.out.println("次はいける");
			
		}else if(ransu<=pocke.difficult) {
			System.out.println("やったね！");
			for(int i=0;i<6;i++) {
				if(myPockes[i]==null) {
					myPockes[i]=pocke;
					i=i+100;
				}
			}
		}
	}
	
	void display() {
	System.out.println("現在の手持ちは以下の通りです");
	for (int i = 0; i < myPockes.length; i++) {
	if (myPockes[i] == null) {
	System.out.println("ポケトンなし");
	}else {
	System.out.println (myPockes[i].name);
	
		
	}
	}
}
}