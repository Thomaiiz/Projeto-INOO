package models;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private String nome;
	private String sigla;
	private String ementa;
	private int cargaHoraria;
	private int totalAlunos;
	private List<Turma> turmas = new ArrayList<>();
	
	public Disciplina(String nome, String sigla, String ementa, int cargaHoraria, int totalAlunos) {
		this.nome = nome;
		this.sigla = sigla;
		this.ementa = ementa;
		this.cargaHoraria = cargaHoraria;
		this.totalAlunos = totalAlunos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public int getTotalAlunos() {
		return totalAlunos;
	}

	public void setTotalAlunos(int totalAlunos) {
		this.totalAlunos = totalAlunos;
	}
	
	public void adicionarTurma(Turma turma) {
		this.turmas.add(turma);
	}
	
	
	

}
