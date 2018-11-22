package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class ViewCadastrarQuadros {

	private JFrame frmTrelloapp;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCadastrarQuadros window = new ViewCadastrarQuadros();
					window.frmTrelloapp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewCadastrarQuadros() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTrelloapp = new JFrame();
		frmTrelloapp.setTitle("TrelloApp");
		frmTrelloapp.getContentPane().setBackground(new Color(245, 255, 250));
		frmTrelloapp.setBounds(100, 100, 502, 347);
		frmTrelloapp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTrelloapp.getContentPane().setLayout(null);
		
		JLabel lblCria = new JLabel("Criar Quadro");
		lblCria.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 18));
		lblCria.setHorizontalAlignment(SwingConstants.CENTER);
		lblCria.setBounds(173, 11, 139, 34);
		frmTrelloapp.getContentPane().add(lblCria);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(103, 125, 280, 24);
		frmTrelloapp.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNomeDoQuadro = new JLabel("Nome do Quadro");
		lblNomeDoQuadro.setBounds(103, 100, 89, 14);
		frmTrelloapp.getContentPane().add(lblNomeDoQuadro);
		
		JButton btnCriarQuadro = new JButton("Criar Quadro");
		btnCriarQuadro.setBounds(192, 196, 102, 34);
		frmTrelloapp.getContentPane().add(btnCriarQuadro);
	}

}
