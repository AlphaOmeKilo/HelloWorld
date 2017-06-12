FROM isuper/java-oracle:jdk_latest

USER jenkins

CMD ["java", "-DSERVER_PORT=8030", "-jar", "./HellowWorldServiceWeb/target/hello-world-service-web-0.0.1-SNAPSHOT.jar"]
