package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

public class CadastrarQuadro {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarQuadro window = new CadastrarQuadro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadastrarQuadro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 255, 250));
		frame.getContentPane().setForeground(new Color(245, 255, 250));
		frame.setBounds(100, 100, 502, 347);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblQuadros = new JLabel("Quadros");
		lblQuadros.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuadros.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 23));
		lblQuadros.setBounds(195, 28, 96, 22);
		frame.getContentPane().add(lblQuadros);
		
		JButton btnCadastrarQuadros = new JButton("Cadastrar Quadros");
		btnCadastrarQuadros.setBounds(144, 112, 197, 29);
		frame.getContentPane().add(btnCadastrarQuadros);
		
		JButton btnMeusQuadros = new JButton("Meus Quadros");
		btnMeusQuadros.setBounds(144, 173, 197, 29);
		frame.getContentPane().add(btnMeusQuadros);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(144, 234, 197, 29);
		frame.getContentPane().add(btnVoltar);
	}

}
