package structure;

public class E_Structure03P190 {//Cat의 실행부
	public static void getCatInfo(D_Cat p) {
		System.out.println(p.name + "고양이의 정보입니다.");
		System.out.println("이름 : " + p.name + ", 나이 : " + p.age + ", 종류 : " + p.kind);
	}

	public static void main(String[] args) {
		
		D_Cat a = new D_Cat();
		a.name ="로케";
		a.age = 4;
		a.kind ="코숏";
		
		D_Cat b = new D_Cat();
		b.name = "콩이";
		b.age = 3;
		b.kind = "코숏";
		
		getCatInfo(a); 
		getCatInfo(b);

	}

}
