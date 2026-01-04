# Weather API Wrapper 🌦️

Projeto desenvolvido seguindo o desafio do **[roadmap.sh](https://roadmap.sh/projects/weather-api-wrapper-service)**.

O objetivo é criar uma API intermediária que busca dados de clima (Visual Crossing), armazena em **Cache** para economizar requisições e exibe em um Frontend simples.

## 🛠 Tecnologias
* **Java / Spring Boot**
* **Spring Cache** (Cache em memória)
* **HTML/CSS/JS** (Frontend integrado)

## ⚙️ Funcionalidades

- Consulta de clima atual por cidade.
- Integração com a API da Visual Crossing.
- Sistema de Cache: Se uma cidade for pesquisada novamente, os dados são retornados instantaneamente da memória, economizando cota da API.
- Tratamento de dados JSON para Objetos Java (DTOs).
- Interface gráfica simples e responsiva.

## 🔗 Referência
* Desafio original: [Weather API Wrapper Service](https://roadmap.sh/projects/weather-api-wrapper-service)
