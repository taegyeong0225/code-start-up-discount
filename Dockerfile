FROM openjdk:19-jdk
WORKDIR /app
COPY . .
RUN chmod +x /app/gradlew
RUN ./gradlew build --stacktrace
ARG JAR_FILE_PATH=build/libs/*.jar
ADD ${JAR_FILE_PATH} docker-springboot.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/docker-springboot.jar"]
