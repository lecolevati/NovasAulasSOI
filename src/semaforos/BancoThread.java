package semaforos;

import java.util.concurrent.Semaphore;

public class BancoThread extends Thread{
	
	private int operacao, conta;
	private Semaphore semaforoSaque, semaforoDeposito;
	private float saldo, valor;
	
	public BancoThread(int conta, int operacao, float saldo, float valor, Semaphore semaforoSaque,
			Semaphore semaforoDeposito){
		this.conta = conta;
		this.operacao = operacao;
		this.semaforoSaque = semaforoSaque;
		this.semaforoDeposito = semaforoDeposito;
		this.saldo = saldo;
		this.valor = valor;
	}
	
	public void run(){
		int op = operacao % 2;
		switch(op){
		case 0:
			try {
				semaforoDeposito.acquire();
				System.out.println("Iniciando depósito na conta "+conta);
				deposito();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaforoDeposito.release();
			}
			break;
		case 1:
			try {
				semaforoSaque.acquire();
				System.out.println("Iniciando saque da conta "+conta);
				saque();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaforoSaque.release();
			}
			break;
		}
	}
	
	public void deposito(){
		int espera = (int)((Math.random() * 1000) + 1);
		try {
			Thread.sleep(espera);
			saldo += valor;
			System.out.println("Novo saldo da conta "+conta+" ,após depósito "+saldo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	public void saque(){
		int espera = (int)((Math.random() * 1000) + 1);
		try {
			Thread.sleep(espera);
			saldo += valor;
			System.out.println("Novo saldo da conta "+conta+" ,após saque "+saldo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
