package questao01;

public class Escada {

	public Escada() {
		super();
	}
	/*
	 * 	A variável aux salvar os espaços em branco que serão impressos no for(j) 
	 *  e o for(k) imprimir a quantidade de asterisco. 
	 * */
	public boolean criandoUmaEscada(String num){
		int aux = 0;
		boolean verificarSeELetra = false;
		int numero = 0;
		
		verificarSeELetra = num.matches("-?\\d+");
		
		if(verificarSeELetra){
			numero = Integer.parseInt(num);
		}
		
		
		for(int i = 1; i <= numero; i++){
			aux = numero - i;
			for(int j = 0; j < aux; j++){
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		return verificarSeELetra;
	}

	
}
