abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape{
	void draw(){
		System.out.println("drawing rectangle");
	}
}

class circle1 extends Shape{
	void draw();
}

public class AbsClass{
	public static void main(String[] args) {
		Shape s = new Shapœe();
		s.draw();
	}
}