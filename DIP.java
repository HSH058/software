package swg_test;

public interface DIP {
	void read();
	void save();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComicBook d = new ComicBook();
		Magazine e = new Magazine();
		d.read();
		d.save();
		e.read();
		e.save();
	}
}

class ComicBook implements DIP{
	public void read() {
		System.out.println("ComicBook read");
	}
	public void save() {
		System.out.println("ComicBook save");
	}
}

class Magazine implements DIP{
	public void read() {
		System.out.println("Magazine read");
	}
	public void save() {
		System.out.println("Magazine save");
	}
}