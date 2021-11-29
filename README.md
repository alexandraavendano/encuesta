# Proyecto encuesta basica - Back

Este proyecto expone dos servicios REST:

1. Añadir encuesta, en donde dado un nombre se guarda la información en una base de datos mysql, con un id autogenerado. Tenga en cuenta que los datos del estado civil y fecha de nacimiento NO estan en el modelo y deberan ser implementados por el desarrollador.

```
curl --location --request POST 'localhost:8080/encuesta/add' \
--header 'Authorization: Basic ZW5jdWVzdGFfYWRtaW46ZW5jdWVzdGFfYWRtaW5fMTIz' \
--header 'Content-Type: application/json' \
--data-raw '{
"nombre" : "Pedro"
}'
```

2. Obtener todas las encuestas, ejemplo de uso a continuación:
```
curl --location --request GET 'localhost:8080/encuesta/all' \
--header 'Authorization: Basic ZW5jdWVzdGFfYWRtaW46ZW5jdWVzdGFfYWRtaW5fMTIz'
```

## Instrucciones para el desarrollador
Para correr este proyecto se deben considerar las siguientes instrucciones
1. Usar el IDE de su preferencia, correr el programa usando el comando `mvn spring-boot:run` en la terminal. Lo anterior utiliza apache tomcat para correr el proyecto en el puerto 8080 por defecto.
2. La base de datos es una base de datos en memoria lo que siginifica que borrara los datos guardados, por cada run del back.

### Documentación de referencia

* [Correr Spring](https://docs.spring.io/spring-boot/docs/2.6.0/reference/htmlsingle/#getting-started.first-application.run)

