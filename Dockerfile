# syntax=docker/dockerfile:1

#Which "official Java image" ?
FROM openjdk:17-oraclelinux8
#FROM --platform=linux/amd64  alpine:3.10

#working directory
WORKDIR /app

#copy from your Host(PC, laptop) to container
COPY .mvn/ .mvn
COPY mvnw pom.xml ./

#Run this inside the image
RUN ./mvnw dependency:go-offline

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]


## syntax=docker/dockerfile:1
#
#FROM openjdk:17-oraclelinux8
#
#EXPOSE 8061
#
#ADD target/spring-aws-microservice2.jar spring-aws-microservice2.jar
#
#ENTRYPOINT ["java","-jar","/spring-aws-microservice2.jar"]