package taller.estructuras;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *  La clase <tt>MaxHeapPQ</tt> representa una cola de prioridad implemntada mediante un Heap.
 *  <p>
 *  Basada en la versión de MaxPQ hecha por Robert Sedgewick y Kevin Wayne en el libro
 *  Algorithms, 4th Edition
 *  Para información adicional, dirigase a Section 2.4 de
 *  <i>Algorithms, 4th Edition</i> por Robert Sedgewick y Kevin Wayne.
 *
 */

public class MaxHeapPQ<Key> implements IMaxPQ<Key>  {

    /**
     * Guarda en el arreglo todas las llaves que estan en la cola de prioridad en los indices del 1 al N
     */
    private Key[] pq;

    /**
     * Numero de items en la cola de prioridad
     */
    private int N;

    /**
     * Comparador opcional
     */
    private Comparator<Key> comparator;

    /**
     * Inicializa una cola de prioridad vacia con la capacidad inicial dada
     * @param initCapacity La capacidad inicial de la cola de prioridad.
     */
    public MaxHeapPQ(int initCapacity) {

        pq = (Key[]) new Object[initCapacity + 1];
        N = 0;

    }

    /**
     * Inicializa una cola de prioridad vacia.
     */
    public MaxHeapPQ() {

        this(1);

    }

    /**
     * Inicializa una cola de prioridad vacia con la capacidad inicial dada,
     * usando el comparador dado.
     * @param initCapacity la capacidad inicial de la cola de prioridad
     * @param comparator el orden en el que se comparan las llaves
     */
    public MaxHeapPQ(int initCapacity, Comparator<Key> comparator) {
        this.comparator = comparator;
        pq = (Key[]) new Object[initCapacity + 1];
        N = 0;
    }

    /**
     * Inicializa una cola de prioridad vacia con el comparador dado
     * @param comparator la capacidad inicial de la cola de prioridad
     */
    public MaxHeapPQ(Comparator<Key> comparator) {

        this(1, comparator);
    }

    /**
     * Initializes a priority queue from the array of keys.
     * Takes time proportional to the number of keys, using sink-based heap construction.
     * @param keys the array of keys
     */
    public MaxHeapPQ(Key[] keys) {
        N = keys.length;
        pq = (Key[]) new Object[keys.length + 1]; 
        for (int i = 0; i < N; i++)
            pq[i+1] = keys[i];
        for (int k = N/2; k >= 1; k--)
            sink(k);
        assert isMaxHeap();
    }

    public boolean isEmpty() {

        return N == 0;

    }

    public int size() {

        return N;

    }

    public Key max() {
        return pq[1];//TODO Completar segun la documentacion
    }

    /**
     * Funcion de ayuda que permite cambiar la capacidad actual de la cola de prioridad por una mas grande
     * @param capacity la nueva capacidad. capacity > N
     */
    private void resize(int capacity) {

      if (capacity > N)
      {
        Key[] temp = (Key[]) new Object[capacity];
        for (int i = 1; i <= N; i++) {
            temp[i] = pq[i];
      }
      pq=temp;
        // Completar segun la documentacion

    }

    public void insert(Key x) {
        if (N >= pq.length - 1) 
            {
                resize(2 * pq.length);
            }
        pq[++N] = x;
        swim(N);
        // Completar segun la documentacion
    }

    public Key delMax() {

        Key max = pq[1];
        exch(1, N--);
        sink(1);
        pq[N+1] = null;     
        if ((N > 0) && (N == (pq.length - 1) / 4))
        {
          resize(pq.length / 2);  
        } 
        return max;
        // Completar segun la documenatcion

    }

    public Key[] getKeys() {

        return pq;

    }


   /***************************************************************************
    * Funciones auxiliares para restaurar la condicion de Heap.
    ***************************************************************************/

    private void swim(int k) {
        while (k > 1 && less(k/2, k)) 
        {
            exch(k, k/2);
            k = k/2;
        }
        // Completar segun lo visto en el curso y las explicaciones

    }

    private void sink(int k) {

        while (2*k <= N) 
        {
            int j = 2*k;
            if (j < N && less(j, j+1)) 
            {
                j++;
            }
            if (!less(k, j))
            {
             break;
            }
            exch(k, j);
            k = j;
        }
        // Completar segun lo visto en el curso y las explicaciones

    }

   /***************************************************************************
    * Funciones auxiliares para comparaciones y cambios.
    ***************************************************************************/

    /**
     * Funcion de ayuda que retorna true si i<j
     * @param i
     * @param j
     * @return true si i<j, false en caso contrario
     */

   private boolean less(int i, int j) {
        if (comparator == null) {
            return ((Comparable<Key>) pq[i]).compareTo(pq[j]) < 0;
        }
        else {
            return comparator.compare(pq[i], pq[j]) < 0;
        }
    }

    /**
     * Cambia al elemento el la posicion i del arreglo pq con el de la posicion j
     * @param i
     * @param j
     */
    private void exch(int i, int j) {
        Key swap = pq[i];
        pq[i] = pq[j];
        pq[j] = swap;
    }

    /**
     * Funcion auxiliar que dice si el arreglo pq entre las posiciones 1..N cumple con la condicion de Heap
     * @return true si cumple con la condicion de Heap, falso en caso contrario
     */
    private boolean isMaxHeap() {
        //TODO Completar segun la documentacion
    }

    /**
     * Funcion auxiliar que dice si el subarbol con raiz en k cumple con la condicion de Heap
     * @param k
     * @return true si cumple con la condicion de Heap, falso en caso contrario
     */
    private boolean isMaxHeap(int k) {
        //TODO Completar segun la documentacion
    }


   /***************************************************************************
    * Iterator
    ***************************************************************************/

    public Iterator<Key> iterator() {

        return new HeapIterator();

    }

    private class HeapIterator implements Iterator<Key> {

        // Crea una nueva cola de prioridad
        private IMaxPQ<Key> copy;

        // Agrega todos los items del heap
        public HeapIterator() {
            if (comparator == null) copy = new MaxHeapPQ (size());
            else                    copy = new MaxHeapPQ (size(), comparator);
            for (int i = 1; i <= N; i++)
                copy.insert(pq[i]);
        }

        public boolean hasNext()  {
            return !copy.isEmpty();
        }
        public void remove()      {
            throw new UnsupportedOperationException();
        }

        public Key next() {
            if (!hasNext()) throw new NoSuchElementException();
            return copy.delMax();
        }
    }

}
