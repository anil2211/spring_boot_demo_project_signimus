FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy jar file (update name if needed)
COPY target/demo-spring-boot-devOps-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your app runs on
EXPOSE 2020

# Run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
