## Aula73 Threads: resume, suspend e stop

-Pode ser útil suspender uma thread. Por exemplo, uma thread que mostra a hora do dia. Podemos suspender e posteriormente resumir a execução.

-Até o Java 2, existiam os métodos resume, suspend e stop

-O método suspend foi substituído no Java 2 por poder causar problema de deadlock

-O resume não funciona sem o suspend, também foi removido.

-O método stop também foi substituído no Java 2 (deve-se usar o método interrupt no lugar)

-Mas ainda podemos adicionar esses comportamentos na nossa Thread de maneira mais segura. Vamos aprender a fazê-los.

- **Suspend** =suspende temporariamente a execução da Thread, “pausa” a Thread

- **Resume** = resume, ou “despausa”, a execução da Thread

- **Stop** = Termina a execução da Thread
