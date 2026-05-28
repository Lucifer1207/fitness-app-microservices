# 🏋️ Fitness App Microservices Architecture

A scalable AI-powered fitness tracking application built using **Java Spring Boot, React.js, and Microservices Architecture**.
The project follows a **distributed, event-driven design** with secure authentication, asynchronous communication, centralized service management, and AI-powered fitness recommendations. 🚀

---

# 🧩 System Architecture

![Fitness App Architecture](architecture/architecture-diagram.jpg)

The application follows a distributed microservices architecture where:

* 🌐 API Gateway acts as the single entry point
* 👤 User Service manages authentication and user data
* 🏃 Activity Service handles workout tracking
* 🤖 AI Service generates personalized recommendations using Gemini AI
* 📩 Kafka enables asynchronous communication between services
* 🔍 Eureka Server provides service discovery
* ⚙️ Config Server centralizes configurations
* 🔐 Keycloak handles authentication and authorization
* 💻 React frontend communicates securely through Gateway APIs

---

# 🛠️ Tech Stack

## ⚡ Backend

* Java
* Spring Boot
* Spring Cloud
* Maven
* Spring Security
* REST APIs

## 🎨 Frontend

* React.js
* Vite
* Redux Toolkit
* CSS3

## 🗄️ Databases

* PostgreSQL
* MongoDB

## ☁️ Infrastructure & Communication

* Apache Kafka
* Docker
* Eureka Server
* Spring Cloud Gateway
* Config Server

## 🔐 Authentication & Security

* Keycloak
* JWT Authentication
* OAuth2
* SHA-256 Token Security

## 🤖 AI Integration

* Gemini AI API

---

# ✨ Frontend Features

The React frontend provides:

* 🔑 Secure user authentication
* 🏋️ Workout/activity management
* 🔗 API integration with backend services
* 📦 Redux-based state management
* 📱 Responsive user interface
* 🌐 Gateway-based backend communication

---

# 🧱 Microservices

## 👤 User Service

* Handles user authentication and profile management
* Uses PostgreSQL database
* Integrated with Keycloak and JWT-based security

## 🏃 Activity Service

* Manages workout and activity tracking
* Uses MongoDB database
* Communicates asynchronously with AI Service using Kafka

## 🤖 AI Service

* Integrates Gemini AI API
* Generates personalized fitness recommendations and insights
* Uses MongoDB database

## 🔍 Eureka Server

* Service registry and discovery for all microservices

## 🌐 API Gateway

* Centralized API routing and request handling
* Secured using JWT authentication

## ⚙️ Config Server

* Centralized configuration management across services

---

# 🚀 Architecture Features

* 🧩 Microservices-based distributed architecture
* 🔄 Synchronous REST communication between services
* 📩 Asynchronous event-driven communication using Apache Kafka
* 🔍 Service discovery using Eureka Server
* 🌐 Centralized API routing using Spring Cloud Gateway
* 🔐 Secure authentication and authorization using Keycloak
* 🎟️ JWT Access & Refresh Token implementation
* 🛡️ SHA-256 based token security mechanism
* ⚙️ Centralized configuration management using Config Server
* 🤖 AI-powered recommendation system using Gemini API
* 🐳 Dockerized Kafka setup for local development

---

# 🔒 Security Features

* 🔑 OAuth2 authentication using Keycloak
* 🎟️ JWT-based stateless authentication
* ♻️ Access Token and Refresh Token workflow
* 🛡️ SHA-256 based token signing/validation
* 🚫 Protected API routes using Spring Security
* 🌐 Secure API access through Gateway routing

---

# 📂 Project Structure

```bash
fitness-app/
│
├── user-service/
├── activity-service/
├── ai-service/
├── gateway/
├── eureka-server/
├── config-server/
├── fitness-frontend/
│
├── architecture/
│   └── architecture-diagram.jpg
│
└── README.md
```

---

# 🔮 Future Improvements

* ☸️ Kubernetes deployment
* 🔄 CI/CD pipeline integration
* 📊 Monitoring with Prometheus and Grafana
* 🛰️ Distributed tracing and centralized logging
* 👥 Role-based access control enhancements
* 📈 Frontend dashboard analytics
* 🐳 Container orchestration using Kubernetes

---

# ⭐ Why This Project?

This project was built to explore how modern scalable backend systems work in real-world applications using:

* Microservices Architecture
* Event-Driven Communication
* Distributed Systems Concepts
* AI Integration
* Secure Authentication
* Full Stack Development

It combines backend engineering, scalable system design, frontend integration, and AI-powered workflows into a single distributed application. 🚀
