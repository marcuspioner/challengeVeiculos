FROM azul/zulu-openjdk:17 as builder
WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTests


FROM azul/zulu-openjdk-debian:17-jre
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]
