package p1;

import java.util.concurrent.Semaphore;

public class Exercicio3 {

	static int valor;
	static Semaphore semaforo;
	
	public static void main(String[] args) {
		
		int permissoes = 1;
		semaforo = new Semaphore(permissoes);
		for (int i = 0 ; i < 11 ; i++){
			Thread tCalculo = new Exercicio3Thread(i, valor, semaforo);
			tCalculo.start();
		}
		
	}

}
