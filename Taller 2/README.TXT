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

Diferencias con Taller 1
------------------------
El Taller 2 expande las capacidades del Taller 1 mediante:

1. Generalización y herencia: Reemplaza la clase específica Lamp2 por una clase base Artefacto, implementando un diseño orientado a objetos más robusto que permite la creación de diferentes tipos de dispositivos eléctricos.

2. Variedad de artefactos: Añade múltiples tipos de artefactos (TV, Plancha, Lámpara) con distintos consumos energéticos, en lugar de solo lámparas.

3. Control de consumo: Incorpora el concepto de consumo eléctrico para cada artefacto, permitiendo modelar dispositivos con diferentes potencias.

4. Conectividad mejorada: Implementa métodos específicos (conectarArtefacto y desconectarArtefacto) para conectar y desconectar dispositivos del sistema general, en lugar de hacerlo automáticamente en el constructor.

5. Seguimiento de dispositivos: El interruptor general ahora lleva un conteo de los artefactos conectados al sistema.

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
   - Haga clic derecho en una instancia de artefacto y selecciona `conectarArtefacto()`

3. Controlar el sistema:  
   - Para encender o apagar el interruptor general: Haga clic derecho en la instancia de `GeneralSwitch2` (al que se puede acceder mediante el artefacto conectado) y seleccione `button()`.   
   - Para activar o desactivar el interruptor individual de un artefacto: Haga clic derecho en la instancia del artefacto y seleccione `button()`.
