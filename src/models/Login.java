package models;

import java.util.List;

import entitites.Administrador;
import entitites.Estudante;
import entitites.Professor;
import entitites.Usuario;

public class Login{

	public Usuario verificarLogin(String username,String senha,int opcao, List<Professor> professores,List<Estudante> estudantes) {
		if(opcao == 1) {
			for(Estudante estudante: estudantes) {
				if(estudante.verificador(username, senha)) {
					return estudante;
				}
			}
		}else if(opcao == 2) {
			for(Professor professor: professores) {
				if(professor.verificador(username, senha)) {
					return professor;
				}
			}
		}else if(opcao == 3) {
			if(username.equals("admin") && senha.equals("admin")) {
				return new Administrador("admin", "admin");
			}
		}
		
		return null;
	}
	
}
