# Desafio De Programação

Para o desafio de programação foi utilizado a IDE eclipse, a linguagem de programação utilizada foi Java e para os testes unitários foi utilizado o Junit.

As questões do desafio foram feitas em um único projeto, separadas por pacotes com os respetivos nomes: questao1, questao2 e questao3.

## Questão 1

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.

Exemplo:

Entrada:
n = 6

Saída: <br>
![Resultado da saida do programa](https://github.com/GlauberFerreiraAngelo/DesafioDaProgramacao/blob/main/img/escada.png)

O resultado desse primeira atividade foi feito manualmente e testado com a Junit. <br><br>
![Tela da questão 1](https://github.com/GlauberFerreiraAngelo/DesafioDaProgramacao/blob/main/img/tela%20da%20atividade%20escada.png)

Utilizando Junit <br><br>
![Tela da questão 1 Junit](https://github.com/GlauberFerreiraAngelo/DesafioDaProgramacao/blob/main/img/tela%20do%20Junit%20escada.png)
 
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
![Tela da questão 2](https://github.com/GlauberFerreiraAngelo/DesafioDaProgramacao/blob/main/img/tela%20da%20atividade%20senha.png)<br>

Agora uma tela com apenas um único carácter seguido os requisitos de validação e vemos as validações que faltam para a senha ser válida.<br><br>
![Tela da questão 2](https://github.com/GlauberFerreiraAngelo/DesafioDaProgramacao/blob/main/img/tela%20atividade%20senha%20resultados.png)<br>

Utilizando Junit <br><br>
![Tela da questão 2 Junit](https://github.com/GlauberFerreiraAngelo/DesafioDaProgramacao/blob/main/img/tela%20do%20Junit%20senha.png)

Como vemos na imagem a cima tem uma variação de teste para da errado como vemos no codigo a baixo. <br>

b = cadastro.verificarSenha("aaaaaa");<br>
Assert.assertTrue(b);
		
b = cadastro.verificarSenha("AAAAAAA");<br>
Assert.assertTrue(b);
		
b = cadastro.verificarSenha("333333");<br>
Assert.assertTrue(b);
	
b = cadastro.verificarSenha("##***)");<br>
Assert.assertTrue(b);
		
b = cadastro.verificarSenha("");<br>
Assert.assertTrue(b);
		
b = cadastro.verificarSenha("a&b");<br>
Assert.assertTrue(b);

Apenas esse teste abaixo da positivo
		
b = cadastro.verificarSenha("Vf23)e");<br>
Assert.assertFalse(b);	

O resultado false significa que não existe critérios que não foram invalidados.  

## Questão 3

Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um
algoritmo que encontre o número de pares de substrings que são anagramas.

Exemplo:

Exemplo 1)

Entrada:
ovo

Saída:
3

Exemplo 2)

Entrada:
ifailuhkqq

Saída:
3

Na explicação do exemplo 1 falar que: A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições [[0, 2], [0, 1],
[1, 2]] respectivamente.

Então os anagramas pares são: [o, o], [ov, vo] e o resultado da saída seria 3 por conta do número da posição [[0, 2], [0, 1],[1, 2]] o resultado bate com a saída mas no exemplo 2 o número de anagramas pares são:[i, i], [q, q] e [ifa, fai] e as posições são [[0, 3]],[[8, 9]] e [[0, 1, 2], [1, 2, 3]] da entende que são 4 mas a saída é 3 ai não sei se foi erro de digitação ou é uma pegadinha pra ver como resolvia o problema.

exemplo 1:<br><br>
![Tela da questão 3](https://github.com/GlauberFerreiraAngelo/DesafioDaProgramacao/blob/main/img/tela%20da%20atividade%20anagrama%20ovo.png)<br>

exemplo 2:<br><br>
![Tela da questão 3 ](https://github.com/GlauberFerreiraAngelo/DesafioDaProgramacao/blob/main/img/tela%20da%20atividade%20anagrama%20ifailuhkqq.png)<br>

Utilizando Junit <br><br>
![Tela da questão 3 Junit](https://github.com/GlauberFerreiraAngelo/DesafioDaProgramacao/blob/main/img/tela%20do%20Junit%20anagrama.png)<br>


Para o teste de validação foram feitos 3 testes: 

A primeira verificação foi feita para saber se palavra seria maior ou igual a zero <br>
Assert.assertTrue(questao3.anagrama("ovo") >= 0);<br>

Na segunda verificação foi feito para saber se recebendo um texto sem caracter se ele seria positivo <br>
Assert.assertTrue(questao3.anagrama("") >= 0);<br>

Na terceira verificou se palavra dava um valor negativo. <br>
Assert.assertFalse(questao3.anagrama("ifailuhkqq") < 0);
