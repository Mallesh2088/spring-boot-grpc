FROM openjdk:8-jdk-alpine
MAINTAINER mallesh2088@gmail.com
COPY target/demo-scraper-*.jar demo-scraper.jar
ENTRYPOINT ["java","-jar","/demo-scraper.jar"]