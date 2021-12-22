package accessmodifier;

public class B_MainP197 {

	public static void main(String[] args) {
		// 전사를 하나 만들고 사냥을 3번 하세요.
		A_Warrior w1 = new A_Warrior("전사전사");
		//w1.hp = 10000000;// private 요소 hp는 main지역에서 직접 값 못바꿈
		w1.hunt();
		w1.hunt();
		w1.hunt();
	}
}