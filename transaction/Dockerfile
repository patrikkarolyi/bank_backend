# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the application JAR (assuming it's in the target directory after building)
COPY build/libs/transaction-0.0.1.jar /app/app.jar

# Expose the port the app runs on
EXPOSE 8081

# Define the command to run the application
CMD ["java", "-jar", "app.jar"]