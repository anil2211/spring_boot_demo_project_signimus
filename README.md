# 🚀 Demo Spring Boot DevOps Project

This is a **Spring Boot + MySQL** demo project containerized with **Docker** and orchestrated using **Docker Compose**.  
It demonstrates REST APIs for basic user management.

---

## 📂 Project Structure

demo-spring-boot-devOps/
│── .mvn/ # Maven wrapper files
│── src/
│ ├── main/
│ │ ├── java/com/example/demo_spring_boot_devOps/
│ │ │ ├── Controller/DevOpsController.java
│ │ │ ├── Entity/User.java
│ │ │ ├── Repository/UserRepository.java
│ │ │ ├── Service/UserService.java
│ │ │ └── DemoSpringBootDevOpsApplication.java
│ │ └── resources/application.properties
│── Dockerfile
│── docker-compose.yml
│── pom.xml
│── mvnw / mvnw.cmd
│── README.md


---

## 🛠️ Tech Stack

- **Backend**: Java 23, Spring Boot
- **Database**: MySQL 8
- **Build Tool**: Maven (Maven Wrapper included)
- **Containerization**: Docker, Docker Compose
- **ORM**: Spring Data JPA + Hibernate

---

## ⚙️ Setup & Run

### 🔹 1. Build & Run Locally (without Docker)

```bash
# Clean & build the project
./mvnw clean package

# Run the Spring Boot app
java -jar target/demo-spring-boot-devOps-0.0.1-SNAPSHOT.jar

App runs at 👉 http://localhost:2020/get-data


🔹 2. Run with Docker (App only)
# Build Docker image
docker build -t springboot-app .

# Run container
docker run -p 2020:8989 springboot-app

App available at 👉 http://localhost:2020/get-data

🔹 3. Run with Docker Compose (App + MySQL)
docker-compose up --build

This will:

Start MySQL container on port 3307

Start Spring Boot app on port 2020

Link both containers automatically

Stop all containers:
docker-compose down
🔗 API Endpoints
Method	Endpoint	Description
GET	/get-data	Returns a greeting message
POST	/save-user	Saves a new user in DB