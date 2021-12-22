package constructor;

public class Item {
	//특징 설정
	public int num;
	//생성자 생성
	public Item(int n) {
		num = n;
		System.out.println(num + "번 객체 생성");
	}
	protected void finalize() {
		System.out.println(num + "객체 삭제.");
	}
	

}
