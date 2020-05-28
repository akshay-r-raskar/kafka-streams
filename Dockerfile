FROM openjdk:8-jdk-alpine

ADD target/app.jar /app/app.jar

USER nobody

CMD [ "java", "-jar", "-Dspring.profiles.active=sandbox", "/app/app.jar" ]