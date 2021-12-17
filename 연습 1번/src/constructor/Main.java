package constructor;

public class Main {

	public static void main(String[] args) {
		//실패사례
		BasketballPlayer bp1 = new BasketballPlayer(175,120);
		bp1.dunkShoot();
		//성공사례
		BasketballPlayer bp2 = new BasketballPlayer(185,120);
		bp2.dunkShoot();

	}

}
