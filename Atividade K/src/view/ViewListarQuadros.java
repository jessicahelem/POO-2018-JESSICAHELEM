package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class ViewListarQuadros {

	private JFrame frmTrelloapp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewListarQuadros window = new ViewListarQuadros();
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
	public ViewListarQuadros() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTrelloapp = new JFrame();
		frmTrelloapp.getContentPane().setBackground(new Color(245, 255, 250));
		frmTrelloapp.setTitle("TrelloApp");
		frmTrelloapp.setBounds(100, 100, 502, 347);
		frmTrelloapp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTrelloapp.getContentPane().setLayout(null);
		
		JLabel lblListaDeQuadros = new JLabel("Lista De Quadros");
		lblListaDeQuadros.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 22));
		lblListaDeQuadros.setBounds(169, 26, 164, 23);
		frmTrelloapp.getContentPane().add(lblListaDeQuadros);
	}

}
