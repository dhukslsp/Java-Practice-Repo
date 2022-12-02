class Line{
	public void getline(){
		for(int i =0 ;i<3; i++){
			try{
				synchronized(this){
				System.out.println(i);
			}
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
public class othersync extends Thread{
	public void run(){
		Line line = new Line();
		line.getline();
	}
	public static void main(String[] args) {
		othersync oth12 = new othersync();
		oth12.setPriority(Thread.MAX_PRIORITY);
		othersync oth12122 = new othersync();
		oth12.start();
		oth12122.start();
	}
}