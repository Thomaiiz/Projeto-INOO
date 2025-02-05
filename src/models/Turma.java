package models;

import java.util.ArrayList;
import java.util.List;

import entitites.Estudante;
import entitites.Professor;

public class Turma {
	private int codigoTurma;
	private Disciplina disciplina;
	private Professor professor;	
	private List<Estudante> alunos = new ArrayList<>();
	
	//Fazer a verificao se o professor e discplina existem e sao validar
	
	public Turma(int codigoTurma, Disciplina disciplina, Professor professor, List<Estudante> alunos) {
		this.codigoTurma = codigoTurma;
		this.disciplina = disciplina;
		this.professor = professor;
		this.alunos = alunos;
	}

	public int getCodigoTurma() {
		return codigoTurma;
	}

	public void setCodigoTurma(int codigoTurma) {
		this.codigoTurma = codigoTurma;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Estudante> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Estudante> alunos) {
		this.alunos = alunos;
	}
	
	//Aqui a diciona o aluno na disciplina e verifica se ele ja existe 
	
	public void adicionarnaDisciplina(Estudante aluno) {
		if(!alunos.contains(aluno)) {
			alunos.add(aluno);
		}
	}
	
}
