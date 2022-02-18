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
	 * Utilizando express�es regulares para verifica��o dos requisitos para 
	 * satisfaze os crit�rios de valida��o da senha.
	 * */
	
	public boolean verificarSenha(String password){
		
		boolean verificar = false;
		
		//verificar se h� um n�mero na string
		if(!password.matches(".*\\d.*")){
			System.out.println("No m�nimo 1 digito.");
			verificar = true;
		}
		
		if(!password.matches(".*[a-z].*")){
			System.out.println("No m�nimo 1 letra em min�sculo");
			verificar = true;
		}
		
		if(!password.matches(".*[A-Z].*")){
			System.out.println("No m�nimo 1 letra em mai�sculo.");
			verificar = true;
		}
		
		if(!password.matches(".*[!@#$%^&*()-+].*")){
			System.out.println("No m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+");
			verificar = true;
		}
		/*
		 * O if abaixo faz com que aceite somente strings de no m�nimo 6, e o m�ximo indeterminado, caracteres. 
		 * */
		if(!password.matches("[!@#$%^&*()-+a-zA-Z0-9]{6,}")){
			int tamanho = 6 - password.length();
			System.out.println("O n�mero m�nimo de caracteres para a senha ser considerada segura � 6 falta : " + tamanho + " caractere(s)");
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
