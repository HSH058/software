package swg_test;

public class ISP {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cook_1 g = new cook_1();
		cook_2 h = new cook_2();
		h.order();
		g.cook();
		g.plate();
		h.pickup();
		h.eat();
	}
}
interface Person {
	void cook();
	void plate();
	void order();
	void pickup();
	void eat();
}
interface Cook {
	void cook();
	void plate();
}
interface Customer {
	void order();
	void pickup();
	void eat();
}

class cook_1 implements Cook{
	@Override
	public void cook() {
		// TODO Auto-generated method stub
		System.out.println("요리하기");
	}
	@Override
	public void plate() {
		// TODO Auto-generated method stub
		System.out.println("플레이팅하기");
	}
}
class cook_2 implements Customer{
	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("주문하기");
	}
	@Override
	public void pickup() {
		// TODO Auto-generated method stub
		System.out.println("음식 가져오기");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("먹기");
	}
}