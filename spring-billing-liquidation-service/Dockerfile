FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 9099
ARG JAR_FILE
ADD ${JAR_FILE} spring-billing-liquidation-service.jar
ENTRYPOINT ["java","-jar","/spring-billing-liquidation-service.jar"]