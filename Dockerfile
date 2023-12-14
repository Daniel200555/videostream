FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY target/video-0.0.1-SNAPSHOT.jar app.jar
#COPY out/artifacts/video_jar/video.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]