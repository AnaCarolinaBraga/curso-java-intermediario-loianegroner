## Aula63 printf

-printf é uma forma da gente formatar a saída de um texto no java.
System.out.printf(“formato-string”, [arg1, arg2, arg3]);

-Isso que aprendermos hoje vai servir quando começarmos a estudar as classes utilitárias do Java.

-Para o printf, passamos como parâmetros uma String e uma vararg. Precisamos aplicar uma formatação na String, porque se eu quero passar um argumento e falar que ele é so tipo String, então a gente utiliza % que é para indicar o tipo de dado  que vamos passar para o método e em seguida o código correspondente. No caso da String, é um s. Fica %s.

-Se usar o S maiúsculo, ou seja, %S, o java passa todo o texto para capslock.

-Além de formatar Strings, também conseguimos formatar caracteres. %c e %C. %d representa números inteiros. %f representa pontos flutuantes. %n pula linha.

-Se quiser ter mais controle, da para colocar um número entre o % e o caractere. Por exemplo %20s, vai fazer com que a String esteja limitada a 20 caracteres. E se ela tiver menos? Ele adiciona espaços com alinhamento a direita. %-20s o alinhamento fica a esquerda.

-%+d imprimi o valor de + na frente do número. %015d quer dizer que o numero tem que ter 15 digitos, e se sobrar espaço você vai completar com zero. %,d separa as casas de números (a cada três) com vírgulas.

-mas a gente vai usar esse printf em que? vou ser sincera com voces, não vão usar. Só vão usar mesmos nos exercicios ou para fazer brincadeiras. Na vida real, a gente aplica isso em outra classe, que é Java.util.Formater, que faz a mesma coisa que o printf
