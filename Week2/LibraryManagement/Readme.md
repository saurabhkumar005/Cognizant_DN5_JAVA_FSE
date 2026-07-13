# Library Management - Spring Core Exercises

This project contains the implementation of **Exercise 1** and **Exercise 2** from the Cognizant Deep Skilling Spring Framework module.

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

Configure a basic Spring Framework application using XML configuration.

## Tasks Performed

- Created a Maven project named **LibraryManagement**
- Added Spring Core dependency (`spring-context`)
- Created `BookRepository`
- Created `BookService`
- Created `applicationContext.xml`
- Configured Spring beans
- Loaded Spring IoC Container using `ApplicationContext`
- Retrieved `BookService` bean
- Executed the application

---

# Exercise 2 - Implementing Dependency Injection

## Objective

Implement Dependency Injection (DI) between `BookService` and `BookRepository` using Spring IoC.

## Tasks Performed

- Added a setter method in `BookService`
- Configured dependency injection using XML
- Wired `BookRepository` into `BookService`
- Retrieved the bean from the Spring IoC Container
- Verified successful dependency injection

---

# Concepts Learned

- Spring Framework
- Spring Core
- Maven Project
- IoC (Inversion of Control)
- Dependency Injection (Setter Injection)
- XML Bean Configuration
- ApplicationContext
- Bean Creation
- Bean Wiring
- Spring Container

---

# Bean Configuration

The dependency is injected using XML configuration.

```xml
<bean id="bookRepository"
      class="com.library.repository.BookRepository"/>

<bean id="bookService"
      class="com.library.service.BookService">

    <property
        name="bookRepository"
        ref="bookRepository"/>

</bean>
```

Spring internally performs:

```java
BookRepository repository = new BookRepository();

BookService service = new BookService();

service.setBookRepository(repository);
```

without requiring the developer to create the objects manually.

---

# Output

```
BookService is working...

Book saved successfully.
```

---

# Internal Working

```
Application Starts
        │
        ▼
Load applicationContext.xml
        │
        ▼
Create BookRepository Bean
        │
        ▼
Create BookService Bean
        │
        ▼
Inject BookRepository using Setter Injection
        │
        ▼
Store Beans in Spring IoC Container
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

# Learning Outcome

After completing these exercises, the following concepts were understood:

- Creating a Spring Core application
- Configuring beans using XML
- Loading the Spring IoC Container
- Understanding Bean creation
- Implementing Dependency Injection using Setter Injection
- Managing object creation through Spring instead of using the `new` keyword