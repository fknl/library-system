FROM openjdk:8-jdk

EXPOSE 8761

VOLUME /tmp
ADD maven/library-system-0.0.1-SNAPSHOT.jar library-system-0.0.1-SNAPSHOT.jar
RUN sh -c 'touch /library-system-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/library-system-0.0.1-SNAPSHOT.jar"]
