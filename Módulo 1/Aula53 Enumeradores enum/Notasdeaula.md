## Módulo 1 - Aula 53 Enumeradores (Enum)

-Os enumeradores são muito mais do que um tipo de constante. Eles possuem funcionalidades extras que podem deixar nosso projeto muito mais elegante e com um controle muito melhor para o desenvolvedor.

-Qual a diferença de constantes e enum?
Como constante, você não tem como garantir o controle de que aquilo que você quer é o que será utilizado. Por exemplo, você declara o valor como inteiro. Só que nada garante que a pessoa coloque um valor que você não declarou.

O Enum não. As únicas possibilidades de escolha são as que você colocou dentro dele, isso te da garantia de que só uma daquelas opções poderá ser escolhida.

Ex: int segunda = DiaSemanaConstantes.SEGUNDA;
A pessoa podia colocar  int segunda = 10;

Com o Enum não, só pode ser:
DiaSemana segunda = DiaSemana.SEGUNDA;

Essa é a vantagem de usar Enum.

-Enumeradores também seguem padrões de constantes. Cada Enum também é em caixa alta.

### Explicação sobre os códigos

DiaSemana.java = Dias da semana como enum;

DiaSemanaConstantes.java = Dias da semana como constante;

Teste.java = demonstração de como usa algo como Enum e como constante.