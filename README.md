# DSList - Intensivão Java Spring

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Wesley2v/dslist/blob/main/LICENSE)

## Projeto

Este projeto foi desenvolvido durante o curso *__Intensivão Java Spring__* oferecida pela [DevSuperior](https://devsuperior.com.br). O projeto consiste em uma Api Rest de criação e 
gerenciamento de listas de jogos.

## Tecnologias 

Este projeto foi desenvolvido com as seguintes tecnologias : 

- Java (21)
- Spring Boot
- JPA / Hibernate
- Maven

## Modelo de domínio DSList
![image](https://github.com/MatheusPrudente/dslist/assets/80559882/8874bb22-4ac1-4ee0-a148-45ec73fef224)

## Passos para Executar o Projeto

1. **Clone o repositório:**

    ```
    git clone https://github.com/Wesley2v/dslist.git
    ```

2. **Acesse o diretório do projeto:**

    ```
    cd dslist
    ```

3. **Compile o projeto:**

    ```
    mvn clean install
    ```

4. **Execute a aplicação:**

    ```
    mvn spring-boot:run
    ```

5. **Acesse a aplicação:**

    Acesse a aplicação no navegador pelo endereço [http://localhost:8080](http://localhost:8080).

# Endpoints

#### Obter lista de todos games cadastrados

```https
  GET /games
```


#### Obter game pelo id

```https
  GET /games/{id}
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `Long` | **Obrigatório**. Id do Game |


#### Obter lista de gêneros de games

```https
  GET /lists
```


#### Obter lista de jogos de um gênero específico

```https
  GET /lists/{id}/games
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `Long` | **Obrigatório**. Id da Lista de Game |


#### Mudar a posição do Game dentro de uma lista de Games

```https
  POST /lists/{id}/replacement
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `id` | `Long` | **Obrigatório**. Id da Lista de Game |
| `body` | `ReplacementDTO` | **Obrigatório**. Informações da posição de origem e posição destino |

