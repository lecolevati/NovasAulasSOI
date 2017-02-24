package exercicios;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class DragPodium extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static String primeiro;
	private static String segundo;
	private static String terceiro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DragPodium frame = new DragPodium(primeiro, segundo, terceiro);
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
	public DragPodium(String primeiro, String segundo, String terceiro) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1280, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPrata = new JLabel("____________________________________");
		lblPrata.setBounds(209, 382, 258, 14);
		contentPane.add(lblPrata);
		
		JLabel lblOuro = new JLabel("____________________________________");
		lblOuro.setBounds(472, 246, 258, 14);
		contentPane.add(lblOuro);
		
		JLabel lblBronze = new JLabel("____________________________________");
		lblBronze.setBounds(759, 436, 258, 14);
		contentPane.add(lblBronze);
		
		JLabel lblPrimeiro = new JLabel("",JLabel.CENTER);
		lblPrimeiro.setBounds(545, 178, 70, 70);
		contentPane.add(lblPrimeiro);
		
		JLabel lblSegundo = new JLabel("",JLabel.CENTER);
		lblSegundo.setBounds(274, 312, 70, 70);
		contentPane.add(lblSegundo);
		
		JLabel lblTerceiro = new JLabel("",JLabel.CENTER);
		lblTerceiro.setBounds(831, 368, 70, 70);
		contentPane.add(lblTerceiro);
		
		JLabel label = new JLabel("1\u00BA");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(569, 271, 46, 25);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("2\u00BA");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_1.setBounds(285, 407, 46, 25);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("3\u00BA");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_2.setBounds(855, 461, 46, 25);
		contentPane.add(label_2);
		
		ImageIcon iconSonic = new ImageIcon("sonic3.jpg");
		ImageIcon iconTails = new ImageIcon("tails3.jpg");
		ImageIcon iconPapaLeguas = new ImageIcon("papaleguas3.jpg");
		
		if (primeiro.equals("Sonic")){
			lblPrimeiro.setIcon(iconSonic);
		} else {
			if (segundo.equals("Sonic")){
				lblSegundo.setIcon(iconSonic);
			} else {
				lblTerceiro.setIcon(iconSonic);
			}
		}
		if (primeiro.equals("Tails")){
			lblPrimeiro.setIcon(iconTails);
		} else {
			if (segundo.equals("Tails")){
				lblSegundo.setIcon(iconTails);
			} else {
				lblTerceiro.setIcon(iconTails);
			}
		}
		if (primeiro.equals("Papa Léguas")){
			lblPrimeiro.setIcon(iconPapaLeguas);
		} else {
			if (segundo.equals("Papa Léguas")){
				lblSegundo.setIcon(iconPapaLeguas);
			} else {
				lblTerceiro.setIcon(iconPapaLeguas);
			}
		}
	}
}
