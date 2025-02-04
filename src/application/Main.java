package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		
		do {
			
			System.out.println("---MENU PRINCIPAL--- ");
			System.out.println("Fazendo login");
			System.out.println("Escolha seu tipo de usuario: ");
			System.out.println(" 1 - Estudante");
			System.out.println(" 2 - Professor");
			System.out.println(" 3 - Admin");
			System.out.println(" 0 - Sair");
			opcao = sc.nextInt();

			switch(opcao) {
			case 1:
				System.out.println("Digite seu username: ");
				String user = sc.next();		
				System.out.println("Digite sua senha: ");
				String senha = sc.next();
				
				
		}
	
		}while(opcao != 0);

	}

}
