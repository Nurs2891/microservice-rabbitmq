FROM openjdk:17-jdk-alpine
ADD target/service_producer-0.0.1-SNAPSHOT.jar producer.jar
ENTRYPOINT ["java", "-jar", "producer.jar"]