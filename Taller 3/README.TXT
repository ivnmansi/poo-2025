Sistema de Control de Artefactos
================================
Iván Mansilla  
Ingeniería Civil en Computación e Informática  
Programación Orientada a Objeto  

Descripción
-----------
Este proyecto simula un sistema de control de artefactos eléctricos implementado en Java. El sistema consiste en un interruptor general (GeneralSwitch2) que controla varios artefactos (Artefacto), como lámparas, televisores y planchas, permitiendo encender o apagar todos los artefactos desde un punto central, mientras mantiene la funcionalidad de cada interruptor individual. Ademas el interruptor general permite monitorear el consumo total.

Características principales
---------------------------
- Artefactos individuales: Cada artefacto cuenta con su propio interruptor y consumo eléctrico  
- Control centralizado: El interruptor general puede apagar todos los artefactos o encender solo aquellos con interruptores individuales activados.   
- Monitoreo de consumo: El interruptor general registra el consumo total de todos los artefactos

Estructura del proyecto
------------------------
- GeneralSwitch2.java: Implementación del interruptor general (Singleton).  
- Artefacto.java: Clase base para todos los artefactos eléctricos (Padre de las clases Lampara, TV y Plancha).
- Lampara.java: Implementación de una lámpara con consumo de 60 watts (Hereda de Artefacto).  
- TV.java: Implementación de un televisor con consumo de 300 watts (Hereda de Artefacto). 
- Plancha.java: Implementación de una plancha con consumo de 1200 watts (Hereda de Artefacto).  

Diferencias con Taller 2
------------------------

La diferencia clave con el Taller 2 es la implementacion de un medidor del consumo electrico total, el cual puede ser observado a traves del inspector de BlueJ. Cada que un artefacto conectado al interruptor es efectivamente encendido es tomado en cuenta su consumo; por el contrario, si esta se apaga, su consumo es descontado.

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

1. Crear artefactos:  
   - Haga clic derecho en las clases `Lampara`, `TV` o `Plancha`.  
   - Seleccione el constructor correspondiente (`new Lampara()`, `new TV()`, `new Plancha()`) y escriba un nombre.  
   - Repita este proceso para crear varios artefactos.  

2. Conectar artefactos al interruptor general:  
   - Haga clic derecho en una instancia de artefacto y seleccione `conectarArtefacto()`

3. Controlar el sistema:  
   - Para encender o apagar el interruptor general: Haga clic derecho en la instancia de `GeneralSwitch2` (al que se puede acceder mediante el artefacto conectado) y seleccione `button()`.   
   - Para activar o desactivar el interruptor individual de un artefacto: Haga clic derecho en la instancia del artefacto y seleccione `button()`.
