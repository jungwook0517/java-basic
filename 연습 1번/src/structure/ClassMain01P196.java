package structure;

public class ClassMain01P196 {
	// PersonClass의 메서드는 작성할 필요가 없습니다.
	// 이미 PersonClass의 내부에 필요한 메서드를 다 작성해놨기 때문입니다.

	public static void main(String[] args) {
		PersonClass p1 = new PersonClass();
		
		p1.age = 10;
		p1.glasses = true;
		p1.name = "고정욱";
		p1.pNum = "01011111111";
		p1.uNum = 10;
		
		PersonClass p2 = new PersonClass();
		p2.age = 22;
		p2.glasses = false;
		p2.name = "김기자";
		p2.pNum = "01021212151";
		p2.uNum = 24;
		
		// 만든 사람 두 명의 정보를 콘솔에 찍어보세요.
	    // *힌트 : getInfo의 소속은?
		p1.getInfo();
		p2.getInfo();

	}

}
