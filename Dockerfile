#FROM openjdk:21
#WORKDIR /app
#COPY . /app
#RUN javac -d /app/out src/main/java/spe/Main.java
#CMD ["java", "-cp", "/app/out", "spe.Main"]

FROM maven:3.9.6-eclipse-temurin-21 AS builder

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn dependency:go-offline

RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

COPY --from=builder /app/target/*.jar myapp.jar

CMD ["java", "-jar", "myapp.jar"]



