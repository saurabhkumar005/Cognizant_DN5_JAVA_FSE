# Spring REST using Spring Boot 3 

---

# Project Structure

```
src
├── main
│   ├── java
│   │   └── com.cognizant.springlearn
│   │       ├── controller
│   │       │      ├── HelloController.java
│   │       │      ├── CountryController.java
│   │       │      └── AuthenticationController.java
│   │       │
│   │       ├── service
│   │       │      └── CountryService.java
│   │       │
│   │       ├── security
│   │       │      └── SecurityConfig.java
│   │       │
│   │       ├── Country.java
│   │       └── SpringLearnApplication.java
│   │
│   └── resources
│       ├── application.properties
│       └── country.xml
```

---

# Mandatory Hands-ons Completed

## 1. Spring Boot Project Creation

- Created Spring Boot Maven project
- Configured Maven
- Explored project structure
- Understood Spring Boot starter dependencies
- Executed Spring Boot application

---

## 2. Spring Core - Load Country from Spring XML

Implemented:

- Country Bean
- country.xml
- Spring Bean Configuration
- ApplicationContext
- ClassPathXmlApplicationContext
- Bean Loading
- Dependency Injection using XML
- Logging using SLF4J

Sample Bean

```xml
<bean id="country">
    ...
</bean>
```

---

## 3. Hello World RESTful Web Service

Endpoint

```
GET /hello
```

Returns

```
Hello World!!
```

Concepts Learned

- @RestController
- @RequestMapping

---

## 4. REST - Country Web Service

Endpoint

```
GET /country
```

Returns

```json
{
  "code":"IN",
  "name":"India"
}
```

Concepts Learned

- REST Controller
- JSON Response
- Bean Loading from XML

---

## 5. REST - Get Country by Country Code

Endpoint

```
GET /countries/{code}
```

Example

```
GET /countries/in
```

Returns

```json
{
  "code":"IN",
  "name":"India"
}
```

Features

- @PathVariable
- Service Layer
- Case-insensitive Search
- Country List loaded from XML

---

## 6. Spring Security - Basic Authentication

Implemented

- Spring Security Configuration
- HTTP Basic Authentication
- BCrypt Password Encoder
- In-Memory Users
- Role Based Authorization

Users

| Username | Password | Role |
|----------|----------|------|
| user | pwd | USER |
| admin | pwd | ADMIN |

---

## 7. Authentication REST Service

Endpoint

```
GET /authenticate
```

Reads

```
Authorization Header
```

Returns

```json
{
   "token":"..."
}
```

Concepts Learned

- @RequestHeader
- Basic Authentication
- Base64 Decoding
- JWT Generation

---

# REST Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | /hello | Hello World |
| GET | /country | Get India |
| GET | /countries/{code} | Get Country using Code |
| GET | /authenticate | Generate JWT Token |

---

# Security

Implemented

- Spring Security
- HTTP Basic Authentication
- BCrypt Password Encoding
- JWT Token Generation

---

# Logging

Implemented logging using SLF4J.

Example

```java
LOGGER.info("START");

LOGGER.debug("Authorization Header : {}", authHeader);

LOGGER.info("END");
```

---

# Build

```
mvn clean install
```

Run

```
mvn spring-boot:run
```

---

# Learning Outcomes

- Spring Boot Fundamentals
- Spring Core
- Bean Configuration using XML
- Dependency Injection
- REST API Development
- Controller Layer
- Service Layer
- Spring Security
- Basic Authentication
- JWT Authentication
- Logging with SLF4J
- Maven Project Structure

---

# Author

**Saurabh Kumar**

B.Tech CSE

Lovely Professional University
