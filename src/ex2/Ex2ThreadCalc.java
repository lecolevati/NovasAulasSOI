package ex2;

public class Ex2ThreadCalc extends Thread {

	private int a, b, operacao;
	
	public Ex2ThreadCalc(int a, int b, int operacao){
		this.a = a;
		this.b = b;
		this.operacao = operacao;
	}
	
	public void run(){
		calc(a,b,operacao);
	}
	
	
	public static void calc(int a, int b, int operacao){
		int res = 0;
		String op = "";
		switch(operacao){
		case 0:
			res = a + b;
			op = "+";
			break;
		case 1:
			res = a - b;
			op = "-";
			break;
		case 2:
			res = a * b;
			op = "*";
			break;
		case 3:
			res = a / b;
			op = "/";
			break;
		}
		System.out.println(a + " " + op + " " + b + " = " + res);
	}
}
