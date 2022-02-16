## Aula74 Threads: deadlocks

-O deadlock pode acontecer com processos no nosso sistema operacional e também pode acontecer com Threads. Mas o que exatamente é um deadlock?

-É quando uma thread A trava o objeto 1 e a thread B trava o objeto 2, mas a A precisa acessar o 2 e a B precisa acessar o 1, mas ninguém pode fazer isso porque estão travados. É assim que ocorre o deadlock.

- **Deadlock** é quando você bloqueia um recurso que um outro processo ou outra Thread queira utilizar.

- Maneiras de evitar o Deadlock: usando o wait() e o notify().
