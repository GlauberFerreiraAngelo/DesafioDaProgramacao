package questao02;

public class Cadastro {

	private String nome;
	private String senha;
	
	public Cadastro() {
		super();
	}
	
	public Cadastro(String nome, String senha) {
		super();
		this.nome = nome;
		this.senha = senha;
	}
	
	/*
	 * Utilizando expressões regulares para verificação dos requisitos para 
	 * satisfaze os critérios de validação da senha.
	 * */
	
	public boolean verificarSenha(String password){
		
		boolean verificar = false;
		
		//verificar se há um número na string
		if(!password.matches(".*\\d.*")){
			System.out.println("No mínimo 1 digito.");
			verificar = true;
		}
		
		if(!password.matches(".*[a-z].*")){
			System.out.println("No mínimo 1 letra em minúsculo");
			verificar = true;
		}
		
		if(!password.matches(".*[A-Z].*")){
			System.out.println("No mínimo 1 letra em maiúsculo.");
			verificar = true;
		}
		
		if(!password.matches(".*[!@#$%^&*()-+].*")){
			System.out.println("No mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+");
			verificar = true;
		}
		/*
		 * O if abaixo faz com que aceite somente strings de no mínimo 6, e o máximo indeterminado, caracteres. 
		 * */
		if(!password.matches("[!@#$%^&*()-+a-zA-Z0-9]{6,}")){
			int tamanho = 6 - password.length();
			System.out.println("O número mínimo de caracteres para a senha ser considerada segura é 6 falta : " + tamanho + " caractere(s)");
			verificar = true;
		}
		
		return verificar;
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
