FROM openjdk:8
EXPOSE 8082
ADD target/demo-0.0.1-SNAPSHOT.jar Sponsor.jar
ENTRYPOINT ["java", "-jar", "Sponsor.jar"]
