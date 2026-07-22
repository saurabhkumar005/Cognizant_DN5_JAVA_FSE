# Loan Microservice

## Description

A simple Spring Boot REST microservice for Loan

## Tech Stack

- Java 21
- Spring Boot 4.1.0
- Spring Web
- Maven

## Server Port

8081

## REST Endpoint

**GET**

```
/loans/{number}
```

Example

```
GET /loans/H00987987972342
```

Response

```json
{
  "number": "H00987987972342",
  "type": "car",
  "loan": 400000.0,
  "emi": 3258.0,
  "tenure": 18
}
```
