package constructor;

public class D_Main02P204 {

	public static void main(String[] args) {
		// 실패사례
		C_BasketballPlayer bp1 = new C_BasketballPlayer(175, 120);// 키, 점프력 순으로 전달
        bp1.dunkShoot();
        // 성공사례
        C_BasketballPlayer bp2 = new C_BasketballPlayer(185, 120);// 키, 점프력 순으로 전달
        bp2.dunkShoot();
		
	}

}
