package figuras;

import java.util.Scanner;
import java.awt.Color;
/**
 * Clase Prueba Figura que utilizaremos para crear y probar las figuras
 * @author ALUMNO
 * @since 11-04-2023
 *
 */
public class PruebaFigura {

public static void main(String[] args) {
/**
 * Atributo opcion que servira para elegir la figura y las coordenadas
 */
int opcion;
Scanner teclado = new Scanner (System.in);
do { 
   opcion = mostrarMenu();
   if (opcion != 4){
      System.out.print ("Introduzca la coordenada x del centro: ");
      double x = teclado.nextDouble();
      System.out.print ("Introduzca la coordenada y del centro: ");
      double y = teclado.nextDouble();
   switch (opcion)
	   {  case 1:
	         System.out.print ("Introduzca el lado 1 del tri�ngulo: ");
        	 double lado1 = teclado.nextDouble();
	         System.out.print ("Introduzca el lado 2 del tri�ngulo: ");
        	 double lado2 = teclado.nextDouble();
        	 System.out.print ("Introduzca el lado 3 del tri�ngulo: ");
        	 double lado3 = teclado.nextDouble();
        	 Triangulo t = new Triangulo(x, y, Color.red, lado1, lado2, lado3);
        	 System.out.println ("El per�metro es " + t.perimetro());
        	 System.out.println ("El �rea es " + t.area());
        	 break;
         case 2:
	         System.out.print ("Introduzca la base del rect�ngulo: ");
        	 double base = teclado.nextDouble();
	         System.out.print ("Introduzca la altura del rect�ngulo: ");
        	 double altura = teclado.nextDouble();
        	 Rectangulo r = new Rectangulo(x, y, Color.red, base, altura);
        	 System.out.println ("El per�metro es " + r.perimetro());
        	 System.out.println ("El �rea es " + r.area());
        	 break;
         case 3:
	         System.out.print ("Introduzca el lado del cuadrado: ");
        	 double lado = teclado.nextDouble();
	         Cuadrado c = new Cuadrado(x, y, Color.red, lado);
	         System.out.println ("El per�metro es " + c.perimetro());
	         System.out.println ("El �rea es " + c.area());
	         break;
        }
   }
}while (opcion != 4); 
teclado.close();
}
/**
 * Metodo estatico que servira para mostrar un menu con los datos de las figuras
 * @return
 */
public static int mostrarMenu(){
int opcionVariable;
System.out.println ("1) Tri�ngulo");
System.out.println ("2) Rect�ngulo");
System.out.println ("3) Cuadrado");
System.out.println ("4) Salir");
Scanner teclado = new Scanner (System.in);
do {
    System.out.print ("Introduzca una opci�n (1-4): ");
    opcionVariable = teclado.nextInt();
    if (opcionVariable < 1 || opcionVariable > 4)
	   System.out.println ("Debe introducir un n�mero entre 1 y 4");
   } while (opcionVariable < 1 || opcionVariable > 4);
return opcionVariable;
}
}
