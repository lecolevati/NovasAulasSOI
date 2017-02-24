package ex1;

public class Ex1ThreadDiv extends Thread {
	
	private int a, b, res;
	
	public Ex1ThreadDiv (int a, int b){
		this.a = a;
		this.b = b;
	}

	public void run(){
		res = a / b;
		System.out.println(a + " / " + b + " = "+ res);
	}
	
}
