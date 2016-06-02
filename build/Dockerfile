FROM java:8
VOLUME /tmp
ADD target/proto-service-0.0.1.jar proto-service-0.0.1.jar
RUN bash -c 'touch /proto-service-0.0.1.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/proto-service-0.0.1.jar"]
expose 8080
