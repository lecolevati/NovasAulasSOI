package exercicios;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CacaNiquelThread extends Thread{

	private JTextField tfTela1, tfTela2, tfTela3, tfCash;
	private JButton btnJogar;
	
	public CacaNiquelThread(JTextField tfTela1, JTextField tfTela2, JTextField tfTela3, JTextField tfCash, JButton btnJogar){
		this.tfCash = tfCash;
		this.tfTela1 = tfTela1;
		this.tfTela2 = tfTela2;
		this.tfTela3 = tfTela3;
		this.btnJogar = btnJogar;
	}
	
	public void run(){
		jogo();
	}
	
	public void jogo(){
		Thread tTela1 = new TelaThread(tfTela1);
		Thread tTela2 = new TelaThread(tfTela2);
		Thread tTela3 = new TelaThread(tfTela3);
		tTela1.start();
		tTela2.start();
		tTela3.start();
		float dinheiro = Float.parseFloat(tfCash.getText());
		while (tTela1.isAlive() || tTela2.isAlive() || tTela3.isAlive()){
			btnJogar.setVisible(false);
		}
		int tela1 = Integer.parseInt(tfTela1.getText());
		int tela2 = Integer.parseInt(tfTela2.getText());
		int tela3 = Integer.parseInt(tfTela3.getText());
		if (tela1 == tela2 && tela1 == tela3){
			JOptionPane.showMessageDialog(null, "Venceu", "Vitória",JOptionPane.INFORMATION_MESSAGE);
			dinheiro += 0.25;
		} else {
			JOptionPane.showMessageDialog(null, "Perdeu", "Derrota",JOptionPane.INFORMATION_MESSAGE);
			dinheiro -= 0.25;
		}
		tfCash.setText(String.valueOf(dinheiro));
		btnJogar.setVisible(true);
	}
	
}
