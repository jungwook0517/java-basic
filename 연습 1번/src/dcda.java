
public class dcda {

	public static int add2(int a) {
		return a+1;
	}
	public static void main(String[] args) {
		// 반환자료가 void가 아닌 경우는 호출 위치에
		// return은 오른쪽 자료를 그대로 갖다놓습니다.
		// 자료를 반환하는 것은 console창에 표시한다 라는 말과는 다른 의미입니다.
		int b = add2(10);
		System.out.println(b);

	}

}
