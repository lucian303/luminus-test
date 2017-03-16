FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/testing.jar /testing/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/testing/app.jar"]
