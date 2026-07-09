# 🔐 Identity Service

> A Spring Boot RESTful backend service providing user authentication, authorization, and identity management using JWT and Role-Based Access Control (RBAC).

![Java](https://img.shields.io/badge/Java-17-orange?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-success?logo=springboot)
![Spring Security](https://img.shields.io/badge/Spring-Security-green?logo=springsecurity)
![JWT](https://img.shields.io/badge/JWT-Authentication-blue)
![Maven](https://img.shields.io/badge/Maven-Build-red?logo=apachemaven)

---

# 📖 Overview

Identity Service is a backend application built with Spring Boot that provides secure user authentication and authorization for modern web applications.

The project implements JWT-based authentication, role and permission management, RESTful APIs, and follows a layered architecture for maintainability and scalability.

---

# ✨ Features

- 🔐 User Authentication
- 👤 User Management
- 🛡 JWT Access Token
- 🔑 Role-Based Access Control (RBAC)
- 📋 Permission Management
- 🌐 RESTful APIs
- ⚠ Global Exception Handling
- 🗂 DTO & Mapper Pattern

---

# 🏗 Architecture

```text
Controller
     │
     ▼
 Service
     │
     ▼
Repository
     │
     ▼
 Database
```

The project follows a layered architecture to separate business logic, data access, and API handling.

---

# 🛠 Tech Stack

| Category | Technologies |
|----------|--------------|
| Language | Java 17 |
| Framework | Spring Boot 3 |
| Security | Spring Security, JWT |
| ORM | Spring Data JPA |
| Build Tool | Maven |
| Database | MySQL |
| API | RESTful API |

---

# 📂 Project Structure

```text
src
└── main
    ├── configuration
    ├── controller
    ├── dto
    ├── entity
    ├── exception
    ├── mapper
    ├── repository
    ├── service
    └── IdentityServiceApplication
```

---

# 🚀 Core Modules

## Authentication

- User Login
- JWT Token Generation
- Token Validation
- Token Introspection

---

## User Management

- Create User
- Update User
- Retrieve User Information
- Delete User

---

## Authorization

Role-Based Access Control (RBAC) is implemented using:

- Roles
- Permissions
- Spring Security

This design allows flexible permission assignment and secure API access.

---

# 📡 REST APIs

Example API endpoints:

| Method | Endpoint | Description |
|---------|-----------|-------------|
| POST | `/auth/token` | Authenticate user |
| POST | `/auth/introspect` | Validate JWT token |
| POST | `/users` | Create new user |
| GET | `/users` | Retrieve users |
| PUT | `/users/{id}` | Update user |
| DELETE | `/users/{id}` | Delete user |

> Actual endpoints may vary depending on project configuration.

---

# 🔒 Security

The application secures APIs using:

- JWT Authentication
- Spring Security Filter Chain
- Password Encryption
- Role-Based Authorization

---

# 📈 Highlights

- Layered architecture
- Clean separation of concerns
- DTO and Mapper pattern
- Global exception handling
- RESTful API design
- JWT-based authentication
- RBAC implementation

---

# 🚀 Future Improvements

- Refresh Token support
- OAuth2 / OpenID Connect
- Docker deployment
- API documentation with Swagger/OpenAPI
- Unit & Integration Testing

---

# 👨‍💻 Author

**Van Anh**

Software Engineer

Interested in Backend Engineering, Artificial Intelligence, and Distributed Systems.
