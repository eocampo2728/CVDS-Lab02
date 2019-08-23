package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
 * Clase Quadrilateral que representa la figura geometrica Cuadrilatero.
 * @author Eduardo Ocampo & Juan Navarro
 * @version 1
 */
public class Quadrilateral implements Shape {
    public int getNumberOfEdges() {
        return 4;
    }
}