# Led4Serial
## Versión 1.2
## Aplicación Java para controlar un dispositivo Arduino.
### Novedades:
### ----------
### Cambio de librerías de control del puerto serie: java-simple-serial-connector.
### Base de datos SQLite para almacenar mensajes con el conector SQLite JDBC Driver.
### Control de logs de ejecución mediante Apache Log4j.
### Fuente de iconos Font Awesome facilitados por jIconFont.
 
Mediante la selección de los parametros del puerto serie, en entornos
windows o linux -gracias a la librería jssc la aplicación es multiplataforma-, 
se realiza una conexión a un dispositivo Arduino, el cual ha sido
programado previamente, permitiendo encender o apagar cuatro leds conectados
a el, conmutando las salidas digitales de `LOW` a `HIGH`. 

En la pestaña de mensajes la palicación permite en envío de cualquier mensaje y
en funcion de la programación del dispositivo, devolver una respuesta a modo de
confirmación de la comunicación. Así mismo, es capaz de capturar cualquier mensaje
por el dispositivo y almacenarlo en la base de datos para futuras revisiones.


La aplicación muestra la confirmación de las acciones por parte de Arduino en los 
campos de texto para tal fin. Se puede establecer la comunicación con un puerto, 
cerrar la misma y abrir otra comunicación con otro puerto sin cerrar la aplicación. 

La programación para el dispositivo arduino se adjunta en el proyecto. 

La aplicación Java se ha desarrollado en un proyecto de NetBeans con Maven.

Para ejecutar la aplicación es necesario el paquete JSSC integrado en la aplicación:

> Java-simple-serial-connector provided as a courtesy of scream3r.
> Please see (https://code.google.com/archive/p/java-simple-serial-connector/) for more information.
> Please see (https://github.com/scream3r/java-simple-serial-connector) for more information.

Los iconos de encendido y apagado:

>[ON/OFF GREEN LIGHT CLIP ART] (http://www.clker.com/clipart-on-off-green-light.html)

Los iconos Font Awesome y librería java jIconFont:

> Font Awesome (https://fortawesome.github.io/Font-Awesome/)
> Librería java jIconFont (http://jiconfont.github.io/)

Control de Logs Apache Log4j:

> Log4j (https://logging.apache.org/)

SQLite Conector JDBC:
 
> SQLite JDBC Driver provided as a courtesy of Taro L. Saito (http://xerial.org/leo/).
> JDBC (https://bitbucket.org/xerial/sqlite-jdbc)
> JDBC (https://github.com/xerial/sqlite-jdbc)

Base de Datos SQLite:

> SQLite (https://sqlite.org/)

Led4Serial.