package structure;

public class G_ClassMain01P196 {// 실행부
	// PersonClass의 메서드는 작성할 필요가 없습니다.
	// 이미 PersonClass의 내부에 필요한 메서드를 다 작성해놨기 때문입니다.
	public static void main(String[] args) {
		// 사람을 두 명 만들어 보세요.
		F_PersonClass p1 = new F_PersonClass();
		
		p1.age = 10;
		p1.glasses = true;
		p1. name = "채종훈";
		p1. pNum = "01001010101";
		p1. uNum = 10;
		
		F_PersonClass p2 = new F_PersonClass();
		p2.age = 20;
		p2.glasses = false;
		p2. name = "박자바";
		p2. pNum = "01011111111";
		p2. uNum = 1;
		// 만들 사람 두 명의 정보를 콘솔에 찍어보세요.
		// * 힌트 : getInfo의 소속은?
		p1.getInfo();
		p2.getInfo();
	}

}
