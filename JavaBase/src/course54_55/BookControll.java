package course54_55;

public class BookControll {
	public static void main(String[] args) {
		int[] i = new int[5];
		i[0] = 10;
		i[1] = 11;
		i[2] = 12;
		i[3] = 13;
		i[4] = 14;
		System.out.println(i[3]);
		
		Book book1=new Book("明解java",1500);
		System.out.println(book1.getPrice());
		
		Book book2=new Book("ITパスポート試験問題集",2500);
		System.out.println(book2.getPrice());
		System.out.println(book2.getTitle());
		
		Book book3=new Book("30時間でマスターVisualBasic",1200);
		System.out.println(book3.getPrice());
		System.out.println(book3.getTitle());
		
		Book book4=new Book("確かな力が身につくC",2800);
		System.out.println(book4.getPrice());
		System.out.println(book4.getTitle());
		
		Book[]hondana=new Book[4];
		hondana[0]=book1;

	}
}