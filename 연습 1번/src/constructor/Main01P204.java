package constructor;

public class Main01P204 {

	public static void main(String[] args) {
		// 자동차 한 대를 만들어주세요
		// 연료량은 100
		// 속도는 0
		// 주인은 본인이름
		Car a = new Car();
		a.gas = 100;
		a.speed = 0;
		a.owner = "고정욱";
		
		//차를 뽑자마자 먼저상태 확인
		a.getInfo();
		// 엑셀을 두번 밟아주세요.
		a.accelspeed();
		a.accelspeed();
		//상태 다시 확인
		a.getInfo();
		//브레이크 밟기
		a.breakspeed();
		// 상태 다시 확인
		a.getInfo();
		

	}

}
