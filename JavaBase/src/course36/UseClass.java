package course36;

public class UseClass {
	public static void main(String[] args) {

		Student st = new Student();
		Kaden kaden=new Kaden();
		Kaden kaden2=new Kaden();
		

		st.setName("わたべ");
		st.setCourse("高度情報処理科");
		st.setSchool("国際理工");

		st.display();

		Student st2 = new Student();
		st2.setName("ぬまた");
		st2.setCourse("情報システム科");
		
		
		st2.display();
		
		kaden.name=("冷蔵庫");
		kaden2.name= ("洗濯機");
		kaden.price =10000;
		
		kaden.display();
		kaden2.display();
		

	}
	}

