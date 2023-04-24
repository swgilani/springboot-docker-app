FROM openjdk:11
COPY target/springboot-docker-app-0.0.1-SNAPSHOT.jar service.jar
ENTRYPOINT ["java","-jar","service.jar"]
