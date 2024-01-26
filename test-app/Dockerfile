FROM maven:3.8.4-openjdk-17
WORKDIR /app
COPY target/SpringBootDockerPractice-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]

#COPY . .
#RUN mvn clean install
#CMD mvn spring-boot:run