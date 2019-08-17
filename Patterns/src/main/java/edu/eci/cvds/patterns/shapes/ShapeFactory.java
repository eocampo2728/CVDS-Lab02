package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory {
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
