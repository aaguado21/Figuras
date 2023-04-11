

package figuras;

import java.awt.Color;

/**
 * Clase cuadrado, se utiliza para crear un cuadrado
 * @version 
 * @author DAM
 * @since 11-04-2023
 */
public class Cuadrado extends Rectangulo{
	
/**
 * Constructor con 4 parametros
 * Crea el cuadrado con una longitud y color
 * @param x
 * @param y
 * @param color
 * @param lado
 */
public Cuadrado (double x, double y, Color color, double lado){
super (x, y, color, lado, lado);
}
}
