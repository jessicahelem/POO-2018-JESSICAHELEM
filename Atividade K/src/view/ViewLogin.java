package view;

import java.awt.EventQueue;
import Negocios.Processos; 
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;

import App.appTrello;

public class ViewLogin  extends JFrame {


	JFrame frmTrelloapp;
	private JTextField txtLogin;
	private JTextField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin window = new ViewLogin();
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
	public ViewLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTrelloapp = new JFrame();
		frmTrelloapp.getContentPane().setBackground(new Color(245, 255, 250));
		frmTrelloapp.setBackground(Color.WHITE);
		frmTrelloapp.setBounds(100, 100, 502, 347);
		frmTrelloapp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTrelloapp.getContentPane().setLayout(null);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(126, 113, 233, 24);
		frmTrelloapp.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblNome = new JLabel("Login");
		lblNome.setBounds(126, 88, 46, 14);
		frmTrelloapp.getContentPane().add(lblNome);
		
		JButton btnLogin = new JButton("Entrar");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = lblNome.getText();
				String senha = txtSenha.getText();
				if(Processos.login(nome,senha)) {
					
					//JOptionPane.showMessageDialog(null, "Bem Vindo ao TrelloApp!", "TrelloApp",1);
					new ViewLogin().frmTrelloapp.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Dados Inválidos!", "TrelloApp",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnLogin.setBounds(198, 228, 89, 30);
		frmTrelloapp.getContentPane().add(btnLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(126, 144, 46, 14);
		frmTrelloapp.getContentPane().add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(126, 169, 233, 24);
		frmTrelloapp.getContentPane().add(txtSenha);
		
		JLabel lblFazerLoginNo = new JLabel("Fazer Login no TrelloAPP");
		lblFazerLoginNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblFazerLoginNo.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 18));
		lblFazerLoginNo.setBounds(126, 28, 233, 24);
		frmTrelloapp.getContentPane().add(lblFazerLoginNo);
	}
	
	
}
