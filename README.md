# Learning Java

## Initial

### Start By
[Spring Start](https://start.spring.io/)

#### Version
Spring Boot: 3.2.8
Java: 17

#### Dependencies
- MySQL Driver
- Spring Web

## Layers

controller --> repository --> service

controller --> service --> adapter/restClient --> external service

## CRUD

### DI
Field autowire, constructor injection, method injection 

### AOP
Annotation, log, authentication/authorization

### JPA
### Generate common functions automatically
- findByNameAndEmail();
- findById();
- etc...

### customized query
```java
@Query("SELECT u FROM User u WHERE u.status = 1")
Collection<User> findAllActiveUsers();
```

### Flyway
- Generate table scheme
- Keep data structure unify