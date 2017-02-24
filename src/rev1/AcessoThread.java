package rev1;

import java.util.concurrent.Semaphore;

public class AcessoThread extends Thread{

	int idThread;
	static int numero;
	Semaphore semaforo;
	
	public AcessoThread(int idThread, Semaphore semaforo){
		this.idThread = idThread;
		this.semaforo = semaforo;
	}
	
	public void run(){
		try {
			semaforo.acquire();
			calcula();
			exibe();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
		}
	}
	
	public void calcula(){
		for (int i = 0 ; i <= idThread ; i++){
			numero += idThread * i;
		}
	}
	
	public void exibe(){
		System.out.println(numero);
	}
}