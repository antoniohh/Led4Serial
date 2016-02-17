# Led4Serial
## Aplicación Java para controlar un dispositivo Arduino.
Mediante la selección de los parametros del puerto serie, en entornos
windows, se realiza una conexión a un dispositivo Arduino, el cual ha sido
programado previamente, permitiendo encender o apagar cuatro leds conectados
a el, conmutando las salidas digitales de `LOW` a `HIGH`. La programación para
el dispositivo se adjunta en el proyecto. LA aplicación muestra la confirmación
de las acciones por parte de Arduino en los campos de texto para tal fin. Se
puede establecer la comunicación con un puerto, cerrar la misma y abrir otra
comunicación con otro puerto sin cerrar la aplicación. Al salir se cierra el
puerto y la aplicación.

La aplicación Java se ha desarrollado en un proyecto de NetBeans.

Para ejecutar la aplicación es necesario el paquete RXTX:

> RXTX binary builds provided as a courtesy of Mfizz Inc. (http://mfizz.com/).
> Please see (http://mfizz.com/oss/rxtx-for-java) for more information.

Los iconos de encendido y apagado:

>[ON/OFF GREEN LIGHT CLIP ART] (http://www.clker.com/clipart-on-off-green-light.html)

Led4Serial.
