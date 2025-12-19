# Usamos una imagen de Java muy ligera para la ejecución
FROM eclipse-temurin:17-jre-alpine

# Creamos un directorio para la app
WORKDIR /app

# COPIAMOS el archivo .jar generado por Jenkins en la etapa de Build
# Jenkins lo guarda en apiDemo/target/*.jar
COPY target/*.jar app.jar

# Exponemos el puerto de la aplicación
EXPOSE 8080

# Comando para arrancar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]