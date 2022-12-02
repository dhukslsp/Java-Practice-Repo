interface A{
	int x = 10;
}
interface B{
	int y = 100;
}
class interff implements A,B{
	public static void main(String[] args) {
		System.out.println(A.x);	
	}
}