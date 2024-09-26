## CURSO: APLICANDO CLEAN ARCHITECTURE EM MICROSERVIÇOS COM JAVA, SPRING BOOT, MONGODB E KAFKA
Este repositório contém o código-fonte e exemplos práticos do curso **"Aprenda na prática como aplicar a Clean Architecture em microsserviços"**.

O curso é voltado para desenvolvedores que desejam aprender a aplicar **Clean Architecture** em projetos de microsserviços,
utilizando tecnologias como **Java**, **Spring Boot**, **MongoDB** e **Apache Kafka**.

### 🎯 OBJETIVO DO PROJETO
O objetivo deste projeto é aprender sobre a implementação da **Clean Architecture** em um ambiente de **microsserviços**,
mostrando como estruturar aplicações que se comunicam com bancos de dados NoSQL, mensageria, e outros clients.
Embora o curso utilize Java, os conceitos ensinados podem ser aplicados em outras linguagens orientadas a objetos.

### 🛠️ TECNOLOGIAS UTILIZADAS
- **Java** ☕️: Linguagem de programação utilizada no projeto.
- **Spring Boot** 🌱: Framework para facilitar o desenvolvimento de microsserviços.
- **MongoDB** 🍃: Banco de dados NoSQL.
- **Apache Kafka** 📨: Plataforma de mensageria para comunicação entre microsserviços.

### 🏗️ ESTRUTURA DO PROJETO
O projeto é dividido em seções que cobrem os principais conceitos e práticas:

-  **VISÃO GERAL**: Apresentação do fluxo do projeto, ferramentas e tecnologias utilizadas.
- **CONSTRUÇÃO DE CRUD**: Implementação de um CRUD completo utilizando Clean Architecture, com criação dos domains, use cases, data providers, e entry points.
- **MENSAGERIA**: Criação de consumidores e produtores de mensagens utilizando Apache Kafka.

#### 1. INICIAR WIREMOCK PARA SIMULAR A API DE ENDEREÇO
`java -jar wiremock-standalone-3.9.1.jar --port 8082`

**GET/addresses**:  `http://localhost:8082/addresses/38400001`

#### 2. EXECUTAR OS CONTAINERS
No diretório docker-local: `docker-compose up -d`

#### 3. EXECUTAR O BANCO DE DADOS MONGODB
1. `docker ps`
2. *inserir a senha do DB*
3. `docker exec -it container_id /bin/bash`
4. `mongosh -u root -p`
5. `show databases`
6. `use cleanarch`
7. `show collections`
8. `db.customers.find()`

#### EXPLICAÇÃO DOS COMANDOS DO BANCO DE DADOS MONGODB
1. `docker ps`: Lista os containers em execução. **_Selecionar o id do container do mongodb_**

2. `docker exec -it container_id /bin/bash`: Executa um terminal interativo dentro do container Docker com o ID 2c6d631662f4.

3. `mongosh -u root -p`: Abre o shell do MongoDB (Mongosh), iniciando a sessão com o usuário root e solicitando a senha.

4. `use cleanarch`: Alterna para o banco de dados cleanarch no MongoDB.

5. `show databases`: Exibe todos os bancos de dados.

6. `show collections`: Exibe todas as coleções (tabelas) disponíveis no banco de dados atual (neste caso, cleanarch).

7. `db.customers.find()`: Executa uma consulta na coleção customers e exibe todos os documentos (registros) armazenados.

#### 4. EXECUTAR A APLICAÇÃO
- Execute o run da aplicação na classe principal do projeto.

#### 📡 ENDPOINTS DISPONÍVEIS

A API oferece os seguintes recursos relacionados a clientes:

1. **Inserir Cliente**
    - **Método:** `POST`
    - **Endpoint:** `/api/v1/customers`
    - **Descrição:** Insere um novo cliente.
    - **Requisição:**
        - Corpo: JSON contendo os dados do cliente (deve seguir o modelo `CustomerRequest`).
    - **Resposta:** `204 No Content` (sem corpo).

2. **Buscar Cliente por ID**
    - **Método:** `GET`
    - **Endpoint:** `/api/v1/customers/{id}`
    - **Descrição:** Retorna os dados de um cliente específico pelo seu ID.
    - **Parâmetro:**
        - `id`: ID do cliente a ser buscado.
    - **Resposta:**
        - `200 OK` com um corpo JSON contendo os dados do cliente (modelo `CustomerResponse`).

3. **Atualizar Cliente**
    - **Método:** `PUT`
    - **Endpoint:** `/api/v1/customers/{id}`
    - **Descrição:** Atualiza os dados de um cliente existente.
    - **Parâmetro:**
        - `id`: ID do cliente a ser atualizado.
    - **Requisição:**
        - Corpo: JSON contendo os novos dados do cliente (modelo `CustomerRequest`).
    - **Resposta:** `204 No Content` (sem corpo).

4. **Deletar Cliente**
    - **Método:** `DELETE`
    - **Endpoint:** `/api/v1/customers/{id}`
    - **Descrição:** Remove um cliente pelo seu ID.
    - **Parâmetro:**
        - `id`: ID do cliente a ser deletado.
    - **Resposta:** `204 No Content` (sem corpo).

5. **Buscar Todos os Clientes**
    - **Método:** `GET`
    - **Endpoint:** `/api/v1/customers`
    - **Descrição:** Retorna a lista de todos os clientes.
    - **Resposta:**
        - `200 OK` com um corpo JSON contendo uma lista de clientes (modelo `CustomerResponse`).

#### 📚 REFERÊNCIA
[**Aprenda na prática como aplicar a Clean Architecture em microsserviços utilizando Java, Spring Boot, MongoDB e Kafka**](https://www.udemy.com/course/descomplicando-clean-architecture-na-pratica) 🎓
