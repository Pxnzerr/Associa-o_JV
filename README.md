# 🎓 Associação — Sistema Acadêmico

Projeto Java que demonstra o conceito de **Associação** em Programação Orientada a Objetos, modelando o relacionamento entre Professores, Estudantes e Cursos.

## Sobre

Este projeto ilustra como objetos de diferentes classes se relacionam entre si sem que um "possua" o outro. O `Curso` possui referência a um `Professor` e a uma lista de `Estudante`, exemplificando a associação **um-para-muitos**.

## Estrutura do Projeto

```
Associa-o_JV/
├── Main.java         # Ponto de entrada — demonstração de uso
├── Curso.java        # Classe que agrega Professor e Estudantes
├── Professor.java    # Classe do professor com nome e especialidade
└── Estudante.java    # Classe do estudante com nome e matrícula
```

## Conceitos de POO Demonstrados

| Conceito | Aplicação |
|---|---|
| Associação | `Curso` referencia `Professor` e `List<Estudante>` |
| Composição | Lista de estudantes gerenciada internamente pelo `Curso` |
| Encapsulamento | Atributos privados com getters e setters |

## Como Compilar e Executar

```bash
# Compilar
javac Main.java Professor.java Estudante.java Curso.java

# Executar
java Main
```

## Requisitos

- Java 11+
