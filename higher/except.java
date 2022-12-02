public class except {
	public static void main(String[] args) {
		try{
			int x = 10;
			int y = 200;
			int sum = x/y;
			System.out.println(sum);
		}
		catch (ArithmeticException e){
			System.out.print("This is a main Arthamatic Exception \n");
		}
		finally{
			System.out.println("I am inside the finally");
		}
	}
}