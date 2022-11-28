
## endspoint
//Save
POST /api/v3/blog/create HTTP/1.1
Host: localhost:3333
Content-Type: application/json
Content-Length: 103
{
"id": null,
"blogHeader":"header",
"blogContent":"icerik",
"createdDate": null
}
//List
GET /api/v3/blog/list HTTP/1.1
Host: localhost:3333

//Find
GET /api/v3/blog/find/1 HTTP/1.1
Host: localhost:3333

//Update
PUT /api/v3/blog/update/1 HTTP/1.1
Host: localhost:3333
Content-Type: application/json
Content-Length: 118
{
"id": null,
"blogHeader":"HeaderUpdated",
"blogContent":"ContentUpdated",
"createdDate": null
}

// Delete
DELETE /api/v3/blog/delete/1 HTTP/1.1
Host: localhost:3333

# 
* [GitHub](https://github.com/BerkinBilgc/MyBlogProject)
* 

## SpringMVC
```shell
Validation
Annotation
Dto
@Controller
@GetMapping
@PostMapping
```


### Requirements
Java 18
intellij idea Ultimate 
Visual Studio Code
Node js
Docker
Postman
---

---

## Tecnology

## FrontEnd
- Html5
- responsive design
- Js
- jquery
---

## BackEnd
* javase
* hibernate
* spring core
* spring mvc
* spring data
* spring rest
* spring security

---

## Libraries
Thymeleaf
Lombok
Validation

## Database
H2 Database
Postgresql

---
## Dependency
Spring Web
Spring Data JPA
Spring Rest
Spring Security

---
# Spring Tools
Spring Boot DevTools
Spring Configuration Processor
Spring Boot Actuator

---

## Docker Deployment
./mvnw clean package 
./mvnw clean package -DskipsTests



First Step
npx create-react-app frontend
cd frontend
npm start
code .

Second Step
NOT: node_modules siliyoruz bunu sonrasında 
npm i

Trhird Step
terminal: package.json seviyesinde olacak şekilde
npm install axios
npm install bootstrap --save
npm install node-sass --save


