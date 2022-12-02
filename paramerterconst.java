class myexample1{
	private int a1;
	myexample1(){
		this.a1 = 12;
	}
	myexample1(int a){
		this.a1 = a;
	}
	int getter(){
		return this.a1;
	}
}
public class paramerterconst{
	public static void main(String[] args) {
		myexample1 o1 = new myexample1();
		myexample1 o12 = new myexample1(13232);
		System.out.println(o1.getter());
		System.out.println(o12.getter());
	}
}