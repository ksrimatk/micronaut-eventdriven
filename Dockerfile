FROM openjdk:14-alpine
COPY build/libs/eda-rest-*-all.jar eda-rest.jar
EXPOSE 8086
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "eda-rest.jar"]