/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lucas Batista 24 de mar. de 2024
 */
public class AgendaTelefonica {
	private List<Contato> contatos;

	public AgendaTelefonica() {
		contatos = new ArrayList<>();
	}

	public void adicionarContato(String nome, String telefone, String email) {
		Contato contato = new Contato(nome, telefone, email);
		contatos.add(contato);
	}

	public void removerContato(String nome) {
		for (Contato contato : contatos) {
			if (contato.getNome().equalsIgnoreCase(nome)) {
				contatos.remove(contato);
				System.out.println("Contato removido: " + nome);
				return;
			}
		}
		System.out.println("Contato não encontrado: " + nome);
	}

	public Contato buscarContato(String nome) {
		for (Contato contato : contatos) {
			if (contato.getNome().equalsIgnoreCase(nome)) {
				return contato;
			}
		}
		return null;
	}
}