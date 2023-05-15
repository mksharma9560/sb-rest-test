FROM openjdk:17
EXPOSE 9999
ADD target/sb-rest-test-docker.jar sb-rest-test-docker.jar
ENTRYPOINT ["java","-jar","/sb-rest-test-docker.jar"]
