FROM openjdk:17-jdk-alpine
ADD target/service_consumer-0.0.1-SNAPSHOT.jar consumer.jar
ENTRYPOINT ["java","-jar","consumer.jar"]