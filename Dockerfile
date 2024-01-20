FROM openjdk:17-oracle
EXPOSE 8080
ADD target/spring-jenkins-devops.jar spring-jenkins-devops.jar
ENTRYPOINT ["java", "-jar", "/spring-jenkins-devops.jar"]
