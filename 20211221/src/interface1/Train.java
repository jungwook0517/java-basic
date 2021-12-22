package interface1;

// Vehicle을 구현하기 위해 implements 를 활용합니다.
public class Train implements Vehicle {

	// 속도, 연료량, 기관사명을 선언합니다.
	private int speed;
	private int gas;
	private String name;
	
	// 오버라이드 해서 사용해야하는 구현메서드
	@Override
	public void accel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accek() {
		// 최대속도 300/ 50씩 증가
		if(speed + 50 > 300) {
		    speed  = 300;
	}else {
		speed += 50;
	}
	// 가속 후 연료 차감
	// -7씩 차감
	gas -= 7;
}

	@Override
	public void breakSpeed() {
		// 감속도 50씩
		if(speed - 50 < 0) {
			speed = 0;
		} else {
	        speed -= 50;
		}
		
		
		
	}

	
	
	
	
}
