package exercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ReiniciaSapo implements ActionListener {

	private JFrame atual;
	
	public ReiniciaSapo(JFrame atual) {
		this.atual = atual;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		CorridaSapo corrida = new CorridaSapo();
		corrida.setVisible(true);
		atual.dispose();		
	}

}
