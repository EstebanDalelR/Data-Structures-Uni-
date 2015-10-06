package taller.estructuras;

import java.util.Iterator;

/**
 *  Esta Interfaz de Cola de prioridad define las funciones básicas que debe cumplir esta
 *  estrucutra. Basada en la versión hecha por Robert Sedgewick y Kevin Wayne en el libro
 *  Algorithms, 4th Edition
 */

public interface IMaxPQ<Key>  extends Iterable<Key> {
    
    /**
     * Esta vacia la cola de prioridad?
     * @return true si esta vacia la cola de prioridad; falso en caso contrario
     */
    boolean isEmpty();

    /**
     * Devuelve el numero de llaves en la cola de prioridad.
     * @return El número de llaves en la cola de prioridad
     */
    int size();
    /**
     * Devuelve una de las llaves más grandes en la cola de prioridad.
     * @return una de las llaves más grandes de la cola de prioridad
     * @throws java.util.NoSuchElementException Si la cola de prioridad esta vacia
     */
    Key max();

    /**
     * Agrega una llave nueva a la cola de prioridad
     * @param x la nueva llave a agregar en la cola de prioridad
     */
    void insert(Key x);

    /**
     * Elimina y devuelve una de las llaves mas grandes en la cola de prioridad.
     * @return la llave mas grande de la cola de prioridad
     * @throws java.util.NoSuchElementException si la cola de prioridad esta vacia
     */
    Key delMax();

    /**
     * Devuelve un arreglo con indices del 1..N con los elementos de la cola de prioridad
     * @return un arreglo con los elementos de la cola de prioridad
     */
    Key[] getKeys();


   /***************************************************************************
    * Iterator
    ***************************************************************************/

    /**
     * Devuelve un iterador que itera sobre las llaves de la cola de prioridad en
     * orden descendiente.
     * El iterador no implementa remove() ya que es opcional
     * @return an iterator that iterates over the keys in descending order
     */
    Iterator<Key> iterator();

}
