interface A{
	int x = 10;
}
interface B{
	int x = 12;
}
public class interface112 implements A,B{
	public static void main(String[] args) {
		System.out.println(A.x);
		System.out.println(B.x);
	}
}