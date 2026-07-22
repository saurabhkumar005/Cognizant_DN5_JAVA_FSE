# Account Microservice

## Description

A simple Spring Boot REST microservice 

## Tech Stack

- Java 21
- Spring Boot 4.1.0
- Spring Web
- Maven

## REST Endpoint

### Get Account Details

**GET**

```
/accounts/{number}
```

Example

```
GET /accounts/00987987973432
```

Response

```json
{
  "number": "00987987973432",
  "type": "savings",
  "balance": 234343.0
}
```

