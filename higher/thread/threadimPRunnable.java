// java thread method by implementing a runnable interface
class threadimPRunnable implements Runnable{
	public void run(){
		System.out.println("Running");
	}
	public static void main(String[] args) {
		Multi3 obj1 = new Multi3();
		Thread newth = new Thread(obj1);
		newth.start();
	}
}