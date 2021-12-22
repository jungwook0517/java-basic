package structure;

public class Catstructure {

	public static void getCatInfo(Cat c) {
		System.out.println(c.name + "의 정보입니다");
		System.out.println(c.age + "의 정보입니다");
		System.out.println(c.kind + "의 정보입니다");
	}
	
	public static void main(String[] args) {
		Cat a = new Cat();
		a.name = "고두심";
		a.age = 23;
		a.kind = "코숏";
		
		getCatInfo(a);

	}

}
