# Establece la imagen base del contenedor como OpenJDK 17 en Alpine Linux.
FROM openjdk:17-alpine
# Expone el puerto 8080 del contenedor para permitir la comunicación externa.
EXPOSE 8080
# Define un argumento para especificar la ubicación y nombre del archivo JAR.
ARG JAR_FILE=target/loginusuario-0.0.1-SNAPSHOT.jar
# Agrega el archivo JAR al contenedor y lo renombra como "app.jar".
ADD ${JAR_FILE} app.jar
# Configura el comando de entrada para ejecutar la aplicación Java dentro del contenedor.
ENTRYPOINT ["java","-jar","/app.jar"]
