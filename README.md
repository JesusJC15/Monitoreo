# PARCIAL PRIMER CORTE - SOLID, PATRONES, TDD, SPRING
## Jesús Alberto Jauregui Conde

### SpringBoot
Se uso Spring Initializr para la inicialización del proyecto.
https://start.spring.io/

![](/src/main/resources/images/1.png)

### Maven
Se comprueba con comandos mvn install y mvn package que el proyecto inicialmente funciona correctamente en maven.
![](/src/main/resources/images/2.png)
![](/src/main/resources/images/3.png)

### Jacoco y Junit
Se agregaron las dependencias para pruebas y cubrimiento con jacoco y junit
![](/src/main/resources/images/4.png)
Cubrimiento inicial del proyecto en jacoco
![](/src/main/resources/images/5.png)

### Diseño
- Como patrón de diseño se usó el patrón observador esto con el fin de tener "a alguien" que este pendiente de los cambios de estado en un producto y así poder comunicarle a los agentes según sea necesario, en este caso "InventoryObserver" y los agentes observadores "LogAgent" y "WarningAgent"

- Se tiene una clase "Product" la cuál tiene los atributos y metodos de un producto.

- Clase "Inventary" la cual hace de un inventario de productos donde se agregan, eliminan y actualizan productos.

- Una clase llamada "Monitoring" la cual inplementa el inventario.

### TDD
- Se escribieron las siguientes pruebas de unidad.
![](/src/main/resources/images/6.png)
![](/src/main/resources/images/7.png)

Se escribio codigo necesario para pasar estas pruebas de unidad.
- Clase Product
![](/src/main/resources/images/8.png)

- Clase InventoryObserver
![](/src/main/resources/images/9.png)

- Clase LogAgent
![](/src/main/resources/images/10.png)

- Clase WarningAgent
![](/src/main/resources/images/11.png)

- Clase Inventory
![](/src/main/resources/images/12.png)

- Clase Monitoring
![](/src/main/resources/images/13.png)

Generación de las pruebas despues de la implementacion del codigo
![](/src/main/resources/images/14.png)

### Funcionamiento del proyecto
- Siguiendo las pruebas de unidad.
![](/src/main/resources/images/6.png)
![](/src/main/resources/images/7.png)

- Se presentan los sigueintes mensajes.
![](/src/main/resources/images/15.png)