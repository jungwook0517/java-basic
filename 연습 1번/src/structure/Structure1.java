package structure;

public class Structure1 {

	public static void getInfo(Person c) {
		
			System.out.println(c.name + "의 정보입니다");
			System.out.println(c.age + "의 정보입니다");
			System.out.println(c.pNum + "의 정보입니다");
			System.out.println(c.uNum + "의 정보입니다");
		
	}
	
	
	public static void main(String[] args) {
		// 사람을 두 명 만들어보세요 (p1,p2)
		Person p1 = new Person();
		p1.name = "고정욱";
		p1.age = 23;
		p1.pNum = "12325058554";
		p1.uNum = 23;
		
		Person p2 = new Person();
		p2.name = "김자바";
		p2.age = 13;
		p2.pNum = "12392310533";
		p2.uNum = 15;
		
		getInfo(p1);
		getInfo(p2);
		
	}

}
