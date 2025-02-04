package entitites;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Administrador extends Usuario{
	private LocalDate dataNascimento;
	
	private List<Professor> professores = new ArrayList<>();
	private List<Estudante> estudantes = new ArrayList<>();
	
	//Aqui duas listas para armazenar todos os alunos e professores em listas
	
	public Administrador(String username, String senha) {
		super(username, senha);
	}
	
	//Função que cadastra professor, recebendo os parametros do administrador e alocando na lista (professores)

	private void cadastrarProfessor(String nome,String username,String prontuario,LocalDate dataNascimento,String senha) {
		Professor professor = new Professor(nome,username,senha,prontuario,dataNascimento);
		professores.add(professor);
	}
	
	//Função que cadastra estudante, recebendo os parametros do administrador e alocando na lista (estudantes)
	
	private void cadastrarEstudantes(String nome,String username,String prontuario,LocalDate dataNascimento,String senha) {
		Estudante estudante = new Estudante(nome,username,senha,prontuario,dataNascimento);
	}
	
	private void cadastrarDisciplina() {
		
	}
	
	
	
	private void cadastrarTurmas() {
		
	}
	
	
}
