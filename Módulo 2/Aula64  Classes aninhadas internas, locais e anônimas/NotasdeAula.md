## Aula64 Classes aninhadas: internas, locais e anônimas

**Classe aninhada interna** (static ou não)

-Uma coisa legal de classes internas no Java é que elas tem acesso aos atributos das classes externas.

-Ou seja, podemos acessar os atributos da classe externa de dentro da classe interna através do Externa.this.texto (nesse exemplo, a classe externa se chama externa e ela e a classe interna tem um atributo com o mesmo nome, chamado texto. Para acessar o texto da externa se faz dessa forma citada).

public class Externa {

	private String texto = "texto externo";
	
	public class Interna{
		
		private String texto = "texto interno";
		
		public void imprimeTexto(){
			System.out.println(texto);
			
			//consegue ver membros da classe externa
			System.out.println(Externa.this.texto); 
		}
	}
	
	public static void main(String[] args){
		
		Externa externa = new Externa();
		Interna interna = externa.new Interna();
		
		interna.imprimeTexto();
	}
}

Se a classe interna fosse static, não precisaria extancia-la usando o externa.new Interna();. Poderia retirar o externa.

-Exemplo no Externa.java

-Além das classes internas, existem também as...

**Classes Locais**

-Digamos, por exemplo, que temos uma classe externa 2  e a gente tenha um método qualquer. É possível declarar uma classe dentro desse método. Essa classe local que foi declarada ela só tem escopo dentro desse método qualquer, mas as vezes isso pode ser muito útil.

-Exemplo no Externa2.java

Outro tipo de classe interna que temos no java é a...

**Classe Anônima**

-É quando a gente instancia a classe e muda seu comportamento quando a gente ta instanciando. Podemos subscrever algo usando ela.

-Classes anônimas podem implementar interfaces.

-Exemplo no Anonima.java

### Em projetos reais, como utilizaríamos isso?

-Só declaramos classes internas quando queremos utilizar aquela classe interna dentro da externa. Tambem se você sabe que não vai usar essa classe em nenhuma outra parte do projeto e não quer criar uma classe só para ela.	

Ex:Hibernate/JPA (classe interna quando usar esses e for usar uma chave primária composta) (esses são frameworks de fazer acesso a bancos de dados do Java)

Swing (classes locais como actions no swing)

Collections (usa muito como classes anônimas, principalmente quando quer comparar objetos, entre outros)
