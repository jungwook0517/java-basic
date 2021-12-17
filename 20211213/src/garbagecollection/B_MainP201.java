package garbagecollection;

public class B_MainP201 {

	public static void main(String[] args) {
		// 6개 객체생성
		A_Item i1 = new A_Item(1);
		A_Item i2 = new A_Item(2);
		i2 = null;
		A_Item i3 = new A_Item(3);
		// 메모리 중간에 회수하도록 강제 명령
		System.gc();
		A_Item i4 = new A_Item(4);
		i4 = null;
		A_Item i5 = new A_Item(5);
		i1 = null;
		System.gc();
		A_Item i6 = new A_Item(6);

	}

}
