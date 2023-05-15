FROM openjdk:17
EXPOSE 8081
ADD target/firstdemo.jar firstdemo.jar
ENTRYPOINT ["java","-jar","/firstdemo.jar"]