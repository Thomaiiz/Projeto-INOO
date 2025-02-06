package application;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entitites.Administrador;
import entitites.Estudante;
import entitites.Professor;
import entitites.Usuario;
import models.Disciplina;
import models.Login;
import models.Turma;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Administrador adm = new Administrador("admin","admin");
		int opcao = 0;
		List<Estudante> alunosVazios = new ArrayList<>();
		
		//MENU INTERATIVO 
		
		do {
			
			System.out.println("---MENU PRINCIPAL--- ");
			System.out.println("Fazendo login");
			System.out.println("Escolha seu tipo de usuario: ");
			System.out.println(" 1 - Estudante");
			System.out.println(" 2 - Professor");
			System.out.println(" 3 - Admin");
			System.out.println(" 0 - Sair");
			opcao = sc.nextInt();
			
			System.out.println("Usuario: ");
			String user = sc.nextLine();
			sc.nextLine();
			System.out.println("Senha: ");
			String senha = sc.nextLine();

			Login lg = new Login();
			Usuario loggin = lg.verificarLogin(user, senha, opcao, adm.getProfessores()  , adm.getEstudantes()); 
			
			while(true) {
				if(loggin instanceof Estudante) {
					Estudante estudantes = (Estudante) loggin;
					System.out.println("Bem vindo Estudante! ");
					System.out.println("1 - Visualizar e se cadastrar em uma turma ");
					System.out.println("2 - Consultar Rendimento/Faltas/Situação em cada turma");
					System.out.println("0 - Sair ");
					int option = sc.nextInt();
					
					if(option == 1) {
						
						
						
					}else if(option == 2) {
						
					}else {
						
					}
				}
				
				if(loggin instanceof Professor) {
					Professor professor = (Professor) loggin;
					System.out.println("Bem vindo Professor! ");
					System.out.println("1 - Cadastrar Avaliacao: ");
					System.out.println("2 - Inserir as notas: ");
					System.out.println("3 - Registrar faltas: ");
					System.out.println("4 - Relatorio de Alunos: ");
					System.out.println("5 - Relatorio de Turmas: ");
					System.out.println("0 - Sair ");
					
					int option = 0;
					
					if(option == 1) {
						System.out.println("Digite o nome da avaliacao: ");
						String name = sc.nextLine();
						System.out.println("Digite o peso da avalicao");
						double peso = sc.nextDouble();
						System.out.println("Digite a data da avalicacao");
						DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/yyyy");
						
						
					}else if(option == 2){
						System.out.println("Insira a turma: ");
						String turma = sc.nextLine();
						System.out.println("Inserir avaliacao: ");
						String aval = sc.nextLine();
						System.out.println("Coloque o estudante: ");
						String estudante = sc.nextLine();
						System.out.println("Digite a nota: ");
						double nota = sc.nextDouble();
						
						professor.inserirNotas(turma, aval, estudante, nota);
					}else if(option == 3) {
						
						System.out.println("Digite o nome do estudante: ");
	                    String nomeAluno = sc.nextLine();
	                    System.out.println("Digite o código da turma: ");
	                    String codigo = sc.nextLine();
	                    Turma turma = adm.buscarT(codigo);
	                        Estudante estudante = adm.buscarE(turma, nomeAluno);
	                            professor.registrarFaltas(turma, estudante);
	                    
					}else if(option == 4) {
						System.out.println("Digite a turma:");
						Turma turma = sc.nextLine();
						relatorioAlunos(turma);
						
					}else if(option == 5) {
						System.out.println("Turma: ");
						
						
					}else 
				}
				
				if(loggin instanceof Administrador) {
					Administrador administrador = (Administrador) loggin;
					System.out.println("Bem vindo Administrador! ");
					System.out.println("1 - Cadastrar Professor ");
					System.out.println("2 - Cadastrar Estudante ");
					System.out.println("3 - Cadastrar Disciplinas");
					System.out.println("4 - Cadastrar Turmas ");
					System.out.println("0 - Sair ");
					int option = sc.nextInt();

				
					if(option == 1) {
						System.out.println("Nome do professor: ");
						String name = sc.nextLine();
						System.out.println("Username ");
						String usern = sc.nextLine();
						System.out.println("Prontuario do professor");
						String pront = sc.nextLine();
						System.out.println("Data de Nascimento: "); 
						DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/yyyy");
						System.out.println("Senha:");
						String senha1 = sc.nextLine();
						
						adm.cadastrarProfessor(usern, senha1, pront, name, data);
						
					}else if(option == 2) {
	                    System.out.println("Nome do estudante:");
	                    String name = sc.nextLine();
	                    System.out.println("Username do Estudante: ");
	                    String username = sc.nextLine();
	                    System.out.println("Senha do estudante: ");
	                    String senhar = sc.nextLine();
	                    System.out.println("Date de Nascimento: ");
	                    DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/yyyy");	                    
	                    System.out.println("Prontuario do aluno");
	                    String prontuar = sc.nextLine();
	                    
	                    adm.cadastrarEstudantes(username, senhar, name, prontuar, data);
					}else if(option == 3) {
						  System.out.println("Nome da Disciplina:");
		                    String name = sc.nextLine();
		                    System.out.println("Silga da Disciplina: ");
		                    String username = sc.nextLine();
		                    System.out.println("Ementa: ");
		                    String senhar = sc.nextLine();
		                    System.out.println("Carga Horaria: : ");
		                    int tempo = sc.nextInt();
		                    System.out.println("Numero total de aulas no semestre: ");
		                    int quantidade = sc.nextInt();
		                    
		                    adm.cadastrarDisciplina(name, username, senhar, tempo, quantidade);
		                    
					}else if(option == 4) {
						System.out.println("Qual a o codigo da turma ?: ");
						int codigo = sc.nextInt();
						System.out.println("Qual a disciplina: ");
						String disc = sc.nextLine();
						System.out.println("Qual o professor: ");
						String prof = sc.nextLine();
						
						Disciplina disciplina = adm.buscarD(disc);
						Professor professor = adm.buscarP(prof);
						
						if(disciplina != null && professor!= null) {
							adm.cadastrarTurmas(codigo, disciplina, professor, alunosVazios);
						}else {
							System.out.println("Disciplina ou Professor não encontrado");
						}
						
					}else {
						break;
					}
				}
				
				
			}

	
		}while(opcao != 0);

	}

}
