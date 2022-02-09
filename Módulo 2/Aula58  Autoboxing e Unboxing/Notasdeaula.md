## Aula58  Autoboxing e Unboxing

-Continuação do assunto de Wrappers.

-Na aula passada, aprendemos que podemos usar construtores das classes para instanciar os tipos primitivos.

-Porém, existe dois outros conceitos no java chamado Autoboxing e Unboxing. É um processo de transformar um tipo primitivo em um tipo objeto e vice versa.

-No autoboxing, em vez de chamar o construtor da classe, você pode fazer a atribuição de valor automaticamente.

Ex: 		Integer num9 = new Integer(100);

- Fazendo o autoboxing seria:

		Integer num9 = 100;


-O Auto unboxing transforma um tipo primitivo que era de uma classe em um tipo primitivo novamente.
			
            int num13 = num9;

- Cuidado com mau uso!
