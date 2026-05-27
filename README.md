# Job Application System

A Spring Boot REST API project for managing job postings and student job applications.

## Features

- Add new jobs
- View all jobs
- Get job by ID
- Apply for a job
- View all applications
- Prevent duplicate applications
- Global exception handling
- MySQL database integration
- Spring Data JPA support

---

## Tech Stack

- Java 21
- Spring Boot 3.3.5
- Spring Data JPA
- MySQL
- Maven
- REST API
- Hibernate

---

## Project Structure

```text
JobApplicationSystem
│
├── controller
│   ├── JobController.java
│   └── ApplicationController.java
│
├── dto
│   └── ApplyRequest.java
│
├── entity
│   ├── Job.java
│   └── Application.java
│
├── repository
│   ├── JobRepository.java
│   └── ApplicationRepository.java
│
├── service
│   ├── JobService.java
│   └── ApplicationService.java
│
├── exception
│   ├── DuplicateApplicationException.java
│   └── GlobalExceptionHandler.java
│
└── resources
    └── application.properties
```

---

## Database Setup

Create database:

```sql
CREATE DATABASE jobdb;
```

Update:

`src/main/resources/application.properties`

```properties
server.port=4000

spring.datasource.url=jdbc:mysql://localhost:3306/jobdb
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

## API Endpoints

### Add Job

**POST**

```http
http://localhost:4000/jobs
```

Request Body:

```json
{
    "id":1,
    "companyName":"Google",
    "role":"SDE Intern",
    "packageAmount":25,
    "location":"Bangalore"
}
```

---

### Get All Jobs

**GET**

```http
http://localhost:4000/jobs
```

---

### Get Job By ID

**GET**

```http
http://localhost:4000/jobs/1
```

---

### Apply for Job

**POST**

```http
http://localhost:4000/applications/apply
```

Request:

```json
{
    "studentId":101,
    "jobId":1
}
```

---

### Get Applications

**GET**

```http
http://localhost:4000/applications
```

---

## Example Workflow

1. Add a job

```json
{
"id":1,
"companyName":"Google",
"role":"SDE Intern",
"packageAmount":25,
"location":"Bangalore"
}
```

2. Apply

```json
{
"studentId":101,
"jobId":1
}
```

3. View applications

```http
GET /applications
```

4. Duplicate application automatically throws exception.

---

## Run Project

Clone repository:

```bash
git clone https://github.com/AryanP-10/job-application-system.git
```

Move into project:

```bash
cd JobApplicationSystem
```

Install dependencies:

```bash
mvn clean install
```

Run:

```bash
mvn spring-boot:run
```

Server:

```text
http://localhost:4000
```

---

## Future Improvements

- Student entity integration
- Authentication
- Application status update
- Search jobs by company
- Pagination
- JWT Security
- Admin dashboard

---

## Author

Aryan P
