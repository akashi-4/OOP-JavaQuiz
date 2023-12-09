# Potrivia - Jogo de Perguntas e Respostas

O Potrivia é um jogo de perguntas e respostas que abrange várias áreas, incluindo Artes, Ciências e Desporto. Este projeto foi desenvolvido por João Furukawa e Mateus Lima como parte do curso de Programação Orientada a Objetos da Universidade de Coimbra. 

Aviso: as perguntas, respostas e opções são exageradas para demonstrar as funcionalidades do jogo!

## Funcionalidades

- Perguntas diversificadas em três áreas principais: Artes, Ciências e Desporto, sendo que Desporto se divide em três subáreas: Futebol, Ski, Natação.
- Sistema de pontuação com majoração diferente para avaliar o desempenho do jogador, premiando responder temas menos convencionais como Artes ou Ski.
- Interface interativa para uma experiência de jogo envolvente.
- Sistema de ranking para armazenar as pontuações mais altas.
- Sistema de salvamento de perguntas em arquivos `.txt` para permitir a adição de novas perguntas sem a necessidade de alterar o código-fonte.
- Ao avançar do jogo, as perguntas se tornam mais difíceis, isto é, aumentando o número de alternativas e/ou colocando opções mais difíceis.
- Implementação de JavaDocs para facilitar a compreensão do código-fonte.

## Estrutura do Projeto

- `Potrivia.java`: Classe principal que inicia o jogo.
- `Gui.java:` Classe que implementa a interface gráfica do jogo.
- `Pergunta.java`: Classe base para representar perguntas.
- `Desporto.java`, `Artes.java`, `Ciencias.java`: Subclasses que representam perguntas específicas de cada área.
- `Futebol.java`, `Ski.java`, `Natacao.java`: Subclasses que representam perguntas específicas de cada subárea de Desporto.

## Como Executar

1. Clone o repositório para o seu ambiente local.
2. Abra o projeto em sua IDE favorita.
**Aviso: Dependendo do IDE que você está usando:**
   - **IntelliJ:** Os arquivos `.dat` podem ser gerados fora da pasta `src`. Certifique-se de verificar o local exato onde esses arquivos são criados e ajuste os caminhos de leitura/escrita conforme necessário.
   - **VSCode:** Os arquivos `.dat` são gerados na mesma pasta do código-fonte (`src`). Não são necessários ajustes adicionais.
   - **Outras IDEs/ambientes:** Os caminhos dos arquivos podem variar. Verifique a documentação da sua IDE ou ajuste conforme necessário.

**Nota sobre alteração/adição de perguntas:**
   - Você pode alterar as perguntas existentes seguindo as regras abaixo.
   - **Regras:**
      1. Mantenha o formato das perguntas do arquivo `perguntas.txt`.
      2. Evite modificar o número total de opções para cada pergunta.
      3. As perguntas devem se encaixar nas categorias existentes (Artes, Ciências, Desporto).
      4. Atente-se às regras específicas de cada categoria:
            - **Artes:** formato do .txt: tipo;subtipo;pergunta;resposta;opção1;opção2;opção3;opção4 
            - **Ciências:** formato do .txt: tipo;subtipo;pergunta;resposta;opção1;opção2;opção3;opção4;opçãoFacil1;opçãoFacil2;opçãoFacil3;opçãoFacil4
            - **Desporto:** formato do .txt: tipo;subtipo;pergunta;resposta;resposta2;opção1;opção2;opção3;opção4;opçãoDificil1;opçãoDificil2;opçãoDificil3;opçãoDificil4
            Atenção: o tipo varia de 1 a 3, sendo 1->Artes, 2->Ciências e 3->Desporto. O subtipo varia de 1 a 3, sendo 1->Futebol, 2->Ski e 3->Natação.
3. Execute a classe `Potrivia.java` para iniciar o jogo.

## Contribuições

Contribuições são bem-vindas! Se você deseja contribuir para o desenvolvimento deste projeto, sinta-se à vontade para abrir um pull request.

## Autores

- João Furukawa
- Mateus Lima

## Licença

Este projeto está sob a Licença MIT - veja o arquivo [LICENSE.md](LICENSE.md) para detalhes.

