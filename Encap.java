class Newclass{
		private int num = 1212;
		void setNum(int value){
			this.num = value;
		}
		void getNum(){System.out.println(this.num);}
	}
public class Encap{
	public static void main(String[] args) {	
	Newclass obj12 = new Newclass();
	o bj12.setNum(12);
	obj12.getNum();
	}
}