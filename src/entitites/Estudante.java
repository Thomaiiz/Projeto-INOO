package entitites;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import models.Turma;
import models.Avaliacao;

public class Estudante extends Usuario {
	private String prontuario;
	private String nome;
	private DateTimeFormatter dataNascimento;
	private List<Turma> turmasMatriculadas;

	public Estudante(String username, String senha) {
		super(username, senha);
		turmasMatriculadas = new ArrayList<>();
	}
	
	public Estudante(String username, String senha, String prontuario, String nome, DateTimeFormatter dataNascimento) {
		super(username, senha);
		this.prontuario = prontuario;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		turmasMatriculadas = new ArrayList<>();
	}
	
	public String getProntuario() {
		return prontuario;
	}

	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public DateTimeFormatter getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(DateTimeFormatter dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void matricularMateria(Turma turma) {
		if (!turmasMatriculadas.contains(turma)) {
			turmasMatriculadas.add(turma);
			turma.adicionarnaDisciplina(this);
		} 
	}
	
	public void consultarRendimento() {
		System.out.println("Rendimento do estudante: ");
		for (Turma turma : turmasMatriculadas) {
			System.out.println("\nTurma: " + turma.getCodigoTurma());
			System.out.println("Disciplina: " + turma.getDisciplina().getNome());
			System.out.println("Notas:");
			for (Avaliacao avaliacao : turma.getAval()) {
				System.out.println(" - " + avaliacao.getNome() + ": " + avaliacao.getNotas());
			}
			System.out.println("Faltas: " + turma.getFaltas());
		}
	}
}
