FROM openjdk:8-jdk-alpine
MAINTAINER Dandi_Agung_Setiawan <1941720009@student.polinema.ac.id>
RUN mkdir -p /java
WORKDIR /java

COPY Segitiga.java /java

# Compile file java
RUN javac Segitiga.java

# Running java
ENTRYPOINT java Segitiga
