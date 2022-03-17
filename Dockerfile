FROM openjdk:11-jdk-alpine:  
COPY target/expense-reimbursement-system-v2-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true","-jar","/app.jar"]
