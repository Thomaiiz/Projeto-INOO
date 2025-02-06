package entitites;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import models.Disciplina;
import models.Turma;

public class Administrador extends Usuario{
	private DateTimeFormatter dataNascimento;
	
	//Aqui são as listas para armazenar professores,estudantes,discplinas e turmas
	
	private List<Professor> professores = new ArrayList<>();
	private List<Estudante> estudantes = new ArrayList<>();
	private List<Disciplina> disciplinas = new ArrayList<>();
	private List<Turma> turmas = new ArrayList<>();
		
	public Administrador(String username, String senha) {
		super(username, senha);
	}
	
	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}

	public List<Estudante> getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(List<Estudante> estudantes) {
		this.estudantes = estudantes;
	}
	
	//Função que cadastra professor, recebendo os parametros do administrador e alocando na lista (professores)

	public void cadastrarProfessor(String username,String senha,String prontuario,String nome,DateTimeFormatter data) {
		Professor professor = new Professor(username,senha,prontuario,nome,data);
		professores.add(professor);
	}
	
	//Função que cadastra estudante, recebendo os parametros do administrador e alocando na lista (estudantes)
	
	public void cadastrarEstudantes(String username,String senha,String prontuario,String nome,DateTimeFormatter data) {
		Estudante estudante = new Estudante(username,senha,prontuario,nome,data);
		estudantes.add(estudante);
	}
	
	//Função que cadastra uma disciplina , recebendo os parametros do administrador e alocando na lista (disciplinas)
	
	public void cadastrarDisciplina(String nome,String sigla,String ementa,int cargaHoraria,int totalAlunos) {
		Disciplina disciplina = new Disciplina(nome,sigla,ementa,cargaHoraria,totalAlunos);
		disciplinas.add(disciplina);
	}
	
	public void cadastrarTurmas(int codigoTurma, Disciplina disciplina, Professor professor, List<Estudante> alunos) {
		for(Disciplina disci: disciplinas) {
			if(disci.getNome().equals(disciplina)) {
				Turma turma = new Turma(codigoTurma,disciplina,professor,alunos);
				disci.adicionarTurma(turma);
			}
		}
	}
	
	//Buscador para verificar se o professor existe na lista comparando com o parametro passado
	
	public Professor buscarP(String nome) {
		for(Professor p: professores) {
			if(p.getNome().equals(nome)) {
				return p;
			}
		}
		
		return null;
	}
	
	//Buscador para verificar se o estudante existe na lista comparando com o parametro passado
	
	public Estudante buscarE(String nome) {
		for(Estudante e: estudantes) {
			if(e.getNome().equals(nome)) {
				return e;
			}
		}
		
		return null;
	}
	
	//Buscador para verificar se a disciplina na lista existe comparando com o parametro passado
	
	public Disciplina buscarD(String nome) {
		for(Disciplina d: disciplinas) {
			if(d.getNome().equals(nome)) {
				return d;
			}
		}
		return null;
	}
	
}