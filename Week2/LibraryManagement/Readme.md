# Exercise 1 - Configuring a Basic Spring Application

## Objective

Configure a basic Spring Framework application using XML configuration and the IoC Container.

---

## Technologies Used

- Java 21
- Maven
- Spring Framework 6.2.8
- IntelliJ IDEA

---

## Project Structure

```
LibraryManagement
│
├── repository
│      BookRepository.java
│
├── service
│      BookService.java
│
├── MainApp.java
│
├── applicationContext.xml
│
└── pom.xml
```

---

## Steps Performed

1. Created a Maven Project.
2. Added Spring Core dependency.
3. Created BookRepository class.
4. Created BookService class.
5. Configured beans in applicationContext.xml.
6. Loaded Spring Context using ApplicationContext.
7. Retrieved BookService bean.
8. Executed the application.

---

## Output

```
Book Service Called

Book Repository Called
```

---

## Concepts Learned

- Spring Framework
- Maven Project
- IoC Container
- ApplicationContext
- XML Bean Configuration
- Dependency Injection (Setter Injection)
- Bean Creation