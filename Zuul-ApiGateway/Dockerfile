FROM adoptopenjdk/openjdk11-openj9:x86_64-alpine-jre-11.0.14.1_1_openj9-0.30.1
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8079
ENTRYPOINT ["java","-jar","/app.jar"]