# Anagram Generator API

Uma aplicação Spring Boot que gera todas as possíveis anagramas de uma sequência de letras distintas fornecida como entrada.

---

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.4.5
- Maven
- JUnit 5
- Swagger (Springdoc OpenAPI)

---

## Como executar o projeto

### Pré-requisitos

- Java 17+
- Maven instalado (ou use os scripts `mvnw` / `mvnw.cmd`)
- IDE recomendada: Visual Studio Code ou IntelliJ

### Passos para rodar:

1. Clone o repositório:
   git clone <URL_DO_REPOSITORIO>
   cd demo

2. Compile e execute:
   ./mvnw spring-boot:run

3. Acesse a aplicação em:
   http://localhost:8080

---

## Documentação da API (Swagger)

A documentação interativa está disponível após subir a aplicação:

http://localhost:8080/swagger-ui.html

---

## Endpoint Principal

POST /generate

Gera todos os anagramas possíveis de uma string com letras distintas.

### Corpo da Requisição:

{
  "letters": "abc"
}

### Exemplo de Resposta:

[
  "abc",
  "acb",
  "bac",
  "bca",
  "cab",
  "cba"
]

---

## Testes

A aplicação contém testes automatizados com JUnit para validação da lógica de anagramas.

### Para rodar os testes:

./mvnw test

Estrutura de testes:

- AnagramApplicationTests – Verifica se o contexto do Spring carrega corretamente.
- AnagramServiceTest – Valida a lógica de geração de anagramas com diferentes casos de entrada.

---

## Estrutura do Projeto

src
├── main
│   ├── java
│   │   └── com.example.anagram
│   │       ├── controller
│   │       │   └── AnagramController.java
│   │       ├── model
│   │       │   └── AnagramRequest.java
│   │       ├── service
│   │       │   └── AnagramService.java
│   │       └── AnagramApplication.java
│   └── resources
│       └── application.properties
├── test
│   └── java
│       └── com.example.anagram
│           ├── AnagramApplicationTests.java
│           └── service
│               └── AnagramServiceTest.java

---

## Observações

- A entrada deve conter apenas letras (`a-z`, `A-Z`) e sem repetições.
- Entradas inválidas (como vazias ou com números) são ignoradas com retorno vazio.

---

## Autor

Desenvolvido por Renan Lima.
