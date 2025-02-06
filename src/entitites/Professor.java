package entitites;

import java.time.format.DateTimeFormatter;
import java.util.List;

import models.Avaliacao;
import models.Disciplina;
import models.Turma;

public class Professor extends Usuario{
	private String prontuario;
	private String nome;
	private DateTimeFormatter dataNascimento;
	
	
	
	public Professor(String username, String senha, String prontuario, String nome, DateTimeFormatter dataNascimento) {
		super(username, senha);
		this.prontuario = prontuario;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
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
	
	public void cadastrarAvaliacao(Turma turma,String nome, double peso, DateTimeFormatter data) {
		if(turma != null) {
			Avaliacao avaliacao = new Avaliacao(nome,peso,data);
			turma.addAval(avaliacao);
		}
	}

	public void inserirNotas(Turma turma,Avaliacao avaliacao,Estudante estudante,double nota) {
		if(turma.getAlunos().contains(estudante)) {
			avaliacao.adicionarNota(estudante, nota);
		}else {
			System.out.println("Estudante não existe");
		}
	}
	
	public void registrarFaltas(Turma turma,Estudante estudante) {
		if(turma.getAlunos().equals(estudante)) {
			int faltas = turma.getFaltas().getOrDefault(estudante, 0);
			turma.getFaltas().put(estudante,faltas + 4);
		}else {
			System.out.println("Estudante não existe! ");
		}
		
	}
	
	private void relatorioAlunos(Turma turma) {
		System.out.println("Relatorio da Turma - " + turma);
		System.out.println("Estudante / Falta / Avaliação ");
		
		for(Estudante estudante: turma.getAlunos()) {
			int faltas = turma.getFaltas().getOrDefault(estudante, 0);
			for(Avaliacao avaliacao: turma.getAval()) {
				Double notas  = avaliacao.getNotas().get(estudante);
				System.out.printf("%s %d %s",estudante.getNome(),faltas,avaliacao.getNome());
			}

		}
	}
	
	private void relatorioTurmas(List<Turma> turmas) {
		System.out.println("Relatorio de Turmas");
		for(Turma turma: turmas) {
			int alunos = turma.getAlunos().size();
			int avaliacoes = turma.getAval().size();
			int faltas = turma.getFaltas().values().stream().mapToInt(Integer::intValue).sum();
			System.out.printf("%d %s %d %d",turma.getCodigoTurma(),turma.getDisciplina().getNome(),alunos,avaliacoes,faltas);
		}
		
	}

}
