package entitites;

public abstract class Usuario {
	private String username;
	private String senha;
	
	public Usuario(String username, String senha) {
		this.username = username;
		this.senha = senha;
	}
	
	public boolean verificador(String username, String senha) {
		return (this.username.equals(username) && this.senha.equals(senha));
	}
}
