
public class dsfsdfsdfsdf {
	public static int mul(int num1, int num2, int num3) {
		return num1 * num2 * num3;
	}
public static void info() {
	System.out.println("안녕하세요");
	System.out.println("자바 메서드 학습중입니다.");
	System.out.println("1번의 호출로 3줄을 콘솔에 작성합니다.");
}
	
	public static void main(String[] args) {
		int result = mul(10,20,30);
		for(int i= 0; i < 3; i++) {
			info();
		}

	}

}
