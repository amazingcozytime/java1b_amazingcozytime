package course32;

public class Kaden {
	
	private String name;
	private int price;
	private String category;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name.equals("マウス")) {
			this.name="設定NG";
		}else{
			this.name=name;
		}
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	public String getcategory() {
		return category;
	}
		public void setcategory(String category) {
		if(category.equals("大型")) {
			this.category=category;
		}else{
			this.category="設定NG";
		
		
	}

		}
}
