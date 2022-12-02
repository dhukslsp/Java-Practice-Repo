class Bike9{
	final void run(){
		System.out.println("Running");
	}
}
class Honda extends Bike9{
	void run(){
		System.out.println("Running safely");
	}
}
public class final1{
	public static void main(String[] args) {
		Honda obj = new Honda();
		obj.run();
	}
}