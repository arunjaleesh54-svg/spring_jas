Digital Library Portal

A backend-based Digital Library Portal developed using Java, Spring Boot, Spring Data JPA, MySQL, and Swagger UI.
This project performs CRUD operations for managing books in a digital library system.

Features

- Add new books
- View all books
- View book by ID
- Update book details
- Delete books
- REST API testing using Swagger UI
- Database connectivity with MySQL

Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Swagger UI

Project Structure

controller   -> Handles API requests
service      -> Business logic
repository   -> Database operations
entity       -> Database tables/entities
config       -> Swagger configuration
resources    -> application.properties

API Endpoints

GET    /Book
GET    /Book/{id}
POST   /Book
PUT    /Book/{id}
DELETE /Book/{id}

Database

- MySQL database used
- JPA used for ORM mapping
- Hibernate used internally by JPA

Swagger UI

Swagger UI is used to test REST APIs.

http://localhost:8080/swagger-ui/index.html

How to Run

1. Clone the repository
2. Configure MySQL in application.properties
3. Run the Spring Boot application
4. Open Swagger UI in browser

Learning Outcomes

- Developed REST APIs using Spring Boot
- Learned CRUD operations
- Understood JPA and Hibernate
- Connected Spring Boot with MySQL
- Used Swagger for API testing

