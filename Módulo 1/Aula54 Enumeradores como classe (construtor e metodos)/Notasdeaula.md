## Aula 54 - Enumeradores como classe (construtor e métodos)

-Nessa aula, vamos aprender a usar os numeradores como se fossem classes. Ou seja, fazendo uso de construtores e métodos como se fosse uma outra classe do java.

-Para declarar enumeradores como construtores, precisamos ter ao menos um atributo e um construtor. A gente pode também ter um método para obtermos o valor desse atributo.

public enum DiaSemana{
SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);
private int valor;  			 -> atributo
DiaSemana(int valor) {                  -> construtor
		this.valor = valor;
} 
public int getValor(){                    	    -> método
		return valor;
} 
}

-Outros exemplos de quando usar enums: Você pergunta o gênero da pessoa, em vez de guardar Masculino e Feminino, você só guarda M e F.

-O constructo do enumerador pode ser feito sem o public na frente.

-Informações importantes sobre enumeradores:

- Mesmo que a gente esteja declarando um publice num DiaSemana, automaticamente ali, por trás dos panos, os enums estendem a classe java.lang.Enum, então existe uma classe chamada Enum que dá todas essas funcionalidades de métodos e construtores para a gente.

- Os enumeradores podem ser comparados com o operador de igual ==, enquanto a comparação de classes usamos o método equals

- Não podem ser instanciados com new, quando damos um valor para os numeradores, já estamos chamando os construtores do enum ali mesmo e por isso não precisa utilizar o new

- Não precisamos usar modificadores de acesso, por exemplo o public na hora de declarar o construtor do enum, isso é porque o construtor do enum também é utilizado ali internamente pelo próprio enumerador.

- Podem implementar interfaces. Mas como eles já estendem a classe java.lang.Enum, eles não podem estender nenhuma outra classe. Então não existe herança dentro de enum. Não da para declarar um super Enum e depois um Enum filho.

- Podemos declarar os enums dentro de uma própria classe também.

### Explicação dos códigos

Aula54.java = Classe para testar o que fizemos. Chamamos o Enum do DiaSemana e da Data.

DiaSemana.java = Enum com declaração de constructo e método.

Data.java = Chamou o Enum DiaSemana o declarando como variável.

formulario.java = Classe que construiu dentro dela própria o Enum que ia utilizar.
