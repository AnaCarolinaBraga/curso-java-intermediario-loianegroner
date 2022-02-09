## Aula59 Importação estática (static import)

-Imagina um método em que vamos usar muito os métodos estáticos de uma determinada classe. Todos os métodos da classe Math são estáticos, porque não precisamos instanciar a classe Math para poder utilizar os métodos. (ver no exemplo de código dessa aula).

-Agora imagina se queremos usar muito a classe Math, por exemplo, fazendo uma calculadora. Para fazer uma dessas, usamos muito os métodos matemáticos, como poderíamos fazer isso economizando o Math.?

-Fazemos isso através do import static, lembra que quando vamos adicionar algo de outro pacote/biblioteca precisamos fazer um import? Então...

-Vamos fazer o import assim, ainda usando o exemplo do Math. Fazemos o import static e declaramos depois qual método específico queremos:

import static java.lang.Math.pow;

-Então quando formos usar o Math.pow, em vez de usarmos no texto assim:

Math.pow(a, b)

Usamos assim:

pow(a, b);

-Se usar um asterisco, importa todos os métodos dele:

import static java.lang.Math.*;

-Só que não é considerado elegante. É melhor você deixar claro quais métodos exatamente você pegou para usar, então é melhor declará-los individualmente.
