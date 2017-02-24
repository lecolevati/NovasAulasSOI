package ex1;

public class Exemplo1 {

	static int a = 8;
	static int b = 3;
	
	public static void main(String[] args) {

		Ex1ThreadSoma ex1ThreadSoma = new Ex1ThreadSoma(a, b);
		Ex1ThreadDiv ex1ThreadDiv = new Ex1ThreadDiv(a, b);
		Ex1ThreadMult ex1ThreadMult = new Ex1ThreadMult(a, b);
		Ex1ThreadSub ex1ThreadSub = new Ex1ThreadSub(a, b);
		ex1ThreadSoma.start();
		ex1ThreadSub.start();
		ex1ThreadMult.start();
		ex1ThreadDiv.start();
	}

}
