FROM openjdk:8-jdk

WORKDIR /app
COPY . .
RUN chmod +x /app/gradlew
RUN apk update && apk add findutils
RUN ./gradlew build
ARG JAR_FILE_PATH=build/libs/*.jar
EXPOSE 8080
ADD ${JAR_FILE_PATH} docker-springboot.jar
