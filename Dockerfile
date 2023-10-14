
FROM amazoncorretto:11-alpine-jdk
MAINTAINER apBackend 
COPY target/apBackend-0.0.1-SNAPSHOT.jar  ap-back.jar
ENTRYPOINT ["java","-jar","/ap-back.jar"]
