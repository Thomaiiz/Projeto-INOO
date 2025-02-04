package entitites;

import java.time.LocalDate;

public class Professor extends Usuario{
	private String prontuario;
	private String nome;
	private LocalDate dataNascimento;
	
	public Professor(String username, String senha, String prontuario, String nome, LocalDate dataNascimento) {
		super(username, senha);
		this.prontuario = prontuario;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	private void cadastrarAvaliação() {
		
	}
	
	private void relatorioAlunos() {
		
	}
	
	
}
