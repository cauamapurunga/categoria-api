# Categoria API

Este é um projeto simples de API REST para gerenciar categorias. A aplicação utiliza **Spring Boot** e armazena os dados em memória (usando ArrayList), sem o uso de banco de dados.

## Funcionalidades

- Criar uma nova categoria.
- Listar todas as categorias.
- Buscar uma categoria por ID.
- Atualizar uma categoria por ID.
- Deletar uma categoria por ID.

## Tecnologias

- Java
- Spring Boot
- Maven
- Lombok
- Jakarta Validation
- SpringDoc OpenAPI (Swagger)

## Endpoints

| Método HTTP | Endpoint               | Descrição                      |
|-------------|------------------------|--------------------------------|
| **POST**    | `/categorias`          | Criar uma nova categoria       |
| **GET**     | `/categorias`          | Listar todas as categorias     |
| **GET**     | `/categorias/{id}`     | Buscar categoria por ID        |
| **PUT**     | `/categorias/{id}`     | Atualizar categoria por ID     |
| **DELETE**  | `/categorias/{id}`     | Deletar categoria por ID       |

## Como Usar

- **Listar Categorias**  
  - URL: `http://localhost:8080/categorias`  
  - Método: **GET**

- **Buscar Categoria por ID**  
  - URL: `http://localhost:8080/categorias/{id}`  
  - Método: **GET**

- **Criar Categoria**  
  - URL: `http://localhost:8080/categorias`  
  - Método: **POST**  
  - Exemplo de JSON:
    ```json
    {
      "nome": "Nome da Categoria",
      "descricao": "Descrição opcional"
    }
    ```

- **Atualizar Categoria por ID**  
  - URL: `http://localhost:8080/categorias/{id}`  
  - Método: **PUT**  
  - Exemplo de JSON:
    ```json
    {
      "nome": "Novo Nome da Categoria",
      "descricao": "Nova descrição opcional"
    }
    ```

- **Deletar Categoria por ID**  
  - URL: `http://localhost:8080/categorias/{id}`  
  - Método: **DELETE**

## Documentação (Swagger)

Caso queira usar a documentação interativa da API, acesse: `http://localhost:8080/swagger-ui.html`  

![image](https://github.com/user-attachments/assets/8b3ffa36-8c81-4b85-b528-80fd17ab075a)
