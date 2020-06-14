/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Livro;
import java.util.Calendar;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Red-Dragon
 */
public class functionsCadastro {
    
        private JTextField campoTitulo;
	private JTextField campoAutor;
	private JComboBox boxGenero;
	private JComboBox boxAno;
	private JCheckBox jaLeu;
	private List<Livro> listLivros;
    
    public void funcaoBuscarData(){ //Funcao para Fazer o Loop do ano de 1900 até o Ano Atual
            int anoAtual = Calendar.getInstance().get(Calendar.YEAR); 
		
		for (int yearLoop = anoAtual ; yearLoop >= 1900 ; yearLoop --) {
			this.boxAno.addItem(yearLoop);
		}
    }
    
     public void funcaoPopularizarGenero(){  //Funcao para popularizar os generos do livro em um formato String
            String[] genders = new String[] { "Terror", "Ficção", "Drama", "Aventura", "Comédia", "Técnico" };
		for (String genderLoop : genders) {
			this.boxGenero.addItem(genderLoop);
		}
        }
     
     public void cadastrarLivro() { //Pegando os atributos da classe Livro e ordenando em uma lista
		
		Livro livro = new Livro( 
				this.campoTitulo.getText(), 
				this.campoAutor.getText(),
				this.boxGenero.getSelectedItem().toString(),
				Integer.parseInt(this.boxAno.getSelectedItem().toString()),
				this.jaLeu.isSelected()
				);
		
		listLivros.add(livro);
		
		for (int i = 0 ; i < listLivros.size() ; i ++ ) {
			System.out.println(listLivros.get(i).toString());
		}
		
	}
     
     
}
