package ex2;

public class Exemplo2 {

	static int a = 8;
	static int b = 3;

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			Ex2ThreadCalc ex2ThreadCalc = new Ex2ThreadCalc(a, b, i);
			ex2ThreadCalc.start();
		}
	}

}
