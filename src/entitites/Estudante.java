package entitites;

import java.time.LocalDate;

public class Estudante extends Usuario {
	private String prontuario;
	private String nome;
	private LocalDate dataNascimento;

	public Estudante(String username, String senha) {
		super(username, senha);
	}
	
	public Estudante(String username, String senha, String prontuario, String nome, LocalDate dataNascimento) {
		super(username, senha);
		this.prontuario = prontuario;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}



	private void matricularMateria() {
		
	}
	
	private void consultarRendimento() {
		
	}
	
}
