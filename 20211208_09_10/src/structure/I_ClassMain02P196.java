package structure;

public class I_ClassMain02P196 {// 실행부

	public static void main(String[] args) {
		// 차 2대 생성
		H_Car p1 = new H_Car();
		p1.model = "벤츠";
		p1.price = 3000;
		p1.owner = "고정욱";

		H_Car p2 = new H_Car();
		p2.model = "포르쉐";
		p2.price = 500000;
		p2.owner = "고정욱";
		// 콘솔에 정보 찍기
		p1.getInfo();
		p2.getInfo();
	}
}
