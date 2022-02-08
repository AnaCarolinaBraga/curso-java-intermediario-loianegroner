## Aula55 Enum: métodos value e valueOf

-Nessa aula, vamos aprender como obter todos os valores dentro de um Enum. Aprenderemos também como funcionam os métodos value e valuOf dos enumeradores.

-O método .values() depois do nosso enum vai retornar um array de todos os valores que estão dentro do enumerador.
Ex: 		DiaSemana[] dias = DiaSemana.values();

-O método valueOf, vamos supor que eu quero colocar em uma variável um valor, mas eu não sei o enumerador dela, só sei a String. Eu posso usar o método valueOf
Ex: 		DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");

### Explicação dos códigos

TesteEnum.java = Aprendemos a usar o método value. Usamos o DiaSemana.java como nosso enum aqui;

TesteEnum2.java = Aprendemos a usar o método valueOf aqui. Usamos o DiaSemana2.java como nosso enum aqui, porque esse enum não tem valores para suas constantes;

DiaSemana.java = enum com valores para as constantes. Construído na aula 54;

DiaSemana2.java = enum sem valores para as constantes. Construído na aula 53.