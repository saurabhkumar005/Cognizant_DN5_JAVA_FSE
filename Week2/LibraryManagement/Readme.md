# Library Management - Spring Core Exercises

This project contains the implementation of **Exercise 1**, **Exercise 2**, and **Exercise 4** from the **Cognizant Deep Skilling - Spring Framework Module**.

The project demonstrates the fundamentals of the Spring Framework, including Maven configuration, Spring IoC Container, Bean Configuration, and Dependency Injection using XML.

---

# Technologies Used

- Java 21
- Maven
- Spring Framework 6.2.8
- IntelliJ IDEA

---

# Project Structure

```
LibraryManagement
│
├── src
│   ├── main
│   │
│   ├── java
│   │   └── com.library
│   │       │
│   │       ├── repository
│   │       │      └── BookRepository.java
│   │       │
│   │       ├── service
│   │       │      └── BookService.java
│   │       │
│   │       └── LibraryManagementApplication.java
│   │
│   └── resources
│          └── applicationContext.xml
│
├── pom.xml
└── README.md
```

---

# Exercise 1 - Configuring a Basic Spring Application

## Objective

Configure a basic Spring Framework application using XML configuration and the Spring IoC Container.

### Tasks Performed

- Created a Maven project named **LibraryManagement**
- Added Spring Core dependency (`spring-context`)
- Created `BookRepository`
- Created `BookService`
- Created `applicationContext.xml`
- Configured Spring Beans
- Loaded Spring IoC Container using `ApplicationContext`
- Retrieved `BookService` bean
- Executed the application

---

# Exercise 2 - Implementing Dependency Injection

## Objective

Implement Dependency Injection (DI) between `BookService` and `BookRepository` using Spring XML configuration.

### Tasks Performed

- Added Setter Injection in `BookService`
- Configured dependency injection using `<property>` tag
- Wired `BookRepository` into `BookService`
- Retrieved bean from Spring IoC Container
- Verified successful Dependency Injection

Spring internally performs:

```java
BookRepository repository = new BookRepository();

BookService service = new BookService();

service.setBookRepository(repository);
```

without requiring the developer to manually create or inject objects.

---

# Exercise 4 - Creating and Configuring a Maven Project

## Objective

Configure a Maven project for a Spring application by adding the required Spring dependencies and configuring the Maven Compiler Plugin.

### Spring Dependencies Added

- Spring Context
- Spring AOP
- Spring Web MVC

### Maven Compiler Plugin

Configured the project to use **Java 21**.

```xml
<plugin>

    <groupId>org.apache.maven.plugins</groupId>

    <artifactId>maven-compiler-plugin</artifactId>

    <version>3.14.0</version>

    <configuration>

        <source>21</source>

        <target>21</target>

    </configuration>

</plugin>
```

---

# Spring Dependencies Used

| Dependency | Purpose |
|------------|---------|
| spring-context | Provides Spring IoC Container, BeanFactory, and ApplicationContext |
| spring-aop | Supports Aspect-Oriented Programming (AOP) |
| spring-webmvc | Used for developing Spring MVC web applications |

---

# Concepts Learned

After completing these exercises, the following concepts were understood:

- Maven Project Structure
- pom.xml Configuration
- Spring Core
- Spring Context
- Spring IoC Container
- ApplicationContext
- Bean Creation
- Bean Configuration
- XML Configuration
- Dependency Injection (Setter Injection)
- Bean Wiring
- Maven Dependencies
- Maven Compiler Plugin
- Spring AOP
- Spring Web MVC

---

# Internal Working

```
Application Starts
        │
        ▼
Load applicationContext.xml
        │
        ▼
Spring IoC Container Starts
        │
        ▼
Create BookRepository Bean
        │
        ▼
Create BookService Bean
        │
        ▼
Inject BookRepository into BookService
        │
        ▼
Store Beans inside IoC Container
        │
        ▼
Main Class Requests BookService Bean
        │
        ▼
Spring Returns Bean
        │
        ▼
BookService Calls BookRepository
```

---

# Output

```
BookService is working...

Book saved successfully.
```

---

# Key Spring Concepts Demonstrated

- Inversion of Control (IoC)
- Dependency Injection (DI)
- Setter Injection
- Spring Bean
- ApplicationContext
- XML Bean Configuration
- Maven Dependency Management
- Maven Compiler Plugin
- Spring Core
- Spring AOP (Dependency Added)
- Spring Web MVC (Dependency Added)

---

# Learning Outcome

After completing these exercises, you will be able to:

- Create a Maven-based Spring Framework project.
- Configure Spring beans using XML.
- Understand the Spring IoC Container.
- Implement Dependency Injection using Setter Injection.
- Load and retrieve beans using `ApplicationContext`.
- Configure Maven dependencies and plugins.
- Prepare a Spring project for future modules such as Spring MVC and Spring Boot.