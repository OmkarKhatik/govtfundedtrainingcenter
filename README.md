# govtfundedtrainingcenter
Backend_Traini8_OmkarKhatik
Introduction
This project is an MVP (Minimum Viable Product) for a registry of Government-funded Training Centers. It is built using Spring Boot and provides two RESTful APIs:
1. POST API: to create and save a new training center.
2. GET API: to retrieve a list of all stored training centers.
The project follows best coding practices, including input validation using annotations, exception handling, and database persistence using an ORM.

Tech Stack
- Backend: Spring Boot (Java)
- Database: MySQL 
- ORM: Hibernate
- Build Tool: Maven
- API Testing: Postman



Setup Instructions
Prerequisites
- Install [Java 17+](https://www.oracle.com/java/technologies/javase-downloads.html)
- Install [Maven](https://maven.apache.org/download.cgi)
- Install [MySQL](https://dev.mysql.com/downloads/) and create a database
- Install [Postman](https://www.postman.com/) for testing Apis


Steps to Set Up and Run
1. Clone the repository
  git clone https://github.com/OmkarKhatik/govtfundedtrainingcenter.git
2. Configure the database
   - Open `application.properties` in `src/main/resources`
   - Update MySQL credentials:
spring.application.name=GovtFundedTrainingCenter
spring.jpa.hibernate.ddl.auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/trainingcenterapplication
spring.datasource.username=root
spring.datasource.password=2003
spring.datasource.driver-class-name = com.mysql.cj.jdbc.Driver
spring.jpa.show-sql = true


3. API Endpoints
   A. Create Training Center (POST)
    url : http://localhost:8080/trainingcenter
   Content-Type: application/json
     Body: {
        "centerName": "coding Academy",
        "centerCode": "jvc77310",
        "studentCapacity": 70,
        "createdOn": "",
        "contactEmail": "info@jv1qwesvcacademy.com",
        "contactPhone": "78765777987",
        "address": {
            "detailedAddress": "786 FCRoad",
            "city": "pune",
            "state": "Maharashtra",
            "pinCode": 411003
        },
       "courseOffered": ["java", "python", "DSA"]
    }

   B. Get Training Centers (GET)
     URL :  http://localhost:8080/trainingcenter

   4. Test the APIs using Postman.
  

 Contact
- Name: Omkar Khatik
- Email: omkarkhatik07@gmail.com

   











   
