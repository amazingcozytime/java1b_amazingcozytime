package course44;

public class Useclass {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Human human =new Human();
		
		
		human.setName("システム太郎");
		human.setHobby("プログラミング");
		human.setWeight(60000);
		
		human.disp();
		human.dispweight();
		
		human.eat("ハンバーガー",1200);
		
		human.dispweight();
		
		Animal animal=new Animal();
		animal.setName("サイ");
		animal.setWeight(7000000);
		animal.setKari("角で相手を粉砕する");
		animal.setJumyou(30);
		animal.death(animal.getName());
		
		animal.display();
		
	}
}
