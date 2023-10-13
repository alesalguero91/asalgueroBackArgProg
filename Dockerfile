FROM amazoncorretto:8-alpine-jdk
MAINTAINER apBackend
COPY target/apBackend-0.0.1-SNAPSHOT.jar ap-backend.jar
ENTRYPOINT ["java","-jar","/ap-backend.jar"]
