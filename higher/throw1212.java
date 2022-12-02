public class throw1212{
	void checkage(int age){
		if(age<18){
			throw new ArithmeticException("Not Eligible For voting");
		}
		else{
			System.out.println("Eligible For Voting");
		}
	}
	public static void main(String[] args) {
			throw1212 obj1 = new throw1212();
			obj1.checkage(9);
		}
}