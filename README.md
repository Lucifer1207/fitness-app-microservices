# Fitness App Microservices Architecture

A distributed fitness tracking backend application built using Java Spring Boot and Microservices Architecture.

## Tech Stack

- Java
- Spring Boot
- Spring Cloud
- Maven
- PostgreSQL
- MongoDB
- Apache Kafka
- Docker
- Eureka Server
- API Gateway
- Config Server
- Gemini AI Integration

## Microservices

### User Service
- Handles user management
- Uses PostgreSQL

### Activity Service
- Handles workout/activity tracking
- Uses MongoDB

### AI Service
- Integrates Gemini AI API
- Generates fitness insights and recommendations

### Eureka Server
- Service discovery and registry

### API Gateway
- Centralized routing

### Config Server
- Centralized configuration management

## Architecture Features

- Microservices architecture
- Synchronous REST communication
- Asynchronous communication using Kafka
- Service discovery with Eureka
- AI integration using Gemini API
- Dockerized Kafka setup

## Future Improvements

- Keycloak Authentication
- JWT Security
- Kubernetes Deployment
- CI/CD Pipeline
