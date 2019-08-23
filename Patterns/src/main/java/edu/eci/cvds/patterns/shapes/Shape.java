package edu.eci.cvds.patterns.shapes;

/**
 * Interface Shape que representa figuras geometricas.
 * @author Eduardo Ocampo & Juan Navarro
 * @version 1
 *
 */
public interface Shape {
	/**
	 * Metodo que permite consultar la cantidad de lados de la figura.
	 * @return	Retorna la cantidad de lados de la figura
	 */
    public int getNumberOfEdges();
}