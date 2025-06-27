# AnagramGenerator
Teste solicitado para gerar anagramas

Dependencias 
Java 21 
Maven

Como rodar o teste, clone o repositorio e na sequencia faça 
um build com mavem e em seguida execute o teste. 


Explicação da solução: 

- O Teste esta sendo chamado de uma classe que é a AnagramGenerator na qual foi implementado dois construtores para a mesma, o primeiro costrutor vazio
é responsavel por executar o teste esperando um valor de entrada para gerar os anagramas, ja o segundo construtor é responsavel por receber o valor ja no momento de instanciar a classe. 
Desta forma a classe fica isolada e com metodos e atributos privados e a main não fica poluida com alguma implementação. Outro ponto é que para gerar os testes unitarios facilita a opção de entrar com o valor direto 
ao inves de aguardar um valor por parte do usuario. 

- O teste tem uma validação de entrada para valores nulos, vazios e caracteres diferentes de letras, para este ultimo utilizei uma expressão regular pra fazer a comparação com a entrada em questão. 

- A logica principal consiste em um metodo recursivo, responsavel por ficar percorrendo os caracteres, sempre fixando os valores e gerando os anagramas daquele valor fixado, cada anagrama encontrado ele adiciona em uma LIST e vai para o proximo caractere até encerrar todos e mostrar no console. 

obs : Existe a opção de usar o SET que não aceita valores repetidos no lugar do List, por exemplo em uma entrada com "ANA" ele repete alguns valores, mas como não especificado não implementei. (So pra deixar como ponto mesmo.)




