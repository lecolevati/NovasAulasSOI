package rev1;

import java.util.concurrent.Semaphore;

public class ThreadCalc extends Thread {
	
	static int somador;
	int[] vetor;
	int somaVetor, idThread;
	Semaphore semaforo;
	
	public ThreadCalc(int[] vetor, int idThread, Semaphore semaforo){
		this.vetor = vetor;
		this.idThread = idThread;
		this.semaforo = semaforo;
	}
	
	public void run(){
		calcula();
		total();
		try {
			semaforo.acquire();
			if(idThread == 2){
				Thread.sleep(1000);
				mostraSomador();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
		}
	}
	
	public void calcula(){
		for (int i = 0 ; i < vetor.length ; i++){
			somaVetor += vetor[i];
		}
		System.out.println("Total "+somaVetor);
	}
	
	public void total(){
		somador += somaVetor;
	}
	
	public void mostraSomador(){
		System.out.println(somador);
	}
}
