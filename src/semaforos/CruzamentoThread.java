package semaforos;

import java.util.concurrent.Semaphore;

public class CruzamentoThread extends Thread {
	
	private int carro;
	private Semaphore semaforo;
	
	public CruzamentoThread(int carro, Semaphore semaforo){
		this.carro = carro;
		this.semaforo = semaforo;
	}
	
	public void run(){
		try {
			semaforo.acquire();
			cruza();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally{
			semaforo.release();
		}
//		cruza();
	}

	public void cruza(){
		System.out.println("Carro "+carro+" acelerando");
		passa();
		System.out.println("Carro "+carro+" cruzou");
	}
	
	public void passa(){
		String sentido = "";
		switch (carro){
		case 0:
			sentido = "Esquerda para a direita";
			break;
		case 1:
			sentido = "Baixo para cima";
			break;
		case 2:
			sentido = "Direita para a esquerda";
			break;
		case 3:
			sentido = "Baixo para cima";
			break;
		}
		System.out.println("Carro "+carro+" passando no sentido : "+sentido);
		int tempoPassagem = (int)((Math.random() + 1) * 1000);
		try {
			Thread.sleep(tempoPassagem);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
