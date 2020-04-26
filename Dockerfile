FROM openjdk:8u131-jre-alpine
EXPOSE 3002
WORKDIR mkdir /app
COPY ./target/*.jar /app/app.jar
CMD ["java", "-jar", "/app/app.jar"]