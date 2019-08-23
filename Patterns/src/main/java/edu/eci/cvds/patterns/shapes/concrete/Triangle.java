package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

/**
 * Clase Triangle que representa la figura geometrica Triangulo.
 * @author Eduardo Ocampo & Juan Navarro
 * @version 1
 */
public class Triangle implements Shape {
    public int getNumberOfEdges() {
        return 3;
    }
}