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

Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:

- Possui no mínimo 6 caracteres.
- Contém no mínimo 1 digito.
- Contém no mínimo 1 letra em minúsculo.
- Contém no mínimo 1 letra em maiúsculo.
- Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.

Exemplo:

Entrada:
Ya3

Saída:
3

O resultado dando o valor correto vemos a baixo:<br><br>
![Tela da questão 2 Junit](https://github.com/GlauberFerreiraAngelo/DesafioDaProgramacao/blob/main/tela%20da%20atividade%20senha.png)<br>

Agora uma tela com apenas um único carácter seguido os requisitos de validação e vemos as validações que faltam para a senha ser válida.<br><br>
![Tela da questão 2 Junit](https://github.com/GlauberFerreiraAngelo/DesafioDaProgramacao/blob/main/tela%20atividade%20senha%20resultados.png)<br>

b = cadastro.verificarSenha("aaaaaa");
Assert.assertTrue(b);
		
b = cadastro.verificarSenha("AAAAAAA");
Assert.assertTrue(b);
		
b = cadastro.verificarSenha("333333");
Assert.assertTrue(b);
	
b = cadastro.verificarSenha("##***)");
Assert.assertTrue(b);
		
b = cadastro.verificarSenha("");
Assert.assertTrue(b);
		
b = cadastro.verificarSenha("a&b");
Assert.assertTrue(b);
		
b = cadastro.verificarSenha("Vf23)e");
Assert.assertFalse(b);	


