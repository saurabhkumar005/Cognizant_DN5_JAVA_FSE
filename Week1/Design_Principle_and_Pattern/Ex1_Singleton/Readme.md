# Exercise 1 - Implementing the Singleton Pattern

## Problem Statement

Implement the Singleton Design Pattern to ensure that a Logger class has only one instance throughout the application lifecycle.

---

## Project Structure

```text
Ex1-Singleton
│
├── Logger.java
├── Main.java
└── README.md
```

---

## Theory

### What is Singleton Pattern?

Singleton is a **Creational Design Pattern** that ensures only **one object** of a class is created during the entire execution of the application.

Instead of allowing developers to create objects using the `new` keyword multiple times, the class controls its own object creation and always returns the same instance.

---

### Why is Singleton Needed?

Suppose an application creates a new Logger object every time logging is required.

```java
Logger logger1 = new Logger();
Logger logger2 = new Logger();
Logger logger3 = new Logger();
```

This creates multiple Logger objects, which wastes memory and may produce inconsistent logging behavior.

Singleton solves this problem by creating only one Logger object and sharing it throughout the application.

---

## Steps Used

1. Declare a private static instance of the Logger class.
2. Make the constructor private to prevent object creation using `new`.
3. Create a public static `getInstance()` method.
4. Return the existing object if it already exists; otherwise create it.

---

## Advantages

* Only one object is created.
* Saves memory.
* Provides a global access point.
* Easy to manage shared resources.
* Prevents unnecessary object creation.

---

## Real-World Uses

* Logging Frameworks
* Database Connections
* Configuration Managers
* Cache Managers
* Printer Spoolers

---

## Output

The program creates only one Logger object. Both variables reference the same object, which is verified using their identical hash codes.

---

