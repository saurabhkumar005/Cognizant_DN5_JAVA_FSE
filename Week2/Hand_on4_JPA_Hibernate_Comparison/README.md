# Hands-on 4: Difference between JPA, Hibernate and Spring Data JPA

## Objective

The objective of this hands-on is to understand the relationship between JPA, Hibernate and Spring Data JPA, and learn how Spring Data JPA simplifies database operations by reducing the amount of code written by the developer.

---

## What is ORM?

ORM (Object Relational Mapping) is a technique used to connect Java objects with database tables. Instead of writing SQL queries manually for every operation, the ORM framework converts Java objects into SQL statements and also converts the database records back into Java objects.

For example, if we create a `Country` object in Java, the ORM framework can automatically insert its data into the `country` table without writing an `INSERT` query manually.

Some advantages of ORM are:

- Reduces JDBC boilerplate code.
- Automatically maps objects to database tables.
- Makes code easier to read and maintain.
- Supports different databases with minimal code changes.

---

## What is JPA?

JPA (Java Persistence API) is a Java specification that defines a standard way to perform database operations. It provides rules, interfaces and annotations for object-relational mapping.

JPA itself is not a framework and it does not contain any implementation. It only defines how persistence should work. To actually perform database operations, an implementation such as Hibernate is required.

Some commonly used JPA annotations are:

- `@Entity`
- `@Table`
- `@Id`
- `@Column`

---

## What is Hibernate?

Hibernate is an ORM framework and one of the most popular implementations of JPA.

Hibernate performs the actual work of converting Java objects into SQL queries. It manages sessions, transactions, object mapping and database communication automatically.

Some important features of Hibernate are:

- Object Relational Mapping (ORM)
- Automatic SQL generation
- Transaction management
- Session management
- Database independence

---

## What is Spring Data JPA?

Spring Data JPA is a Spring framework module built on top of JPA. It internally uses Hibernate (or another JPA implementation) to communicate with the database.

Its main purpose is to reduce boilerplate code by providing ready-made CRUD methods through the `JpaRepository` interface.

The developer only needs to create a repository interface, and Spring automatically provides the implementation.

---

## Relationship between JPA, Hibernate and Spring Data JPA

The three technologies work together.

- JPA provides the specification.
- Hibernate implements that specification.
- Spring Data JPA uses Hibernate internally and provides additional features to reduce coding effort.

The flow of execution is:

Application

↓

Spring Data JPA

↓

Hibernate

↓

JDBC Driver

↓

MySQL Database

---

## Hibernate Example

Using Hibernate, we need to manually open a session, begin a transaction, save the object, commit the transaction and finally close the session.

```java
Session session = factory.openSession();

Transaction tx = session.beginTransaction();

session.save(employee);

tx.commit();

session.close();
```

In this approach, the developer is responsible for handling the session and transaction manually.

---

## Spring Data JPA Example

Repository

```java
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
```

Service

```java
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}
```

In Spring Data JPA, there is no need to write code for opening sessions, managing transactions or writing SQL queries manually. Spring performs these tasks automatically.

---

## Benefits of Spring Data JPA

Spring Data JPA offers several advantages over traditional Hibernate programming.

- Less code needs to be written.
- CRUD methods are already available.
- Transactions are managed automatically.
- Code is easier to understand and maintain.
- Development becomes faster.
- Repository interfaces reduce boilerplate code.

---

## Conclusion

JPA is only a specification and cannot perform database operations by itself. Hibernate is an ORM framework that implements the JPA specification and handles object-relational mapping. Spring Data JPA is built on top of Hibernate and further simplifies development by providing built-in repository methods and automatic transaction management. Because of these advantages, Spring Data JPA is the preferred approach for developing modern Spring Boot applications.
