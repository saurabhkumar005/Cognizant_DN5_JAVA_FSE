# Exercise 2 - Implementing the Factory Method Pattern

## Problem Statement

Implement the Factory Method Design Pattern to create different types of documents such as Word, PDF, and Excel in a document management system.

---

## Project Structure

```text
FactoryMethodPatternExample
│
├── Document.java
├── WordDocument.java
├── PdfDocument.java
├── ExcelDocument.java
├── DocumentFactory.java
├── WordDocumentFactory.java
├── PdfDocumentFactory.java
├── ExcelDocumentFactory.java
├── Main.java
└── README.md
```

---

## Theory

### What is Factory Method Pattern?

The Factory Method Pattern is a **Creational Design Pattern** that creates objects without exposing the object creation logic to the client.

Instead of creating objects directly using the `new` keyword, the client requests an object from a factory class. The factory decides which object should be created and returned.

---

### Why is Factory Method Needed?

Suppose a document management system creates documents like this:

```java
Document doc = new WordDocument();
```

If tomorrow we need to create a PDF or Excel document, we have to modify the client code.

This tightly couples the client with the concrete classes.

Using the Factory Method Pattern, the client only communicates with the factory. Adding new document types requires creating a new factory class without changing the existing client logic.

---

## Advantages

* Loose Coupling
* Easy to Extend
* Better Code Reusability
* Easy Maintenance
* Follows the Open/Closed Principle (OCP)

---

## Real-World Uses

* Document Editors
* Notification Systems
* Database Drivers
* Payment Gateways
* Spring Framework Bean Creation

---

## Output

The program creates different document objects through their respective factory classes and opens them without the client knowing how the objects are created.

The Factory Method Pattern separates object creation from object usage. It makes the application flexible, maintainable, and easy to extend by introducing new document types without modifying existing client code.

