Sistema de Iluminación
======================
Iván Mansilla
Ingeniería Civil en Computación e Informática
Programación Orientada a Objeto

Descripción
-----------
Este proyecto simula un sistema de iluminación inteligente implementado en Java. El sistema consiste en un interruptor general (GeneralSwitch2) que controla varias lámparas (Lamp2), permitiendo encender o apagar todas las luces desde un punto central, mientras mantiene la funcionalidad de cada interruptor individual.

Características principales
--------------------------
- Interruptor general: Implementado usando el patrón de diseño Singleton
- Lámparas individuales: Cada lámpara cuenta con su propio interruptor
- Control centralizado: El interruptor general puede apagar todas las lámparas o encender solo aquellas con interruptores activados

Estructura del proyecto
----------------------
- GeneralSwitch2.java: Implementación del interruptor general (Singleton)
- Lamp2.java: Implementación de las lámparas individuales

Requisitos
---------
- BlueJ
- Java

Instrucciones de uso en BlueJ
----------------------------
Para abrir y ejecutar el proyecto:
1. Abre BlueJ
2. Selecciona 'Project → Open...' en el menú superior
3. Navega hasta la carpeta del proyecto y selecciónala
4. El diagrama de clases aparecerá en la interfaz de BlueJ

Para crear instancias y probar el sistema:
1. Crear el interruptor general:
   - Haz clic derecho en la clase GeneralSwitch2
   - Selecciona el método estático getInstance()
   - Presionar el botón 'obtener' y escribir un nombre
   - Este proceso creará una instancia única del interruptor general

2. Crear lámparas:
   - Haz clic derecho en la clase Lamp2
   - Selecciona 'new Lamp2(...)' y escribe un nombre
   - Repite este proceso para crear varias lámparas

3. Controlar el sistema:
   - Para encender el interruptor general: Haz clic derecho en la instancia de GeneralSwitch2 y selecciona turnOn()
   - Para apagar el interruptor general: Selecciona turnOff()
   - Para activar el interruptor individual de una lámpara: Haz clic derecho en la instancia de la lámpara y selecciona turnOn()
   - Para desactivar el interruptor individual: Selecciona turnOff()
