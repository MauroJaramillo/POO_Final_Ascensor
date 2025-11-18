# Sistema de Control de Ascensores – Proyecto Final POO
Este proyecto es una simulación sencilla del funcionamiento de un ascensor usando Programación Orientada a Objetos en Java. La idea fue aplicar conceptos como clases, objetos, encapsulación, métodos y relaciones entre clases.

## 1. ¿Cómo pensé la solución? (Descripción y análisis)
Para resolver el proyecto primero analicé qué partes reales tiene un ascensor y las convertí en clases.
Pensé que cada elemento debía tener su propio comportamiento, así el código era más ordenado y fácil de manejar.

### Las partes principales que identifiqué fueron:
* Ascensor: se mueve, recibe solicitudes y maneja su puerta.
* Puerta: abre, cierra y tiene un sensor de seguridad.
* Piso: representa cada nivel del edificio y tiene dos botones.
* Botón: simplemente se presiona y marca una solicitud.
* SistemaControl: conecta todo, recibe los botones y le ordena cosas al ascensor.

Luego pensé en cómo se comporta un ascensor real:
primero atiende las solicitudes en la dirección en la que va, y cuando llega al piso solicitado abre la puerta.
También decidí que el movimiento fuera de un piso por ejecución, para hacerlo fácil de probar en consola.


## 2. Diagrama de clases (draw.io)
El diagrama lo hice en draw.io con las siguientes clases:
* Ascensor
* Piso
* Boton
* Puerta
* SistemaControl

Lo puedes ver en el archivo:
Diagramas\POO_Final_Ascensor.drawio


## 3. Código documentado
Todo el código del proyecto está documentado con comentarios sencillos dentro de cada archivo .java.
Cada clase explica de forma básica para qué sirve y qué hace cada método.

Los archivos son:
* Boton.java
* Puerta.java
* Piso.java
* Ascensor.java
* SistemaControl.java
* Main.java


## 4. Pruebas realizadas (2 pruebas completas)
Aquí muestro dos pruebas completas del funcionamiento del ascensor.

### Prueba 1: Usuario llama desde piso 3 y luego elige piso 1

#### Pasos hechos:
* Piso 3 presiona botón de subir.
* El ascensor sube poco a poco hasta llegar.
* Dentro del ascensor se presiona el piso 1.
* El ascensor baja hasta el piso 1.

#### Salida obtenida:

<img width="339" height="403" alt="image" src="https://github.com/user-attachments/assets/5509badf-3744-44c3-882d-16f14d0d9958" />


### Prueba 2: Simulación con obstáculo en la puerta

#### Pasos hechos:
* Piso 4 presiona botón de bajar.
* El ascensor sube hasta llegar.
* El sensor de la puerta se activa para simular un objeto atascado.
* El ascensor intenta cerrar la puerta.

#### Salida obtenida:

<img width="515" height="404" alt="image" src="https://github.com/user-attachments/assets/6c09486a-d58d-43ea-b7fe-e5cf909d8323" />


## 5. Conclusión final
Este proyecto me ayudó a entender mejor cómo dividir un problema real en clases y cómo hacer que los objetos se comuniquen entre sí. También aprendí a documentar mejor mi código y a planear la lógica antes de escribirla. Aunque es una simulación sencilla, representa bien cómo funciona un ascensor real.
