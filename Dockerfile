FROM openjdk:17
EXPOSE 8080
ADD target/AWSElasticBeanstalkApp-0.0.1-SNAPSHOT.jar AWSElasticBeanstalkApp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "AWSElasticBeanstalkApp-0.0.1-SNAPSHOT.jar"]
