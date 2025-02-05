package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entitites.Administrador;
import entitites.Estudante;
import entitites.Professor;
import entitites.Usuario;
import models.Disciplina;
import models.Login;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
			System.out.println("Senha: ");
			String senha = sc.nextLine();

			Login lg = new Login();
			Usuario loggin = lg.verificarLogin(user, senha, opcao, adm.getProfessores()  , adm.getEstudantes()); 
			
			while(true) {
				if(loggin instanceof Estudante) {
					System.out.println("Bem vindo Estudante! ");
					System.out.println("1 - Visualizar e se cadastrar em uma turma ");
					System.out.println("2 - Consultar Rendimento/Faltas/Situação em cada turma");
					System.out.println("0 - Sair ");
					int option = sc.nextInt();
					
					if(option == 1) {
						
						
					}else if(option == 2) {
						
					}else if(option == 3) {
						
					}
				}
				
				if(loggin instanceof Professor) {
					
					
					
					
					int option;
					
					if(option == 1) {
						
					}
				}
				
				if(loggin instanceof Administrador) {
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
						
						System.out.println("Senha:");
						String codigo = sc.nextLine();
						
						adm.cadastrarProfessor(codigo, usern, pront, null, senha);
						
					}else if(option == 2) {
	                    System.out.println("Nome do estudante:");
	                    String name = sc.nextLine();
	                    System.out.println("Username do Estudante: ");
	                    String username = sc.nextLine();
	                    System.out.println("Senha do estudante: ");
	                    String senhar = sc.nextLine();
	                    System.out.println("Date de Nascimento: ");
	                    
	                    System.out.println(); //AQUI LOCAL DATE
	                    
	                    System.out.println("Prontuario do aluno");
	                    String prontuar = sc.nextLine();
	                    
	                    adm.cadastrarEstudantes(name, username, prontuar, null, senhar);
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
				}else if(loggin instanceof Professor) {
					System.out.println("Bem vindo professor!");
					System.out.println("1 - Cadastrar Avaliação ");
					System.out.println("2 - Inserir as notas ");
					System.out.println("3 - Registrar faltas de alunos");
					System.out.println("4 - Gerar relatorio dos alunos ");
					System.out.println("5 - Gerar relatorio da turma ");
					System.out.println("0 - Sair ");
					int option = sc.nextInt();
					
					if(option == 1) {
						
					}else if(option == 2) {
						
					}else if(option == 3) {
						
					}else if(option == 4) {
						
					}else if(option == 5) {
						
					}else {
						break;
					}
					
				}
				
				
			}

	
		}while(opcao != 0);

	}

}
