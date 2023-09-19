package course54_55;

public class StudentControll {
	public static void main(String[] args) {
		
		Student tonari=new Student(5,"大澤 聡");
		Student me=new Student(19,"長縄 佑海");
		
		Student[] mymen=new Student[2];
		mymen[0]=tonari;
		mymen[1]=me;
		
		mymen[0].setName("なわ");
		System.out.println(mymen[1].getName());


	}
}