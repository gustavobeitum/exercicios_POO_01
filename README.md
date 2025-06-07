# Projeto de Exercícios em Java

Este repositório contém exercícios resolvidos utilizando a linguagem de programação Java, como parte das atividades de aprendizagem de Programação Orientada a Objetos.

## Linguagem e Versão

- **Linguagem:** Java
- **Versão utilizada:** Java 21
- **IDE recomendada:** IntelliJ IDEA ou VSCode (opcional)

## Como Executar o Projeto

### 1. Pré-requisitos

- Certifique-se de que você tem o `Java Development Kit (JDK) 21` instalado. Se não tiver, pode fazer o download [neste link da Oracle](https://www.oracle.com/br/java/technologies/downloads/#jdk21-windows).
- Tenha o `git` instalado para clonar o repositório.

### 2. Clonando o Repositório

Abra o Terminal:

- No Windows, você pode usar o Git Bash (que vem com a instalação do Git) ou o Prompt de Comando.
- No macOS ou Linux, use o Terminal.

Navegue até a Pasta Desejada:

Use o comando cd (change directory) para entrar na pasta onde você quer salvar o projeto. Por exemplo, para salvar na pasta "Documentos".

Agora, use o comando git clone seguido pelo link do repositório.
```bash
# Clone este repositório para a sua máquina
git clone [https://github.com/gustavobeitum/exercicios_POO_List_01.git](https://github.com/gustavobeitum/exercicios_POO_List_01.git)
```
**Atenção**: O comando git clone cria uma nova pasta com o nome do repositório (exercicios_POO_List_01 neste caso) e baixa todo o código.

### 3. Executando o Programa

Cada exercício é independente, você precisará compilar e executar cada um separadamente. O processo é o mesmo para todos eles e vamos usar o Exercicio_1_1 como exemplo.

Navegue para a Raiz do Projeto

Primeiro, certifique-se de que você está dentro da pasta principal do projeto (a que contém as pastas lib e src). O nome do repositório é exercicios_POO_List_01, o comando pode ser:
```bash
cd exercicios_POO_List_01
```
Crie a Pasta de Saída

É uma boa prática separar os arquivos de código-fonte (.java) dos arquivos compilados (.class). Vamos criar uma pasta chamada out para isso:
```bash
mkdir out
```
Compile o Código com javac

Agora vamos ao comando principal de compilação. Ele precisa saber duas coisas: onde salvar os arquivos compilados (-d) e quais arquivos compilar.

A estrutura src/Exercicio_1_1/... nos diz que o pacote principal é Exercicio_1_1. Vamos compilar todos os arquivos .java dentro dele.
```bash
javac -d out src\Exercicio_1_1\**\*.java
```
Se o ** não funcionar no seu Prompt de Comando, você pode listar os arquivos explicitamente:
```bash
javac -d out src\Exercicio_1_1\application\Main.java src\Exercicio_1_1\core\Calculadora.java src\Exercicio_1_1\view\Menu.java
```
Após executar este comando, a pasta out será populada com a mesma estrutura de pacotes da pasta src, mas contendo os arquivos .class.

Com tudo compilado, é hora de rodar! Precisamos dizer ao java onde encontrar nossas classes (out) e qual é a classe principal a ser executada.

O nome completo da classe principal é Exercicio_1_1.application.Main.
```bash
java -cp "out" Exercicio_1_1.application.Main
```
E pronto! Ao executar o último comando, o programa Java deve começar a rodar no terminal.
