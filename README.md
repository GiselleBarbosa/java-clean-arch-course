# Curso: Aplicando Clean Architecture em Microsserviços com Java, Spring Boot, MongoDB e Kafka 💻☕
Este repositório contém o código-fonte e exemplos práticos do curso **"Aprenda na prática como aplicar a Clean Architecture em microsserviços"**.

O curso é voltado para desenvolvedores que desejam aprender a aplicar **Clean Architecture** em projetos de microsserviços, 
utilizando tecnologias como **Java**, **Spring Boot**, **MongoDB** e **Apache Kafka**. 

## 🎯 Objetivo do Projeto

O objetivo deste projeto é aprender sobre a implementação da **Clean Architecture** em um ambiente de **microsserviços**, 
mostrando como estruturar aplicações que se comunicam com bancos de dados NoSQL, mensageria, e outros clients. 
Embora o curso utilize Java, os conceitos ensinados podem ser aplicados em outras linguagens orientadas a objetos. 

## 🛠️ Tecnologias Utilizadas

- **Java** ☕️: Linguagem de programação utilizada no projeto.
- **Spring Boot** 🌱: Framework para facilitar o desenvolvimento de microsserviços.
- **MongoDB** 🍃: Banco de dados NoSQL.
- **Apache Kafka** 📨: Plataforma de mensageria para comunicação entre microsserviços.


## 🏗️ Estrutura do Projeto

O projeto é dividido em seções que cobrem os principais conceitos e práticas:

1. **Visão Geral** : Apresentação do fluxo do projeto, ferramentas e tecnologias utilizadas.
2. **Construção de CRUD** : Implementação de um CRUD completo utilizando Clean Architecture, com criação dos domains, use cases, data providers, e entry points.
3. **Mensageria** : Criação de consumidores e produtores de mensagens utilizando Apache Kafka.

## 📍  Executando a Aplicação:

### 1. Iniciar Wiremock para simular a API de endereço
`java -jar wiremock-standalone-3.9.1.jar --port 8082`

**GET/addresses**:  `http://localhost:8082/addresses/38400001`

###  2. Executar os containers
No diretório docker-local: `docker-compose up -d`


### 3. EXCUTAR O BANCO DE DADOS MONGODB
1. `docker ps`
2. *inserir a senha do DB*
3. `docker exec -it container_id /bin/bash`
4. `mongosh -u root -p`
5. `show databases`
6. `use cleanarch`
7. `show collections`
8. `db.customers.find()`

### EXPLICACAO DOS COMANDOS DO BANCO DE DADOS MONGODB
1. `docker ps`: Lista os containers em execução. **_Selecionar o id do container do mongodb_**

2. `docker exec -it container_id /bin/bash`: Executa um terminal interativo dentro do container Docker com o ID 2c6d631662f4.

3. `mongosh -u root -p`: Abre o shell do MongoDB (Mongosh), iniciando a sessão com o usuário root e solicitando a senha.

4. `use cleanarch`: Alterna para o banco de dados cleanarch no MongoDB.

5. `show databases`: Exibe todos os bancos de dados

6. `show collections`: Exibe todas as coleções (tabelas) disponíveis no banco de dados atual (neste caso, cleanarch).

7. `db.customers.find()`: Executa uma consulta na coleção customers e exibe todos os documentos (registros) armazenados.

### 4. EXCUTAR A APLICAÇÃO
- Execute o run da aplicação na classe principal do projeto.

## 📚 Referência  
[**Aprenda na prática como aplicar a Clean Architecture em microsserviços utilizando Java, Spring Boot, MongoDB e Kafka**](https://www.udemy.com/course/descomplicando-clean-architecture-na-pratica) 🎓
