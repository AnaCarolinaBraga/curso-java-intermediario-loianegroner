## Aula67 Criando Threads + métodos start, run e sleep

-Nós temos dois tipos de multitarefas: processos e threads;

- O processo é como se fosse um programa que está sendo executado. (e a gente já ta um pouco familiarizado com isso, porque estamos utilizando um sistema operacional para ver o curso.

- Thread é a menor unidade de código que pode ser executada. (ou seja, dentro de um processo, dentro de um programa, podemos executar duas ou mais tarefas ao mesmo tempo. A gente chama essas tarefas de Thread).

**Vantagem de usar threads**:

- Deixa os programas mais eficientes.

### Existem cinco ciclos de vida, 5 estados importantes que vamos aprender durante todo o módulo de Threads:

O primeiro deles é quando criamos uma nova Thread. Nós estamos criando uma instância. Quando criamos uma nova Thread, podemos deixar essa thread pronta para execução. Ou seja, vai ser uma Thread que vai estar no estado Runnable, pronta pra execução. Pra isso, a gente utiliza o método start().

Quando a Thread está pronta para execução, ela será executada. Para isso, a gente chama o método run().

Quando a Thread está sendo executada, podemos fazer duas coisas com ela. Ou a execução dela termina e ela vai para o estado de Dead, ou seja, vai ser uma Thread terminada, uma Thread morta. Ou então podemos coloca-la para dormir/esperar/suspender. Quando fazemos uma dessas 3 ações, colocamos a Thread em estado de espera, que seria o Waiting. Quando ela esta nesse estado, a gente pode acordar, nós podemos notificar as threads para que elas saiam do estado de espera com notify(), notifyAll(), resume(). Ou então podemos resumir a sua execução. Ela volta então para o estado de pronta para execução e depois ela pode voltar para o estado “em execução”.

Podemos também levar do estado em execução, “Running”, para o “Runnable”, pronto para execução, com o yield().

### Como criar uma Thread?

-Existem duas maneiras:

- Podemos estender a classe Thread.

- Podemos implementar a interface Runnable.

### Nessa aula, nós vamos:

-Estender a classe Thread;

-ver 3 métodos importantes de uma Thread: start, run, sleep

- O método start inicia a Thread, inicia o método run.

- O método run vai executar a Thread, ou seja, vai colocar a Thread em execução, vai executar a tarefa que precisa ser feita.

- O método sleep coloca a Thread para dormir por X milissegundos.

Para uma Thread conseguir ser executada, a gente precisa sobrescrever o método run.

### Sobre o código:

MinhaThread.java = Classe que estende Thread. Temos os métodos start(), run() e sleep().

Teste.java = Testes para ver como funcionam a execução das Threads e o funcionamento dos três métodos anteriores.



