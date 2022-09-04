FROM openjdk:17-alpine

MAINTAINER JoeBlackZ

ADD target/*.jar /opt/app.jar

EXPOSE 80

ENTRYPOINT ["nohup", "java", "-jar", "/opt/app.jar", "&"]