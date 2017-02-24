package ex1;

public class Ex1ThreadSub extends Thread {
	
	private int a, b, res;
	
	public Ex1ThreadSub (int a, int b){
		this.a = a;
		this.b = b;
	}

	public void run(){
		res = a - b;
		System.out.println(a + " - " + b + " = "+ res);
	}
	
}
