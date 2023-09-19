package course30;

public class Books {
	String name;
	String author;
	int page;

	Books(String n, int page, String a) {
		name = n;
		author = a;
		page=page;
	}

	void display() {
		System.out.println(name);
		System.out.println(author);
		System.out.println(page);

	}

}
