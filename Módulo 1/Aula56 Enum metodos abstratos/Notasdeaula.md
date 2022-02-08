 ## Aula56 Enum: métodos abstratos

- Vamos aprender como implementar métodos abstratos dentro do Enum.

### Explicação dos códigos:

TipoDocumento.java = Enum com a constante CPF e CNPJ. Implementamos um método abstrato para gerar numeros de teste. Para isso, usamos a classe GeraCpfCnpj.

GeraCpfCnpj.java = classe construída por //https://raw.githubusercontent.com/muriloferreira/utilities/master/GeraCpfCnpj.java
e que nós só vamos usar para fins didáticos. Ele serviu para gerar aleatoriamente os numeros de CPF e CNPJ.

Pessoa.java = classe que guarda a pessoa e o número do documento dela.

TesteDocumento.java = classe que usamos para testar as anteriores. Nela, pegamos uma pessoa e colocamos para pegar o numero de documento dela (CPF ou CNPJ) e o sistema gera esse número para nós, através do método abstrato do Enum. 
