package structure;

public class ClassMain02P196 {

	public static void main(String[] args) {
		Car p1 = new Car();
		p1.model= "벤츠";
		p1.price = 2500;
		p1.owner = "고정욱";
		
		Car p2 = new Car();
		p2.model = "페라리";
		p2.price = 5600;
		p2.owner = "고정욱";
		
		p1.getInfo();
		p2.getInfo();

	}

}
 