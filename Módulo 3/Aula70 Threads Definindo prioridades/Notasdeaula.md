## Aula70 Threads: Definindo prioridades

-Se você colocar threads com o mesmo tempo, o programa vai executa-las ao mesmo tempo. Pode ser que quando ele for imprimir na tela, ele não imprima na ordem que você criou. Como fazer para isso não ocorrer? Definindo prioridades.

-Se faz isso com o .setPriority(num). A prioridade vai de 1 a 10, que é o número que você colocará no num. Ou então pode usar uma constante, que é MAX_PRIORITY, NORM_PRIORITY e MIN_PRIORITY, que você colocaria no lugar do num.

-Na maioria das vezes a prioridade vai ser respeitada, mas não quer dizer que sempre será.
