/*Importación de librerías a utilizar */
import java.time.LocalDate; //Librería para obtener la fecha actual
import java.util.Scanner;   //Librería para poder realizar el ingreso de datos del teclado

/*La clase en la que se encuentra nuestros métodos y funciones*/
public class App {
    private static Scanner sc = new Scanner(System.in);      /*Nuestro método privado global estático para ingresar datos y ser utilizado 
                                                              por todos los métodos públicos*/
    public static void main(String[] args) throws Exception {   //Función principal 
        menu();   //Llamada al método menú 
    };
       
    public static void menu (){
        int Opcion=0;           //Variable para seleccionar una opción del menú
        /* Ciclo Hacer Mientras que nos permite ejecutar el menú hasta que presionemos una opción para culminar ejecución.*/
        do{
                System.out.println("**************************");
                System.out.println("*       Bienvenido       *");
                System.out.println("*1)Condicionales If/Else *");
                System.out.println("*2)Switch                *");
                System.out.println("*3)Ciclo While           *");
                System.out.println("*4)Ciclo For             *");
                System.out.println("*5)Salir                 *");
                System.out.print("Por favor seleccione una opción: "); 
                  Opcion= sc.nextInt();                                      //Ingreso de opción mediante un número entero
                    switch (Opcion) {                                        //Selector según opción ingresada por usuario   
                       case 1: Condicionales1();                             //En el caso 1 se envía a 2 metodos de condicionales
                               Condicionales2();                             //Uno después del otro   
                               break;                                        //Termina ejecución de caso y regresa a menú principal.
                       case 2: Switch1();
                               Switch2();
                               break;
                       case 3: CicloWhile1();
                               CicloWhile2();
                               break;
                       case 4: CicloFor1();
                               CicloFor2();
                               break;
                       case 5: System.out.println("Saliendo del programa...");          //Opción 5 culmina ejecución de programa.
                               sc.close();                                                //Cierra el scanner de ingreso de datos.
                               break;
                       default: System.out.println("Opción elegida no es correcta, ingrese una nuevamente."); //Mensaje por defecto
                               break;
                     }
        }while (Opcion !=5); //El ciclo se ejecutará mientras la opción ingresada por usuario no sea el número 5.
    }

    /*Primer método público para hacer uso de Condicionales If, Else, Else If */

    public static void Condicionales1(){                  //Método público sin retorno.
        int Numero=0;                                     //Variable de tipo entero que almacenará un número ingresado por el usuario.
             System.out.println("**Ejercicio No.1**");
             System.out.print("Ingrese un número entero: ");
             Numero = sc.nextInt();                                             //Ingreso de número entero.
                /*Si el número ingresado es menor que 0. */
                if (Numero<0){                                          
                   System.out.println("El número ingresado es NEGATIVO.");    //Mensaje de salida.
                }
                /*De lo contrario verifica si el número es igual a 0. */
                else if (Numero==0) {
                    System.out.println("El número ingresado es CERO.");
                }
                /*De lo contrario el número es mayor a 0. */
                else {
                System.out.println("El número ingresado es POSITIVO.");
                }
          
    }

    /*Segundo método de condicionales If, Else, Else If. */

    public static void Condicionales2(){
        int Año;                                                        //Variable de tipo entero para ingresar un año.
        System.out.println("**Ejercicio No.2**");
        System.out.println("Ingrese un Año ");
         Año = sc.nextInt();                                            //Ingreso del año.
         //Condicional compuesto que verifica si el año es divisible exactamente entre 4 y no lo es entre 100, o Si lo es entre 400         
          if ((Año%4==0) && (Año%100!=0) || (Año%400==0)) { 
            System.out.println("El año es bisiesto");
          }
          //De lo contrario el año no es bisiesto
          else {                                                
            System.out.println("El año no es bisiesto");
          }
    }

    /*Primer método público para el selector  */

    public static void Switch1(){
        int Dia=0;                                                      //Variable para ingreso de un número entero (entre 1 y 7)
        System.out.println("**Ejercicio No.1**");
        System.out.print("Ingrese un número del 1 al 7: ");
         Dia = sc.nextInt();                                            //Ingreso del día (número entero) usando el scanner global.
           switch (Dia) {                                               //Uso de la variable para seleccionar a que caso ingresar.
              case 1: System.out.println("1. Lunes");                 //Mensaje de salida con el día correspondiente.
                      break;                                            //Culminación de ejecución de caso y retorno a menú principal.
              case 2: System.out.println("2. Martes");
                      break;
              case 3: System.out.println("3. Miércoles");
                      break;
              case 4: System.out.println("4. Jueves");
                      break;
              case 5: System.out.println("5. Viernes");
                      break;
              case 6: System.out.println("6. Sábado");
                      break;
              case 7: System.out.println("7. Domingo");
                      break;
              default: System.out.println("El número ingresado no es válida.");        //Caso por defecto si se ingresa mal un valor.
                      break;
             }
  }

  /*Segundo método público para selector. */

  public static void Switch2 (){
        int Opc=0;                                   //Variable de tipo entero para seleccionar una opción de un menú
        LocalDate hoy = LocalDate.now();             //Variable que hace uso de un objeto mediante el uso de librería para obtener fecha
        System.out.println("**Ejercicio No.2**");
        System.out.println("       Menú");
        System.out.println("1)Mostrar Mensaje de Bienvenida.");
        System.out.println("2)Mostrar la fecha actual.");
        System.out.println("3)Salir.");
        System.out.print("Seleccione una opción: ");
        Opc= sc.nextInt();                                              //Ingreso de opción seleccionada por usuario.
        switch (Opc) {
          case 1: System.out.println("Bienvenido al programa...");
                  break;
          case 2: System.out.println("La fecha de actual es: " +hoy);   //Mensaje de salida de mensaje y agregada la fecha actual (uso de + variable).
                  break;
          case 3: System.out.println("Saliendo del programa....");
                  break;
          default: System.out.println("Opción seleccionada no es válida.");
                  break;
        }
     }

     /*Inicio del primer método público para el ciclo mientras */
  public static void CicloWhile1(){
        float  numero=0, suma=0;                                        //Variables de tipo decimal para ingresar números que serán sumados.

        System.out.println("        **Ejercicio No.1**");
        /*El ciclo se ejecutará mientras el número ingresado es mayor o igual a 0. */
        while (numero>=0) {
        System.out.print("Ingrese un número: ");
        numero = sc.nextFloat();                                         //Ingreso del número a sumar.
        //Si el número es menor a 0.
        if (numero<0) {
                System.out.println("El número ingresado es NEGATIVO, la suma se detuvo.");      //Mensaje de salida.
                numero=-1;                                               //La variable que controla el ciclo tiene un valor menor a 0 que frenará el mismo. 
        }
        //De lo contraio se realiza una suma del número ingresado.
        else {
        suma += numero;                                                 //La variable "suma" agrega el valor ingresado y lo almacena en si misma, suma = suma+número 
       }
       System.out.println("La suma de los números es: " +suma);}        //Mensaje de salida que lleva la suma (+) variable del resultado.
  }
   /*Segundo método público para el ciclo mientras*/
  public static void CicloWhile2(){
        int j=1, rep=0;                                                 //Uso de variables de tipo entero j para iniciar el ciclo y rep para llevar una cuenta de repeticiones
        System.out.println("         **Ejercicio No.2**");

        /*Mientra la variable de control j sea mayor a 0 se ejecutará el ciclo. */
       while (j>0) {
                System.out.println("Bienvenido al sistema.");
                rep++;                                                         //La variable repeticiones agrega 1 unidad a si misma cada vez que se ejecuta el ciclo.
                System.out.println("Total de veces ejecutado: " +rep);          //Mensaje de cuantas veces se muestra el mensaje de bienvenida.
                System.out.println("Desea seguir mostrando mensaje?"); 
                System.out.println("0) No");
                System.out.println("1) Sí");
                j = sc.nextInt();                                               //Ingreso de opción 0 para culminar ejecución y 1 para seguir haciendolo.
       }
  }
  /*Primer método de tipo público para el ciclo para */
  public static void CicloFor1(){
        System.out.println("**Ejercicio No.1**");
         for (int i=1 ; i<=10 ; i++ ){                                          /*El ciclo declara una variable i para iniciar la ejecución, un valor máximo alcanzable
                                                                                 por la variable y cada vez que se repite el valor de la variable aumenta en 1 unidad*/
            System.out.print("  "+i);                                           //Deja un espacio entre cada impresión de cada valor de la variable impreso.
         }
         System.out.println("\n");                                             //Muestra un salto de línea al finalizar ejecución del ciclo.
  }
  /*Segundo método publico para el ciclo para */
  public static void CicloFor2(){
        int numero, suma=0 ;                                                    //Variables de tipo entero para realizar una suma de los números enteros desde 1 hasta ese número ingresado
        System.out.println("   **Ejercicio No.2");
        System.out.print("Ingrese un número entero: ");
         numero = sc.nextInt();                                                 //Ingreso del número del cual queremos calcular la suma de sus anteriores e incluido el número.
        for (int i=0; i<=numero ; i++){                                         //Variable iniciada en 0 para iniciar ejecución, se ejecutará hasta llegar al valor ingresado
                                                                                //Cada repetición del ciclo aumenta el valor de la variable en 1 unidad i++=> i=i+1
           suma += i;                                                           //la variable "suma" agrega su valor anterior más el valor de la variable que lleva en el ciclo.
                                                                                //suma = suma + i (donde el valor de i aumenta 1 unidad cada vez que el ciclo se repite).
        }
        /*Impresión del número ingresado y la suma de los anteriores.*/
        System.out.println("La suma de los primero primeros " +numero +" números naturales es :" +suma); 
  }
} //Finalización de la clase donde nuestro programa se ejecuta.
