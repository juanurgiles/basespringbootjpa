FROM openjdk:8
MAINTAINER dockeruc "docker@ucuenca.edu.ec"
# set default workdir
WORKDIR /usr/Microservicio

# Bundle app source and tests
COPY pom.xml /usr/Microservicio/
COPY src /usr/Microservicio/

# expose application
EXPOSE 8080

COPY target/jpa-hibernate-rest-spring-boot-0.0.1.jar /home/jpa-hibernate-rest-spring-boot-0.0.1.jar
CMD ["java","-jar","/home/jpa-hibernate-rest-spring-boot-0.0.1.jar"]


