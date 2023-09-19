package course35;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn=new Scanner(System.in);
		
	int x=stdIn.nextInt();
	
	if(x>=50) {
		int y=stdIn.nextInt();
		calc(x,y);
	}else {
		calc(x);
	}
		
		
	}
	static void calc(int x , int y) {
		 int sum=x+y;
		System.out.println("値は"+sum);
	}
	static void calc(int x) {
		 int usm=x*10;
		System.out.println("値は"+usm);
	}


}
