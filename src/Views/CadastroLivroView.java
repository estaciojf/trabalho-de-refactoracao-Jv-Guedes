package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controllers.CadastroLivroController;

import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class CadastroLivroView extends JFrame {

	private JPanel contentPane;
	private JTextField campoTitulo;
	private JTextField campoAutor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroLivroView frame = new CadastroLivroView();
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
	public CadastroLivroView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTtulo = new JLabel("Título");
		lblTtulo.setBounds(28, 76, 61, 16);
		contentPane.add(lblTtulo);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(28, 140, 61, 16);
		contentPane.add(lblAutor);
		
		JLabel lblGnero = new JLabel("Gênero");
		lblGnero.setBounds(266, 76, 61, 16);
		contentPane.add(lblGnero);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setBounds(266, 140, 61, 16);
		contentPane.add(lblAno);
		
		JCheckBox jaLeu = new JCheckBox("Já leu?");
		jaLeu.setBounds(28, 204, 128, 23);
		contentPane.add(jaLeu);
		
		campoTitulo = new JTextField();
		campoTitulo.setBounds(78, 71, 130, 26);
		contentPane.add(campoTitulo);
		campoTitulo.setColumns(10);
		
		campoAutor = new JTextField();
		campoAutor.setBounds(78, 135, 130, 26);
		contentPane.add(campoAutor);
		campoAutor.setColumns(10);
		
		JComboBox boxGenero = new JComboBox();
		boxGenero.setBounds(321, 72, 106, 27);
		contentPane.add(boxGenero);
		
		JComboBox boxAno = new JComboBox();
		boxAno.setBounds(321, 136, 106, 27);
		contentPane.add(boxAno);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(270, 215, 117, 29);
		contentPane.add(btnCadastrar);
		
		
		CadastroLivroController handle = new CadastroLivroController(campoTitulo, campoAutor, boxGenero, boxAno, jaLeu);
		btnCadastrar.addActionListener(handle);
		
		
	}
}
