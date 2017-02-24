package exercicios;

import java.awt.Rectangle;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class DragRaceThread extends Thread {
	
	private JLabel lblCorredor;
	private JTextField tfVencedor, tfSegundo, tfTerceiro;
	private int distanciaMaxima;
	private String nomeCorredor;
	
	public DragRaceThread(JLabel lblCorredor, JTextField tfVencedor, JTextField tfSegundo, JTextField tfTerceiro, int distanciaMaxima, String nomeCorredor){
		this.lblCorredor = lblCorredor;
		this.tfSegundo = tfSegundo;
		this.tfVencedor = tfVencedor;
		this.tfTerceiro = tfTerceiro;
		this.distanciaMaxima = distanciaMaxima;
		this.nomeCorredor = nomeCorredor;
	}
	
	public void run(){
		arranqueCorredor();
	}
	
	public void arranqueCorredor(){
		Rectangle dimensoes = lblCorredor.getBounds();
		int tamanhoArranque = 20;
		int x = dimensoes.x;
		int y = dimensoes.y;
		int width = dimensoes.width;
		int height = dimensoes.height;
		while (x <= distanciaMaxima){
			int arranque = (int) (Math.random() * tamanhoArranque);
			x = x + arranque;
			if (x <= distanciaMaxima) {
				lblCorredor.setBounds(x, y, width, height);
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} 
		}
		if (tfVencedor.getText().isEmpty()){
			tfVencedor.setText(nomeCorredor);
		} else {
			if (tfSegundo.getText().isEmpty()){
				tfSegundo.setText(nomeCorredor);
			} else {
				tfTerceiro.setText(nomeCorredor);
			}
		}
	}

}
