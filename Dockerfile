FROM openjdk:11
LABEL maintainer="Akash"
ADD target/revisionAPI-0.0.1-SNAPSHOT.jar springboot-docker.jar
ENTRYPOINT ["java","-jar","springboot-docker.jar"]