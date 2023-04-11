package figuras;

import java.awt.Color;

/**
 * Clase Rectangulo que sirve para poder crear Rectangulos
 * @author ALUMNO
 * @since 11-04-2023
 *
 */
public class Rectangulo extends Figura{
private double base;
private double altura;

/**
 * Constructor con cinco parámetros, nos creara los rectangulos con las caracteristicas dadas
 * @param x
 * @param y
 * @param color
 * @param base
 * @param altura
 */
public Rectangulo (double x, double y, Color color, double base, double altura){
super (x, y, color);
this.base = base;
this.altura = altura;
}

/**
 * @return the base
 */
public double getBase(){
return base;
}

/**
 * @return the altura
 */
public double getAltura(){
return altura;
}


/**
 * @param base the base to set
 */
public void setBase(double base){
this.base = base;
}

/**
 * @param altura the altura to set
 */
public void setAltura(double altura){
this.altura = altura;
}

/**
 * Método que nos servira para medir el perimetro de un rectangulo
 */
public double perimetro (){
   return 2 * base + 2 * altura;
}

/**
 * Método que nos servira para medir el area de la altura
 */
public double area (){ 
   return base * altura;
}
}
