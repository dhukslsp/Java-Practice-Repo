class thobj extends Thread {
	public void run(){
		System.out.println("Thread runned");

	}
	public static void main(String[] args) {
		thobj obj12121 = new thobj();
		obj12121.start();
	}
}