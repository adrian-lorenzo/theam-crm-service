# theam-crm-service
## Rest API to manage customer data for a small shop.
Built with [Spring Boot](https://spring.io) and [Gradle](https://gradle.org).

### Want to run the service? 
Requirements:
- [Gradle 4+](https://gradle.org)
- [JDK 1.8](https://www.oracle.com/technetwork/java/javase/downloads/index.html)

Now, run the following command to **build and run**:
```
./gradlew build && java -jar build/libs/crm-service-0.1.0-SNAPSHOT.jar
```

If it is already built, you can use the **Spring Boot Gradle plugin** to run the app:
```
gradle bootRun
```

Service will be running at **localhost:8080**.

### How to use the service?
Check the [Wiki](https://github.com/AdrianLorenzoDev/theam-crm-service/wiki) if you want to learn how the service works!

Also,you can check the **API Docs** generated by [Swagger and Swagger UI](https://swagger.io):
```
Run and check!
http://localhost:8080/swagger-ui.html
```

You can build a [Docker](https://www.docker.com) image to run the service **(Dockerfile provided)**.

First, build the image:
```
docker build -t org/appname .
```

Next and finally, run it:
```
docker run -p port1:port2 org/appname
```

### Main objectives!
- [x] Customer domain definition, service, repository and rest controller
- [x] Image storage service and rest controller
- [x] Users domain definition, service, repository and rest controller
- [x] Authentication and authorization system
- [x] Service containerization
- [x] Testing, testing and... more testing

### Secondary objectives
- [ ] OAuth 2 authentication protocol integration
