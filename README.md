# Desafio POO - UML e Implementação iPhone

Este projeto faz parte do desafio de POO da DIO, onde foi solicitado:

- Criar um diagrama UML do iPhone com suas funcionalidades principais:
  - Reprodutor Musical
  - Aparelho Telefônico
  - Navegador na Internet
- Implementar as classes e interfaces correspondentes em Java.

---

## Tecnologias utilizadas

- **Java 17**  
- **IDE:** IntelliJ IDEA  
- **Git & GitHub** para controle de versão  
- **Mermaid** para criação do diagrama UML renderizado no GitHub  

---

## Diagrama UML

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
