# Use a base image with Java 17
FROM eclipse-temurin:17-jdk-alpine
# Set the working directory inside the container
WORKDIR /app
# Copy the JAR file into the container
COPY target/*.jar app.jar
# Expose the port your application listens on
EXPOSE 8080
# Start the application when the container starts
CMD ["java", "-jar", "app.jar"]