import java.util.Arrays;

public class qwdqwdqwd {

	public static void main(String[] args) {
		// 배열의 선언1(길이확정 x)
		int[] a = {1,2,3,4,5,6,7,8,9} ;
		System.out.println(Arrays.toString(a));

		// 배열의 선언2(길이확정X)
		double[] b= {1.2, 2.5, 4.4, 5,6};
		System.out.println(Arrays.toString(b));
		
		// 배열의 생성(길이 확정) // 자동으로 0이 채워집니다.
		int[] c = new int[10]; //10칸짜리 빈 배열 생성 (0~9번까지 전부 0으로 자동으로 채워짐)
		System.out.println(Arrays.toString(c));
		int[] d = new int[25];
		System.out.println(Arrays.toString(d));
		
		// 배열의 길이는 .length로 알 수 있습니다.
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(c.length);
	    System.out.println(d.length);
	}

}
