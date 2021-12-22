package constructor;

public class dkdlxpa {

	public static void main(String[] args) { //실행부
		//실행부 작성 (정의부 + 변수명 = new 정의부 ()괄호 후 세미콜론
		Item i1 = new Item(1); //i1는 main에 해당되는 번지수
		Item i2 = new Item(2); //new 뒤에 Item은 힙에 해당
		i2 = null; // i2변수에 들어있던 main 초기화
		Item i3 = new Item(3);
		System.gc();//중간에 메모리 강제회수 명령/ 정해진 순간없이 초기화
		Item i4 = new Item(4);
		Item i5 = new Item(5);
		Item i6 = new Item(6);

	}

}
