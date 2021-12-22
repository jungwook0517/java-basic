package zzz;

public class BasketballPlayer {
	public int height;
	public int jumpHeight;
  // 특성정의 height(키) , jumpHeight (점프력)
  // 키랑 점프력 둘다 입력받게 만든다.
 
	//생성자 생성
	public BasketballPlayer(int h, int j) {
		height = h;
		jumpHeight = j;
		System.out.println("생성된 선수의 키 : " + height + ", 점프력 : " + jumpHeight);
	}
	
	// 덩크슛하기 라는 행동을 작성합니다.
	public void dunkShoot() {
		if(height + jumpHeight >300) {
			System.out.println("덩크 성공");
			}else {
				System.out.println("덩크 실패");
			}
	}
	// 키 + 점프력이 300이 넘는다면 덩크에 성공했다는 메세지를 보내주기위해 조건문 작성
	

	
}
