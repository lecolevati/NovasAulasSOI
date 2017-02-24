package exercicios;

import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DragRace extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfVencedor;
	private JTextField tfSegundo;
	private int distanciaMaxima;
	private JTextField tfTerceiro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DragRace frame = new DragRace();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DragRace() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1280, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Rectangle dimensoesFrame = this.getBounds();
		distanciaMaxima = dimensoesFrame.width - 200;
		
		ImageIcon iconSonic = new ImageIcon("sonic.gif");
		ImageIcon iconTails = new ImageIcon("tails.gif");
		ImageIcon iconPapaLeguas = new ImageIcon("papaleguas.gif");
		
		final JLabel lblCorredor1 = new JLabel("",iconSonic,JLabel.CENTER);
		lblCorredor1.setBounds(10, 36, 117, 140);
		contentPane.add(lblCorredor1);
		
		final JLabel lblCorredor2 = new JLabel("",iconPapaLeguas,JLabel.CENTER);   
		lblCorredor2.setBounds(10, 473, 117, 225);
		contentPane.add(lblCorredor2);
		
		final JLabel lblCorredor3 = new JLabel("",iconTails,JLabel.CENTER);
		lblCorredor3.setBounds(10, 267, 117, 133);
		contentPane.add(lblCorredor3);
		
		tfVencedor = new JTextField();
		tfVencedor.setEditable(false);
		tfVencedor.setBounds(140, 678, 193, 20);
		contentPane.add(tfVencedor);
		tfVencedor.setColumns(10);
		
		JLabel lblVencedor = new JLabel("Vencedor");
		lblVencedor.setBounds(10, 681, 91, 14);
		contentPane.add(lblVencedor);
		
		JLabel lblPerdedor = new JLabel("Segundo");
		lblPerdedor.setBounds(499, 681, 91, 14);
		contentPane.add(lblPerdedor);
		
		tfSegundo = new JTextField();
		tfSegundo.setEditable(false);
		tfSegundo.setColumns(10);
		tfSegundo.setBounds(621, 678, 193, 20);
		contentPane.add(tfSegundo);
		
		final JButton btnCorrer = new JButton("Correr");
		btnCorrer.setBounds(10, 2, 89, 23);
		contentPane.add(btnCorrer);
		
		JLabel lblTerceiro = new JLabel("Terceiro");
		lblTerceiro.setBounds(939, 681, 91, 14);
		contentPane.add(lblTerceiro);
		
		tfTerceiro = new JTextField();
		tfTerceiro.setEditable(false);
		tfTerceiro.setColumns(10);
		tfTerceiro.setBounds(1061, 678, 193, 20);
		contentPane.add(tfTerceiro);
		

		
		ActionListener correr = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Thread tJogo = new DragJogoThread(lblCorredor1, lblCorredor2, lblCorredor3, tfVencedor, tfSegundo, tfTerceiro, distanciaMaxima, btnCorrer);
				tJogo.start();
			}
		};
		btnCorrer.addActionListener(correr);
	}
}
