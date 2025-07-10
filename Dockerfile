# ✅ Start with a minimal Java runtime
FROM openjdk:17-jdk-slim

# 📁 Set the working directory in the container
WORKDIR /app

# 📦 Copy the JAR file from the build output
COPY target/review-service.jar app.jar

# 🚪 Expose the port your Spring Boot app runs on
EXPOSE 8082

# 🚀 Launch the application
ENTRYPOINT ["java", "-jar", "app.jar"]