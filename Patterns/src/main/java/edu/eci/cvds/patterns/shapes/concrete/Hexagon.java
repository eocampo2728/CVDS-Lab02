package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
 * Clase Hexagon que representa la figura geometrica hexagono.
 * @author Eduardo Ocampo & Juan Navarro
 * @version 1
 */
public class Hexagon implements Shape {
    public int getNumberOfEdges() {
        return 6;
    }
}