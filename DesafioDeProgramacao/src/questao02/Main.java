package questao02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		String nome = "debora";
		String senha;
		boolean verificar = true;
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Cadastro cadastro = new Cadastro();
		
		System.out.println(nome);
		do{
			System.out.println("Digite sua senha.");
			senha = in.next();
			
			verificar = cadastro.verificarSenha(senha);
						
		}while(verificar);
		
		System.out.println("Senha validar. Bem vindo(a) " + nome);

		
	}
}
