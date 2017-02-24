package rev1;

import java.util.concurrent.Semaphore;

public class Acesso {
	
	static Semaphore semaforo;

	public static void main(String[] args) {
		
		semaforo = new Semaphore(1);
		
		for (int i = 0 ; i <= 2 ; i++){
			Thread tAcesso = new AcessoThread(i, semaforo);
			tAcesso.start();
		}
		
	}

}
