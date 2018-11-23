package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class MenuView {

	private JFrame frmTrelloapp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuView window = new MenuView();
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
	public MenuView() {
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
		
		JLabel lblSejaBemVindo = new JLabel(" Seja Bem Vindo ao AppTrello!");
		lblSejaBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSejaBemVindo.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 18));
		lblSejaBemVindo.setBounds(118, 23, 249, 31);
		frmTrelloapp.getContentPane().add(lblSejaBemVindo);
		
		JButton btnLogin = new JButton("Fazer Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ViewLogin().frmTrelloapp.setVisible(true);
			}
		});
		btnLogin.setBounds(144, 99, 197, 31);
		frmTrelloapp.getContentPane().add(btnLogin);
		
		JButton btnCadastrar = new JButton("Cadastrar Usu\u00E1rio");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ViewCadastrar().frmTrelloapp.setVisible(true);

			}
		});
		btnCadastrar.setBounds(144, 163, 197, 31);
		frmTrelloapp.getContentPane().add(btnCadastrar);
	}

}
