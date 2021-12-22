package zzz;

public class Webtoon {

	// 웹툰에 특성은 이름, 몇 회차인지, 작가, 완결여부 만들어주시고
	// 생성자 생성
	// 웹툰 회차 = 1회부터 시작, 연재작 처음은 미완결 상태
	// 이름이랑, 작가 이름은 사용자에게 입력받기
	// getInfo 로 현재상태 조회
	// uploadWebtoon 동작추가
	//회차가 진행될 때 마다 series를 1씩 올려줍니다.
	//completeWebtoon 동작추가로, 완결로 만들어주기
	// 메인 02 생성 후 2회차 까지 진행 후 완결 시켜주세요
	
	public String name;
	public int series;
	public String painter;
	public boolean complete;
	
	public Webtoon(String n, String p) {
		name = n;
		series = 1;
		painter = p;
		complete = false;
		System.out.println("웹툰제목 : " + n + "회차 : " + series + "작가 : " + p + "완결여부 : " + complete);
		
	}
	

}
