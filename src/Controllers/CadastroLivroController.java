package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import Controllers.functionsCadastro;
import Models.Livro;

public class CadastroLivroController implements ActionListener {

        //Abaixo trocaremos os nomes das variaveis para um nome mais descritivo
    
	private JTextField campoTitulo;
	private JTextField campoAutor;
	private JComboBox boxGenero;
	private JComboBox boxAno;
	private JCheckBox jaLeu;
	private List<Livro> listLivros;
	
	
	public CadastroLivroController(JTextField fieldTitle,JTextField campoAutor,JComboBox boxGenero,JComboBox boxAno,JCheckBox jaLeu){
		
		this.campoTitulo = campoTitulo;
		this.campoAutor = campoAutor;
		this.jaLeu = jaLeu;
		
		listLivros = new ArrayList<>();          //Contrutor da classe
		
		this.populateBoxAno(boxAno);
		this.populateComboGener(boxGenero);
	}
        
	functionsCadastro c = new functionsCadastro(); //Instanciando a classe que contem as funcoes do cadastro
       
	private void populateBoxAno(JComboBox boxAno) {
		this.boxAno = boxAno;
                
                c.funcaoBuscarData(); //chamada da Funcao para trazer o Loop do ano de 1900 até o Ano Atual
                        
		}
        
	private void populateComboGener(JComboBox boxGenero) {
		this.boxGenero = boxGenero; 
                
		c.funcaoPopularizarGenero(); //Chamada da funcao de popularizar Generos
		
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		System.out.println(event.getActionCommand());
		this.cadastrarLivro();
	}
	      
	public void cadastrarLivro() {
		
		c.cadastrarLivro(); //Chamada da Função de Cadastrar Livros
		
	}

}
