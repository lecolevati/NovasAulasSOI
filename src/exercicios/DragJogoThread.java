package exercicios;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DragJogoThread extends Thread{

	private JLabel lblCorredor1, lblCorredor2, lblCorredor3;
	private JTextField tfVencedor, tfSegundo, tfTerceiro;
	private int distanciaMaxima;
	private JButton btnJogar;
	
	public DragJogoThread(JLabel lblCorredor1, JLabel lblCorredor2, JLabel lblCorredor3, JTextField tfVencedor, JTextField tfSegundo, JTextField tfTerceiro, int distanciaMaxima, JButton btnJogar){
		this.lblCorredor1 = lblCorredor1;
		this.lblCorredor2 = lblCorredor2;
		this.lblCorredor3 = lblCorredor3;
		this.tfSegundo = tfSegundo;
		this.tfTerceiro = tfTerceiro;
		this.tfVencedor = tfVencedor;
		this.distanciaMaxima = distanciaMaxima;
		this.btnJogar = btnJogar;
	}
	
	public void run(){
		jogo();
	}
	
	public void jogo(){
		Thread tCorredor1 = new DragRaceThread(lblCorredor1, tfVencedor, tfSegundo, tfTerceiro, distanciaMaxima,"Sonic");
		Thread tCorredor2 = new DragRaceThread(lblCorredor2, tfVencedor, tfSegundo, tfTerceiro, distanciaMaxima,"Papa Léguas");
		Thread tCorredor3 = new DragRaceThread(lblCorredor3, tfVencedor, tfSegundo, tfTerceiro, distanciaMaxima,"Tails");
		tCorredor1.start();
		tCorredor2.start();
		tCorredor3.start();
		while (tCorredor1.isAlive() || tCorredor2.isAlive() || tCorredor3.isAlive()){
			btnJogar.setVisible(false);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		DragPodium dPodium = new DragPodium(tfVencedor.getText(), tfSegundo.getText(), tfTerceiro.getText());
		dPodium.setVisible(true);
	}
	
}
