## Aula72 Threads: notify, wait e notifyAll

Imagine a seguinte situação:

Temos uma Thread S que está sendo executada dentro de um método sincronizado e precisa de acesso a um recurso R que no momento está indisponível

Se a Thread ficar esperando o recurso, ela vai bloquear o objeto, impedindo que outras threads acessem o mesmo

Nesse caso, a melhor solução para não causar problemas é liberar temporariamente o controle do objeto permitindo que outra thread seja executada. E ai, quando tivermos o objeto/o recurso que a gente precisa, a gente volta e resume a execução da tarefa que estamos fazendo.

Pra fazer esse revezamento esses a threads, podemos usar 3 métodos. O primeiro deles é o:

- **wait**: bloqueia a execução da thread temporariamente, ou seja, coloca a thread em modo de espera.

A thread, então, entra em modo de espera até ser notificada. Para fazer a notificação, temos dois métodos:

- **notify**: notifica uma thread que estava esperando, ou seja, retorna a execução da thread

- **notifyAll**: notifica todas as threads e a que tem prioridade mais alta ganha acesso ao objeto
