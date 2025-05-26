# Etapa 1: build com Maven
FROM maven:3.9.6-eclipse-temurin-17 AS builder
WORKDIR /app
COPY pom.xml .
COPY fiap/src ./src
RUN mvn clean package -DskipTests

# Etapa 2: imagem final com JAR
FROM eclipse-temurin:17-jdk
WORKDIR /app
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]
