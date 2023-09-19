package course39;

public class UseClass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Student student=new Student();
		student.name="長縄";
		student.no=19;
		
		Student student1=new Student();
		student.name="清水";
		student.no=12;
		
		Student[]myfriend=new Student[2];
		myfriend[0]=student;
		myfriend[1]=student1;
		for(int i=0;i<2;i++) {
			System.out.println(i);
			
			
			
		}
		
		
		

	}

}
