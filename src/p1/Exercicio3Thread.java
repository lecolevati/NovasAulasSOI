package p1;

import java.util.concurrent.Semaphore;

public class Exercicio3Thread extends Thread {
	
	private int idThread;
	private int valor;
	private Semaphore semaforo;
	
	public Exercicio3Thread(int idThread, int valor, Semaphore semaforo){
		this.idThread = idThread;
		this.valor = valor;
		this.semaforo = semaforo;
	}
	
	public void run(){
		try {
			semaforo.acquire();
			calcula();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	public void calcula(){
		valor = idThread * 10 ;
		System.out.println(valor);
	}

}
