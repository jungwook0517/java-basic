package interface1;

// 인터페이스는 interface 선언을 사용합니다.
// 내부에는 상수인 값과 추상메서드만 선언할 수 있습니다.
// 애초에 구현(implements)을 전제로 설계되기 때문에
// 일반 변수, 메서드를 내부에 선언할 수 없습니다.
// 다형성에서는 부모클래스의 역할을 합니다.
public interface Vehicle {
    // 최대 연료량
	// 바로 상수로 잡힙니다.
	int MAX_GAS = 100;
	//최저속도(0) - 공용
	int MIN_SPD = 0;
	//(CAR)최대속도, 연료 증가량, 연료 감소량, 속도 증가량, 속도 감소량
	int CAR_INCREASE_SPD = 10;
	int CAR_DECREASE_SPD = 10;
	// 비행기 전용으로 만드는 상수
	int Ariplane_MAX_GAS = 1000;
	
	// 탈 것이라면 가지고 있을 공통적 기능을 전부 추상메서드로 작성
	// {
	//     실행문...
	// }
	// 와 같은 실행문 부분(메서드의 body) 없이 선언만 해 주세요.
	
	public void accel(); //가속
	public void breakSpeed(); //감속
	public void refuel(); // 주유
	
}
