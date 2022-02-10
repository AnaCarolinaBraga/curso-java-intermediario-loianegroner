## Notas da aula 62:  Varargs

-Nessa aula, vamos aprender uma funcionalidade do Java chamada Varargs.

-Varargs na verdade é um nome de um recurso da linguagem Java que permite que você passe infinitos parâmetros para um método sem ter que declarar todos os parâmetros.

-Quando fazemos, por exemplo, um método para somar a+b, precisamos colocar no parâmetro do método

EX: static int soma(int a, int b){
			return a + b;
}

-Só que se quiséssemos somar 3 números, teríamos que fazer outro método com 3 e por aí vai.

-O Varargs facilitou muito isso. Nele, você tem que passar como parâmetro uma classe (lembra da aula de Wrappers? Então). Você declara a classe, seguido de reticências (que indicam que não tem um número definido, são os que você colocar) e escreve vetor depois.

-Um Varargs seria assim:

static int soma(Integer... vetor){

			int total = 0;

			for (int i=0; i<vetor.length; i++){
				total += vetor[i];
			}

			return total;
		}

-Caso você precise declarar outras variáveis, se coloca elas antes do Varargs (já que o vararg não vai saber quando termina ele e quando começa a outra variável.

EX: 			static int soma(int a, int b, Integer... vetor){

