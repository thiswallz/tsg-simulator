FROM openjdk:17
EXPOSE 8080
ARG JAR_FILE=tsg-backend/target/tsg-backend-*-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
