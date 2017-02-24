package exercicios;

import javax.swing.JTextField;

public class TelaThread extends Thread{

	private JTextField tfTela;
	
	public TelaThread(JTextField tfTela){
		this.tfTela = tfTela;
	}
	
	public void run(){
		giraTela();
	}
	
	public void giraTela(){
		int numeroGiros = (int)((Math.random() * 150) + 1);
		for (int contaGiros = 0 ; contaGiros <= numeroGiros ; contaGiros++){
			int numeroTela = (int)((Math.random() * 7) + 1);
			tfTela.setText(String.valueOf(numeroTela));
			try {
				Thread.sleep(10);
			} catch (InterruptedException ex){
				ex.printStackTrace();
			}
		}
	}
	
}
