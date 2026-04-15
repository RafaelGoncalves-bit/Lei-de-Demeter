# Projeto Demeter

Este é um projeto Java simples que demonstra a Lei de Demeter (Law of Demeter) através de exemplos de cálculo de frete.

## Estrutura do Projeto

- `CalculadoraDeFreteBom.java`: Implementação que segue a Lei de Demeter.
- `CalculadoraDeFreteRuim.java`: Implementação que viola a Lei de Demeter.
- `Pedido.java`: Classe Pedido com delegação.
- `Cliente.java`: Classe Cliente.
- `Endereco.java`: Classe Endereco.
- `Main.java`: Classe principal para executar os exemplos.

## Pré-requisitos

- Java 11 ou superior
- Maven (opcional, para build automatizado)

## Como Executar

### Com Maven (recomendado):
1. Instale o Maven se não tiver.
2. Compile o projeto: `mvn compile`
3. Execute: `mvn exec:java -Dexec.mainClass="demeter.Main"`

### Sem Maven:
1. Instale o JDK 11+.
2. Compile: `javac -d . src/main/java/demeter/*.java`
3. Execute: `java demeter.Main`

## Lei de Demeter

A Lei de Demeter diz que um objeto deve conhecer apenas seus amigos imediatos, não os amigos dos amigos. Isso promove baixo acoplamento e alta coesão.