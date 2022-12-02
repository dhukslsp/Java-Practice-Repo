class parent{
	void p1rint(){
		System.out.println("Parent Class");		
	}
}
class subclass extends parent{
	void p1rint(){
		System.out.println("new");
	}
}
public class m112this1{
	public static void main(String[] args) {
		subclass obj12 = new subclass();
		obj12.p1rint();	
	}
}