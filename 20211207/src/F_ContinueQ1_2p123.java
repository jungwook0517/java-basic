import java.util.Scanner;

public class F_ContinueQ1_2p123 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int n = scan.nextInt();
		
		int total = 0;
		
		for(int a = 0; a <n; a++) {
			if(a %2 ==0) {
				continue;
			}
            total += a;
	}
    System.out.println("총합 :" + total);
}
}