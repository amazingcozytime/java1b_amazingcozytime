package course53;

public class Bookcontroll {
	public static void main(String[] args) {

		Book book1 = new Book();
		

		//Book book2 = new Book("ITワールド");
		String userInputitle="あ";
		int userInputPrice=100;
		
		Book book3=new Book("あ",100);
		
		System.out.println(book3.getPrice());
		System.out.println(book3.getTitle());
	}
}	
