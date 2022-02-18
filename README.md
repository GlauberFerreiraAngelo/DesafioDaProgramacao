# Desafio De Programação

Para o desafio de programação foi utilizado a IDE eclipse, a linguagem de programação utilizada foi Java e para os testes unitários foi utilizado o Junit.

As questões do desafio foram feitas em um único projeto, separadas por pacotes com os respetivos nomes: questao1, questao2 e questao3.

## Questão 1

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.

Exemplo:

Entrada:
n = 6

Saída: <br>
![Resultado da saida do programa](https://github.com/GlauberFerreiraAngelo/DesafioDaProgramacao/blob/main/escada.png)

O resultado desse primeira atividade foi feito manualmente e testado com a Junit. <br><br>
![Tela da questão 1](https://github.com/GlauberFerreiraAngelo/DesafioDaProgramacao/blob/main/tela%20da%20atividade%20escada.png)

Utilizando Junit <br><br>
![Tela da questão 1 Junit](https://github.com/GlauberFerreiraAngelo/DesafioDaProgramacao/blob/main/tela%20do%20Junit%20escada.png)
 
<br>
Foi feito 5 testes, são esses a baixo, com Junit onde 4 desses resultados devem da false para letras, letras e número, vazio e caracter especiais para validar o código. O quinto teste o resultado dele tem que ser true para números para também ser valido o resultado. <br><br>

b = escada.criandoUmaEscada("er"); <br>
Assert.assertFalse(b);
		
b = escada.criandoUmaEscada("34r6t");<br>
Assert.assertFalse(b);
		
b = escada.criandoUmaEscada("");<br>
Assert.assertFalse(b);
		
b = escada.criandoUmaEscada("#*");<br>
Assert.assertFalse(b);

b = escada.criandoUmaEscada("6");<br>
Assert.assertTrue(b);

## Questão 2







