package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
 * Clase Pentagon que representa la figura geometrica Pentagono.
 * @author Eduardo Ocampo & Juan Navarro
 * @version 1
 */
public class Pentagon implements Shape {
    public int getNumberOfEdges() {
        return 5;
    }
}