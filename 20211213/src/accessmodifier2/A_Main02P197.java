package accessmodifier2;

import accessmodifier.A_Warrior;

public class A_Main02P197 {

	public static void main(String[] args) {
		// 전사를 하나 만들고 사냥을 3번 하세요.
		A_Warrior w1 = new A_Warrior("천사전사");
		
		// hp가 package friendly일때
		// Package가 달라서 hp변경불가
		w1.hunt();		
		w1.hunt();		
		w1.hunt();		


	}

}
