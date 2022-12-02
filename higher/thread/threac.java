	class threadDemo extends Thread{
		private Thread t;
		private String threadname;
		threadDemo(String Name){
			threadname = Name;
			System.out.println("This is a new name");
		}
		public void run(){
			System.out.println("Running" + threadname);
			try{
				for(int i = 4;i>0;i--){
					System.out.println("Thread: "+threadname+", "+i);
					Thread.sleep(50);
				}} catch(InterruptedException e){
				System.out.println("thread: "+ threadname + " interrupted");
				}
			System.out.println("thread "+threadname + "exitting");
			}
		public void start(){
			System.out.println("Starting "+ threadname);
			if(t == null){
				t = new Thread(this.threadname);
				t.start();
			}
		}
	}
	public class threac{
		public static void main(String[] args) {
			threadDemo t1 = new threadDemo("thread-1");
			t1.start();
			threadDemo t2 = new threadDemo("thread-2");
			t2.start();
		}
	}