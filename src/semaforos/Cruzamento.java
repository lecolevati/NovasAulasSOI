package semaforos;

import java.util.concurrent.Semaphore;

public class Cruzamento {

	public static Semaphore semaforo;
	
	public static void main(String[] args) {

		int maxCarros = 1;
		semaforo = new Semaphore(maxCarros);
		for (int i = 0 ; i < 4 ; i++){
			Thread tCarro = new CruzamentoThread(i, semaforo);
			tCarro.start();
		}
		
	}

}
