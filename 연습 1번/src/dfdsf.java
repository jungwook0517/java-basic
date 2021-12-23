
public class dfdsf {

	public static void main(String[] args) {
		//선언
		private String name;
		private int hp;
		private int mp;
		private int lv;
		private int atk;
		private int def;
		private int exp;
		
		public class(String n) {
			name = n;
			hp = 20;
			mp = 10;
			lv = 1;
			atk = 3;
			def = 0;
			exp = 0;
			System.out.println("전사 생성 완료");
			System.out.println("아이디 : " + name + ", 레벨 : " + lv);
			
			public void hunt() {
				hp -= 2;
				exp += 10;
				System.out.println("현재 체력은 " + hp + "가 되었으며 누적경험치는 " + exp + "가 되었다.");
			}
		}

	}

}
