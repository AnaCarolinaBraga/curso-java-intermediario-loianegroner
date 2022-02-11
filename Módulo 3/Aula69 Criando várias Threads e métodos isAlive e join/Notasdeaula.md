## Aula69 Criando várias Threads + métodos isAlive e join

-Aprendemos sobre os métodos isAlive e join().

-Se temos uma mensagem depois das Threads, como fazer para ela só ser mostrada depois que as Threads terminarem?

**Teste.java** = Tentamos colocar o programa principal para dormir para as Threads terminarem, só que para isso precisamos “chutar” o tempo que ela vai ter que esperar dormindo. Não é um método nada eficaz.

**Teste1.java** = O programa usa o método isAlive() e a mensagem só é executada depois que ele termina. Mas não é a forma mais elegante de fazer.

**Teste2.java** = O programa usa o método join(). É a forma mais elegante de se fazer, a mensagem só aparece depois que todas as threads finalizarem.
