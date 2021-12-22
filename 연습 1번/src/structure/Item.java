package structure;

public class Item {

    public int num;
    public Item(int n) {
    	num = n;
    	System.out.println(num + "n번 객체 생성");
    	
    }
    
    // 소멸자는 finalize()
    // 생성자는 객체가 생성될 때 반드시 호출되고
    // 소멸자는 객체가 소멸될대 호출됩니다.
    protected void finalize() {
    	System.out.println(num + "객체 삭제.");
    }
}
