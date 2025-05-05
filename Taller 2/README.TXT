Sistema de Control de Artefactos
================================
Iván Mansilla  
Ingeniería Civil en Computación e Informática  
Programación Orientada a Objeto  

Descripción
-----------
Este proyecto simula un sistema de control de artefactos eléctricos implementado en Java. El sistema consiste en un interruptor general (GeneralSwitch2) que controla varios artefactos (Artefacto), como lámparas, televisores y planchas, permitiendo encender o apagar todos los artefactos desde un punto central, mientras mantiene la funcionalidad de cada interruptor individual.

Características principales
---------------------------
- Artefactos individuales: Cada artefacto cuenta con su propio interruptor y consumo eléctrico  
- Control centralizado: El interruptor general puede apagar todos los artefactos o encender solo aquellos con interruptores individuales activados.   

Estructura del proyecto
------------------------
- GeneralSwitch2.java: Implementación del interruptor general (Singleton).  
- Artefacto.java: Clase base para todos los artefactos eléctricos (Padre de las clases Lampara, TV y Plancha).
- Lampara.java: Implementación de una lámpara con consumo de 60 watts (Hereda de Artefacto).  
- TV.java: Implementación de un televisor con consumo de 300 watts (Hereda de Artefacto). 
- Plancha.java: Implementación de una plancha con consumo de 1200 watts (Hereda de Artefacto).  

Requisitos
----------
- BlueJ  
- Java  

Instrucciones de uso en BlueJ
-----------------------------
Para abrir y ejecutar el proyecto:  
1. Abra BlueJ.  
2. Seleccione 'Project → Open...' en el menú superior.  
3. Navegue hasta la carpeta del proyecto y selecciónala.  
4. El diagrama de clases aparecerá en la interfaz de BlueJ.  

Para crear instancias y probar el sistema:  
1. Crear el interruptor general:  
   - Haga clic derecho en la clase 'GeneralSwitch2'.  
   - Seleccione el método estático 'getInstance()'.  
   - Este proceso creará una instancia única del interruptor general.  

2. Crear artefactos:  
   - Haga clic derecho en las clases `Lampara`, `TV` o `Plancha`.  
   - Seleccione el constructor correspondiente (`new Lampara()`, `new TV()`, `new Plancha()`) y escriba un nombre.  
   - Repita este proceso para crear varios artefactos.  

3. Conectar artefactos al interruptor general:  
   - Haga clic derecho en una instancia de artefacto y selecciona `conectarArtefacto(GeneralSwitch2)`.  
   - Seleccione la instancia del interruptor general creada previamente.  

4. Controlar el sistema:  
   - Para encender o apagar el interruptor general: Haga clic derecho en la instancia de `GeneralSwitch2` y seleccione `button()`.  
   - Para activar o desactivar el interruptor individual de un artefacto: Haga clic derecho en la instancia del artefacto y selecciona `button()`.
