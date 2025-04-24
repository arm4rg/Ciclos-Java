# Proyecto con Condicionales, Switch y Ciclos en Java
 Este proyecto en Java es una aplicación que permite al usuario interactuar con varios ejercicios de programación, utilizando estructuras condicionales `(if, else, switch)` y ciclos `(while, for)`. 

### Tabla de Contenidos
1. [Descripción](#descripción)
2. [Requisitos](#requisitos)
3. [Instalación](#instalación)
4. [Uso](#uso)
5. [Librerias utilizadas](#librerias_utilizadas)
6. [Detalles técnicos](#detalles_técnicos)
7. [Desarrollador](#desarrollador)
8. [Licencia](#licencia)

### 1. Descripción 
Este proyecto consiste en un conjunto de ejercicios realizados en Java que ayudan a comprender las estructuras condicionales y los ciclos. El programa presenta un menú interactivo que permite al usuario seleccionar entre varios ejercicios: 

1. **Condicionales** `if`, `else`:
    - Ejercicio 1: Verificar si un número ingresado es positivo, negativo o cero.
    - Ejercicio 2: Determinar si un año es bisiesto o no.

2. **Estructura** `switch`:
    - Ejercicio 1: Mostrar el nombre del día de la semana basado en un número (1 a 7).
    - Ejercicio 2: Mostrar un mensaje de bienvenida o la fecha actual.

3. **Ciclo** `while`:
    - Ejercicio 1: Sumar números positivos ingresados hasta que se ingrese un número negativo.
    - Ejercicio 2: Mostrar un mensaje repetidamente, permitiendo al usuario decidir si continuar.

4. **Ciclo** `for`:
    - Ejercicio 1: Imprimir los números del 1 al 10.
    - Ejercicio 2: Calcular la suma de los primeros N números naturales.

### 2. Requisitos
Antes de ejecutar el programa, asegurate de tener: 
- **Visual Studio Code** u otro **IDE** compatible con Java.
- **Extensión Java**` instalada en el **IDE**.
- **JDK** instalado en el sistema operativo.

### 3. Instalación
1. Clona este repositorio:
    ```bash
    git clone https://github.com/arm4rg/Ciclos-Java.git
    cd Ciclos-Java
    ```
2. Compila el archivo `App.java`:
    ```bash
    javac App.java
    ```
3. Ejecuta el programa:
    ```bash
    App.java
    ```


### 4. Uso
Al ejecutar el programa, se presentará un menú con varias opciones. Selecciona un número del menú para ejecutar los 2 ejercicios de la opción seleccionada:

    Opción 1: Condicionales if/else
    Opción 2: Estructura switch
    Opción 3: Ciclo while
    Opción 4: Ciclo for
    Opción 5: Salir del programa

Ejemplo de cómo interactuar con el programa:

- Se te pedirá que ingreses un número entre 1-5 para seleccionar opción.
- Si seleccionas una opción entre 1-4 se ejecutarán los ejercicios de la opción elegida.
- Se te solicitará el ingreso de datos por ejemplo un número entero para determinar si es positivo, negativo o cero.
- Luego, serás redirigido al menú principal y podrás seleccionar otros ejercicios de otra opción.
- Si seleccionas la opción 5, el programa se terminará ejecución y cerrará.

### 5. Librerías utilizadas
- `java.time.LocalDate `: Utilizada para obtener la fecha actual
- `java.util.scanner `: Utilizada para ingresar datos al programa usando el teclado.

### 6. Detalles técnicos
```java
private static Scanner sc = new Scanner(System.in); 
```
Es un objeto declarado de forma global que sirve para realizar ingreso de datos por teclado, cualquier método pueda hacer uso del mismo y este se debe cerrar unicamente al seleccionar `opción 5` del menú principal al terminar ejecución mendiante la línea de código: 

```java
 sc.close();
```
#### Ejemplo de funcionamiento de condicionales
```java
public static void Condicionales2(){
        int Año;                                                        
         Año = sc.nextInt();                                                 
          if ((Año%4==0) && (Año%100!=0) || (Año%400==0)) { 
            System.out.println("El año es bisiesto");
          }
          else {                                                
            System.out.println("El año no es bisiesto");
          }
    }
En el ejemplo podemos observar que la condición if debe cumplir las 2 primeras condiciones o unicamente la 3ra, la cual es el Año divisible exactamente entre 4 y no debe ser divisible exactamente entre 100, o si el Año es divisible exactamente entre 400. El simbolo % representa el residuo de la división la cual debe ser 0 o diferente de 0 dependiendo de la condición determinada.
```
### 7. Desarrollador
- **Luis Armando Reyes Argueta**
### 8. Licencia
- Uso exclusivo de aprendizaje de Ciclos, Estructuras y Condicionales en Java.