## Aula68 Threads: Interface Runnable

-Nessa aula, vamos aprender como criar uma thread utilizando a interface Runnable.

-Só que, diferente de quanto estende a classe Thread, para essa daqui é necessário passar a classe que implementa o Runnable para Thread.

### Qual abordagem é melhor? Estender a classe Thread ou implementar a interface Runnable?

-Quando estendemos o Thread, o único método que podemos sobrescrever é o run.

-Quando implementamos Runnable, também precisamos implementar o método run.

-Com a classe Runnable, podemos estender qualquer outra classe. 
Classes só conseguem estender uma única outra classe.

-Se não for sobrepor qualquer outro método da classe Thread, pode ser melhor usar Runnable.