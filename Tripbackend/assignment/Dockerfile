FROM openjdk:18

COPY target/assignment-0.0.1-SNAPSHOT.jar backend.jar

ENV DBPORT 3306

ENTRYPOINT ["java","-DdatabaseConnection=${DBPORT}" ,"-jar","/backend.jar"]
