# Fitness App Microservices Architecture

A scalable AI-powered fitness tracking backend application built using Java Spring Boot and Microservices Architecture. The project follows a distributed, event-driven design with secure authentication, asynchronous communication, and centralized service management.

---

## Tech Stack

* Java
* Spring Boot
* Spring Cloud
* Maven
* PostgreSQL
* MongoDB
* Apache Kafka
* Docker
* Keycloak
* JWT Authentication
* Eureka Server
* Spring Cloud Gateway
* Config Server
* Gemini AI API

---

## Microservices

### User Service

* Handles user authentication and profile management
* Uses PostgreSQL database
* Integrated with Keycloak and JWT-based security

### Activity Service

* Manages workout and activity tracking
* Uses MongoDB database
* Communicates asynchronously with AI Service using Kafka

### AI Service

* Integrates Gemini AI API
* Generates personalized fitness recommendations and insights
* Uses MongoDB database

### Eureka Server

* Service registry and discovery for all microservices

### API Gateway

* Centralized API routing and request handling
* Secured using JWT authentication

### Config Server

* Centralized configuration management across services

---

## Architecture Features

* Microservices-based distributed architecture
* Synchronous REST communication between services
* Asynchronous event-driven communication using Apache Kafka
* Service discovery using Eureka Server
* Centralized API routing using Spring Cloud Gateway
* Secure authentication and authorization using Keycloak
* JWT Access & Refresh Token implementation
* SHA-256 based token security mechanism
* Centralized configuration management using Config Server
* AI integration using Gemini API
* Dockerized Kafka setup for local development

---

## Security Features

* OAuth2 authentication using Keycloak
* JWT-based stateless authentication
* Access Token and Refresh Token workflow
* SHA-256 based token signing/validation
* Protected API routes using Spring Security

---

## Future Improvements

* Kubernetes deployment
* CI/CD pipeline integration
* Monitoring with Prometheus and Grafana
* Distributed tracing and centralized logging
* Role-based access control enhancements
