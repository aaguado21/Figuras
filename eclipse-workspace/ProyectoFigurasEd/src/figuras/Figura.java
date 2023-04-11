package figuras;
import java.awt.Color;

/**
 * Clase Figura, se utiliza para crear una figura, ya sea un cuadrado, Rectangulo, Triángulo
 * @author ALUMNO
 * @version
 * @since 11-04-2023
 *
 */
public abstract class Figura{
private Punto centro;
private Color color;

/**
 * Constructor con 3 parametros 
 * Nos permite crear las figuras
 * @param x
 * @param y
 * @param color
 */
public Figura(double x, double y, Color color){
centro = new Punto (x, y);
this.color = color;
}

/**
 * @return the centro.getX()
 */
public double getXCentro(){
return centro.getX();
}

/**
 * @return the centro.getY()
 */
public double getYCentro(){
return centro.getY();
}

/**
 * @return the color
 */
public Color getColor(){
return color;
}

/**
 * @param x the centro.setX to set
 */
public void setXCentro(double x){
centro.setX (x);
}

/**
 * @param y the centro.setY (y) to set
 */
public void setYCentro(double y){
centro.setY (y);
}

/**
 * @param color the color to set
 */
public void setColor(Color color){
this.color = color;
}

//Metodos públicos
/**
 * Método abstracto que utilizará para medir el perímetro de la figura
 * @return
 */
public abstract double perimetro();  

/**
 * Método abstracto que se utilizará para medir el área de la figura
 * @return
 */
public abstract double area();  

/**
 * Metodo que se utiliza para comparar las áreas de 2 figuras
 * @param otraFigura
 * @return 1: si la primera figura tiene un area mayor que la figura pasada como parámetro
 * 		  -1: si la primera figura tiene un área menor que la es pasada como parámetro
 * 		   0: si las dos figuras tienen el mismo área
 */
public int esMayorQue (Figura otraFigura) {
	   if (this.area() > otraFigura.area())
		   return 1;
	   else
		   if (this.area() < otraFigura.area())
			   return -1;
		   else
			   return 0;
	}

}
