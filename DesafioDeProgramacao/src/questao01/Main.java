package questao01;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		String tamanho;
		boolean verificar = false;
		
		Scanner in = new Scanner(System.in);
		Escada escada = new Escada();
		
		System.out.println("Digite o tamanho da escada: ");
		tamanho = in.next();
		
		verificar = escada.criandoUmaEscada(tamanho);
		
		if(!verificar){
			System.out.println("Digito um valor errado ou adiciono caracter não válido.");
		}
	}
}
