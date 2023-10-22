# syntax=docker/dockerfile:1

FROM openjdk:17-oraclelinux8

EXPOSE 8061

ADD target/spring-aws-microservice2.jar spring-aws-microservice2.jar

ENTRYPOINT ["java","-jar","/spring-aws-microservice2.jar"]