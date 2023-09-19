package course31;

public class Computer {

	String name;
	String cpu;
	int memory;
	String gurabo;
	int price;
	
	Computer(String n,String c,int m,String g,int p) {
		price = p;
		name = n;
		memory=m;
		cpu=c;
		gurabo=g;
	}
		

	void display() {
		System.out.println(name);
		System.out.println(cpu);
		System.out.println(memory);
		System.out.println(gurabo);
		System.out.println(price);
	}
	int nebiki(int nebikigaku) {
		int x = price-nebikigaku;
		return x;
	}
		
		int cyonebiki(int nebikigaku) {
			int modori = price-nebikigaku*3;
			return modori;

			
		}
}

