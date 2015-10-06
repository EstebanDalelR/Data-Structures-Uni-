package taller.estructuras;

/**
 * La clase Heap provee meteodos estaticos para ordenar un arreglo por medio de heapsorting
 *  Para documentacion adicional vea Section 2.4 de
 *  <i>Algorithms, 4th Edition</i> por Robert Sedgewick y Kevin Wayne.
 *  Basada en la versión hecha por Robert Sedgewick y Kevin Wayne en el libro
 *  Algorithms, 4th Edition
 *  
 */
public class HeapSort {

    // Esta clase no debe ser instanseada.
    private HeapSort() {
    }

    /**
     * Reordenada el arreglo en orden ascendente
     * @param pq el arreglo que sera ordenado
     */
    public static void sort(Comparable[] pq) {
      int i=0;
      for (int h=1; h>pq.length/2;k++ ) {
          sink(pq,h,i);
      }
      while(i<pq.length)
        {
            exch(pq,pq.length,i++)
            sink(pq,1,i);
        }
        //TODO Completar segun la documentacion
    }

    /**
     * ************************************************************************
     * Funciones auxiliares
     * *************************************************************************
     */

    private static void sink(Comparable[] pq, int k, int N) {
        // completar segun lo visto en clase y en las explicaciones.
      //El parametro N es la ultima posicion de la parte del arreglo que cumple con la condicion de Heap.
    while(2*k <=N)
    {
        int j= 2*k;
        if (j<N && greater(pq,j,j+1)) {
            j++;
        }
        if (!greater(pq,k,j)) {
            break;
        }
        exch(pq,k,j);
        k=j;
    }

    /**
     * ************************************************************************
     * Funciones axuiliares para comparaciones y cambios.
     * *************************************************************************
     */
    
    private static boolean greater(Comparable[] pq, int i, int j) {

        //TODO completar segun lo visto en clase y en las explicaciones.
        return pq[i-1].compareTo(pq[j-1])>0;
    }

    private static void exch(Object[] pq, int i, int j) {

        //TODO completar segun lo visto en clase y en las explicaciones.
        Object cambiar = pq[i+1];
        pq[i+1]= pq[j+1];
        pq[j+1]=cambiar;
    }

    // es v > w ?
    private static boolean greater(Comparable v, Comparable w) {
        //TODO completar segun lo visto en clase y en las explicaciones.
        return v.compareTo(w)>0;
    }
}