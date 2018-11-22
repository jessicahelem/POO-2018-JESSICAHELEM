package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class ViewCadastrar {

	private JFrame frmTrelloapp;
	private JTextField txtLogin;
	private JTextField txtNome;
	private JTextField txtSenha;
	private JLabel lblSenha;
	private JLabel lblNewLabel;
	private JLabel lblUsurio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCadastrar window = new ViewCadastrar();
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
	public ViewCadastrar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTrelloapp = new JFrame();
		frmTrelloapp.setTitle("TrelloApp");
		frmTrelloapp.setForeground(new Color(0, 0, 128));
		frmTrelloapp.setBackground(new Color(0, 0, 255));
		frmTrelloapp.getContentPane().setBackground(new Color(248, 248, 255));
		frmTrelloapp.setBounds(100, 100, 502, 347);
		frmTrelloapp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTrelloapp.getContentPane().setLayout(null);
		
		JLabel lblCadastrar = new JLabel("Criar uma conta no TrelloApp");
		lblCadastrar.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 18));
		lblCadastrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastrar.setBounds(120, 24, 246, 22);
		frmTrelloapp.getContentPane().add(lblCadastrar);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(120, 150, 246, 24);
		frmTrelloapp.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setToolTipText("nome");
		txtNome.setBounds(120, 93, 246, 24);
		frmTrelloapp.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(120, 203, 246, 24);
		frmTrelloapp.getContentPane().add(txtSenha);
		txtSenha.setColumns(10);
		
		JButton btnNewButton = new JButton("Criar Nova Conta");
		btnNewButton.setBounds(120, 247, 246, 26);
		frmTrelloapp.getContentPane().add(btnNewButton);
		
		lblSenha = new JLabel("Senha");
		lblSenha.setBounds(120, 185, 46, 14);
		frmTrelloapp.getContentPane().add(lblSenha);
		
		lblNewLabel = new JLabel("Nome");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(120, 72, 46, 14);
		frmTrelloapp.getContentPane().add(lblNewLabel);
		
		lblUsurio = new JLabel("ID Login");
		lblUsurio.setBounds(120, 128, 46, 14);
		frmTrelloapp.getContentPane().add(lblUsurio);
	}

}
