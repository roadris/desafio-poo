
# POO - Desafio

## Descrição do desafio
### Modelagem e Diagramação de um Componente iPhone

Neste desafio, você será responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

#### Contexto
Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), você deve elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implemente as classes e interfaces no formato de arquivos `.java`.

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)


#### Funcionalidades a Modelar
1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).

## Resultados
Comparativo entre as funcionalidades propostas e todas as funcionalidades modeladas como solução para o desafio.
Obs: As funcionalidades em **negrito** foram modeladas e implementadas além das propostas no desafio.

1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`, **`selecionarCapa(String musica)`**
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`, **`selecionarCorreioVoz(String numero)`**, **`armazenarNumeroFavorito(String numero)`**, **`listarLigacoesPerdidas()`**
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`, **`adicionarUrlFavoritos(String url)`**

### Diagrama de classes (UML)

```mermaid
classDiagram
    class iPhone{
                
    }
    class TodasInterfaces{
        +int volume
        +aumentarVolume()
        +diminuirVolume()

    }
    
    TodasInterfaces --|> iPhone : Extends
    TodasInterfaces o-- ReprodutorMusical : Agregação
    TodasInterfaces o-- AparelhoTelefonico : Agregação
    TodasInterfaces o-- NavegadorInternet : Agregação
    
    class ReprodutorMusical{
        <<interface>>
      +tocar()
      +pausar()
      +selecionarMusica(String musica)
      +selecionarCapa(String musica)
    }
    class AparelhoTelefonico{
        <<interface>>
      +ligar(String numero)
      +atender()
      +iniciarCorreioVoz()
      +selecionarCorreioVoz(String numero)
      +armazenarFavoritos(String numero)
      +listarLigacoesPerdidas()

    }
    class NavegadorInternet{
        <<interface>>
      +exibirPagina(String url)
      +adicionarNovaAba()
      +atualizarPagina()
      +adicionarFavoritos(String url)
    }
```
### Implementação das classes Java
Todas as classes foram implementadas e os códigos estão disponíveis nas pastas desse repositório.

## Linguagem de Programação
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

## Ferramentas
[![GitHub](https://img.shields.io/badge/GitHub-000?style=for-the-badge&logo=github&logoColor=30A3DC)](https://docs.github.com/)
[![Git](https://img.shields.io/badge/Git-000?style=for-the-badge&logo=git&logoColor=E94D5F)](https://git-scm.com/doc) 
![Vscode](https://img.shields.io/badge/Vscode-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white)
