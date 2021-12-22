package zzz;

public class Main01P204 {

	public static void main(String[] args) {
		// 자동차 한 대를 만들어주세요.
		// 연료량은 100
		// 속도는 0
		// 주인은 본인이름으로 만들어주세요.
		
		Car c1 = new Car(100, 0, "고정욱");
		// 생성자로 gas, speed, owner를 처리
	    //asdf.gas = 100;
	    //asdf.speed = 0;
	    //asdf.owner ="고정욱";
		// 차를 뽑자마자 상태 확인
		c1.getInfo();
		// 엑셀 두번 밟기
		c1.accelSpeed();
        // 상태 다시 확인
		c1.getInfo();
		// 브레이크 밟기
		c1.breakSpeed();
		//정보 확인
		c1.getInfo();
		// 가솔린 충전
		c1.putGas();
		// 상태 확인
		c1.getInfo();
	}

}
