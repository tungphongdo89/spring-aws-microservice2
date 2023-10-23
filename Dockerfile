# syntax=docker/dockerfile:1
FROM public.ecr.aws/docker/library/openjdk:17.0.2-jdk-oraclelinux8
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
COPY src ./src
CMD ["./mvnw", "spring-boot:run"]