# Led4Serial
## Versión 1.4.0.0
## Aplicación Java para controlar un dispositivo Arduino.

### Novedades versión 1.4.0.0:
Corregido el bug al crear la base de datos y el log.
En desarrollo instalador para windows.

### Implementaciones.
Librerías de control del puerto serie: java-simple-serial-connector.
Base de datos SQLite con el conector SQLite JDBC Driver.
Control de logs de ejecución mediante Apache Log4j.
Fuente de iconos Font Awesome facilitados por jIconFont.
 
### Descripción.
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

La aplicación Java se ha desarrollado en un proyecto de **NetBeans** con **Maven**.

### Dependencias.
Para ejecutar la aplicación es necesario el paquete JSSC integrado en la aplicación:

> Java-simple-serial-connector provided as a courtesy of scream3r.
> Please see (https://code.google.com/archive/p/java-simple-serial-connector/) for more information.
> Please see (https://github.com/scream3r/java-simple-serial-connector) for more information.

Los iconos de encendido y apagado:

>[ON/OFF GREEN LIGHT CLIP ART] (http://www.clker.com/clipart-on-off-green-light.html)

Los iconos Font Awesome y librería java jIconFont:

> [Font Awesome] (https://fortawesome.github.io/Font-Awesome/)
> [jIconFont] (http://jiconfont.github.io/)

Control de Logs Apache Log4j:

> [Log4j] (https://logging.apache.org/)

SQLite Conector JDBC:
 
> SQLite JDBC Driver provided as a courtesy of [Taro L. Saito] (http://xerial.org/leo/)
> [JDBC] (https://bitbucket.org/xerial/sqlite-jdbc)
> [JDBC GitHub] (https://github.com/xerial/sqlite-jdbc)

Base de Datos SQLite:

> [SQLite] (https://sqlite.org/)

### Capturas.

Pestaña primera:

![Configuración del Puerto](https://dl.dropboxusercontent.com/u/3193442/Proyectos/led4serial1.png)

Pestaña segunda:

![Control de Leds](https://dl.dropboxusercontent.com/u/3193442/Proyectos/led4serial2.png)

Pestaña tercera:

![Control de Mensajes](https://dl.dropboxusercontent.com/u/3193442/Proyectos/led4serial3.png)

### Video.

[Arduino Mega 2560 con módulo RF APC220 y App Java Led4Serial.] (https://www.youtube.com/watch?v=a8hEHYhXpCc)

### Licencia.

**GNU GENERAL PUBLIC LICENSE** Version 3, 29 June 2007. Ver el archivo LICENSE.

Led4Serial.