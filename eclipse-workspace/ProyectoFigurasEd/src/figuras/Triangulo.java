package figuras;

import java.awt.Color;

/**
 * Clase Triangulo que nos creara los triangulos 
 * @author ALUMNO
 * @since 11-04-2023
 *
 */
public class Triangulo extends Figura{
private double lado1;
private double lado2;
private double lado3;

/**
 * Constructor Triangulo con seis parámetros, nos creara los triangulos con las características dadas
 * @param x
 * @param y
 * @param color
 * @param lado1
 * @param lado2
 * @param lado3
 */
public Triangulo(double x, double y, Color color, double lado1, double lado2, double lado3){
super (x, y, color);
this.lado1 = lado1;
this.lado2 = lado2;
this.lado3 = lado3;
}

/**
 * @return the lado1
 */
public double getLado1(){
return lado1;
}
/**
 * @return the lado2
 */
public double getLado2(){
return lado2;
}

/**
 * @return the lado3
 */
public double getLado3(){
return lado3;
}

/**
 * @param lado1 the lado1 to set
 */
public void setLado1(double lado1){
this.lado1 = lado1;
}

/**
 * @param lado2 the lado2 to set
 */
public void setLado2(double lado2){
this.lado2 = lado2;
}


/**
 * @param lado3 the lado3 to set
 */
public void setLado3(double lado3){
this.lado3 = lado3;
}

/**
 * Metodo que calcula el perimetro de un triangulo
 */
public double perimetro (){
   return lado1 + lado2 + lado3;
}

/**
 * Metodo area que devolvera el area de un triangulo
 */
public double area (){ 
   double sp = perimetro() / 2;
   return Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3)); 
}
}
