/**
 * 
 */
package view;

import model.AgendaTelefonica;
import model.Contato;

/**
 * @author Lucas Batista 24 de mar. de 2024
 */
public class Main {
	public static void main(String[] args) {
		AgendaTelefonica agenda = new AgendaTelefonica();

		agenda.adicionarContato("João", "123456789", "joao@email.com");
		agenda.adicionarContato("Maria", "987654321", "maria@email.com");

		Contato contatoMaria = agenda.buscarContato("Maria");
		if (contatoMaria != null) {
			System.out.println("Contato encontrado: " + contatoMaria.getNome());
			agenda.removerContato("Maria");
		} else {
			System.out.println("Contato não encontrado");
		}
	}
}
