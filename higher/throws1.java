public class throws1{
	int devision(int a,int b) throws ArithmeticException
	{
		int t = a/b;
		return t;
	}
	public static void main(String[] args) {
		throws1 obj = new throws1();
		try{
			System.out.println(obj.devision(18,0));
		}
		catch (ArithmeticException e){
			System.out.println("You musn't devide the number by zero for not causing the ArithmeticException");
		}
	}
}