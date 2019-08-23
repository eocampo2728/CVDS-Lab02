package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;

/**
 * Clase ShapeFactory que es la clase que representa el patron fabrica aplicado a las figuras geometricas.
 * @author Eduardo Ocampo & Juan Navarro
 * @version	1
 *
 */
public class ShapeFactory {
	/**
	 * Metodo que permite la creacion de una figura geometrica.
	 * @param type	Es el tipo de figura geometrica a crear.
	 * @return	Retorna la figura geometrica.
	 */
	public static Shape create(RegularShapeType type) {
		Shape figura = null;
		switch(type) {
		case Triangle:
			figura = new Triangle(); 
		case Quadrilateral:
			figura = new Quadrilateral();
		case Pentagon:
			figura = new Pentagon();
		case Hexagon:
			figura = new Hexagon();
		}
		return figura;
	}
}
