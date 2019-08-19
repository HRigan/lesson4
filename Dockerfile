FROM openjdk:8
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=build/libs/lesson4.jar
ADD ${JAR_FILE} lesson4.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/lesson4.jar"]