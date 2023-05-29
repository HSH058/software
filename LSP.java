package swg_test;

public class LSP {
	int speed;
	void drive() { 
		this.speed += 10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus f = new Bus();
		f.drive();
	}
}
class Bus extends LSP {
	int speed;
	int km;
	
	@Override 
	void drive() {
		// 부모 기능 그대로 수행
		this.speed += 10;
		
		// 하위 타입 기능 추가
		this.km += 1;
		System.out.println(this.speed);
		System.out.println(this.km);
	}
}