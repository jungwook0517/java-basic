
public class F_EnhancedFor01_162p {

	public static void main(String[] args) {
		// 향상된 for문은 반복문 진행시 타겟으로 배열을 넣습니다.
		// 이 경우 반복실행 횟수는 배열의 내부요서 갯수만큼입니다.
		
		//7개의 요소를 묶어서 arr에 저장
		int[] arr1 = { 100, 211, 339, 475, 591, 600, 700};
		//[] 한개이상 입력, 배열
		// arr1[순번]을 입력해서 내부 요소를 하나만 꺼낼 수 있음(순번은 0부터 시작)
		// System.out.println(arr1[5]);
		//System.out.println(arr1[3]);
		// for(하나씩 받을 변수 : 배열) {
		// 실행문들...;
		//}
		
		// 배열 내부 요소의 개수는 배열명.length로 확인할 수 있다.
		System.out.println("배열 내부 요수 갯수!");
		System.out.println(arr1.length);
	     for (int item: arr1) {
			System.out.println(item);
		//향상된 for문 이전///////
		//for(int i =0; i < 7; i++) {
			//System.out.println(arr1[i]);
			}	
		}
}