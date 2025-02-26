FROM openjdk:21

WORKDIR /app

COPY . /app

RUN javac -d /app/out src/main/java/spe/Main.java

CMD ["java", "-cp", "/app/out", "spe.Main"]

#docker exec -it java1 java -cp /app/out spe.Main
