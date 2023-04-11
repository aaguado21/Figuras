package figuras;

/**
 * Clase Punto, se usa para crear un Punto
 * @author ALUMNO
 *
 */
public class Punto {
private double x;
private double y;

/**
 * Construcotor de un punto si parametros
 */
public Punto(){
x = 0;
y= 0;
}

/**
 * Constuctor con 2 parametros para poder crer un punto en base a esas coordenadas
 * @param x
 * @param y
 */
public Punto(double x, double y){
this.x = x;
this.y = y;
}

/**
 * Construcotor con 1 parametro 
 * @param p
 */
public Punto(Punto p){
x = p.x;
y = p.y;
}

/**
 * @return the x
 */
public double getX(){
return x;
}

/**
 * @return the y
 */
public double getY(){
return y;
}

/**
 * @param x the x to set
 */
public void setX(double x){
this.x = x;
}


/**
 * @param y the y to set
 */
public void setY(double y){
this.y = y;
}

/**
 * Método que mide la distancia entre 2 puntos
 * @param p
 * @return
 */
public double distancia(Punto p){
return Math.sqrt (Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
}

/**
 * Método que nos indica si dos puntos son simétricos
 * @return
 */
public Punto simetrico(){
Punto nuevoP = new Punto (this.x * -1, this.y);	
return nuevoP ;
}

/**
 * Método que nos compara dos puntos
 * @param p
 * @return true: si los dos puntos son iguales
 * 		   false: si los dos puntos son distintos
 */
public boolean compara(Punto p){
if (p.x == x && p.y == y)
   return true;
else
   return false;
}

/**
 * Metodo toString que nos devuelve los datos del punto
 */
public String toString() {
	return "(" + getX() + "," + getY() + ")";
}
}
