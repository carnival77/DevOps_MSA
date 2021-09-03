FROM adoptopenjdk/openjdk11:x86_64-alpine-jdk-11.0.12_7-slim
EXPOSE 8090 
ARG JAR_FILE=target/hello-spring-boot-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar 
ENTRYPOINT ["java","-jar","/app.jar"] 