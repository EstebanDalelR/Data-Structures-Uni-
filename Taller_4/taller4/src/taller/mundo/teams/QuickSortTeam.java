package taller.mundo.teams;

/*
 * QuickSortTeam.java
 * This file is part of AlgorithmRace
 *
 * Copyright (C) 2015 - ISIS1206 Team 
 *
 * AlgorithmRace is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * AlgorithmRace is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with AlgorithmRace. If not, see <http://www.gnu.org/licenses/>.
 */

import java.util.Arrays;
import java.util.Random;
import static taller.mundo.AlgorithmTournament.TipoOrdenamiento;

public class QuickSortTeam extends AlgorithmTeam
{

     private static Random random = new Random();

     public QuickSortTeam()
     {
          super("Quicksort");
          userDefined = true;
     }

     @Override
     public Comparable[] sort(Comparable[] list, TipoOrdenamiento orden)
     {
          quicksort(list, 0, list.length, orden);
          return list;
     }

     private static void quicksort(Comparable[] lista, int inicio, int fin, TipoOrdenamiento orden)
     {
          /**
            A continuación, se presenta una implementación de Quicksort. Esta implementación
            difiere de la implementación presentada por el sistema, en la medida que el pro-
            cedimiento de partición se realiza sin crear listas de uso auxiliar. Al igual
            que la implementación de Merge Sort, es posible realizar el proceso de forma
            paralela. 

            Nota:  Si desea implementar este algoritmo de forma concurrente es necesario tener en cuenta
                   que solo debe crearse un número limitado de hilos de ejecución, debido a que el proceso
                   principal y cada uno de los hilos de ejecución creados comparten el mismo espacio de memoria
                   disponible para la ejecución del proceso principal. 

                   Se recomienda crear una clase que implemente la interfaz Runnable 
                   (http://docs.oracle.com/javase/7/docs/api/java/lang/Runnable.html) y ejecutar esta 
                   instancia en un hilo de ejecución, i.e., Thread t = new Thread(new MyRunnable());

                   No olvide unir los hilos de ejecución antes de finalizar cada proceso que los contiene. i.e., 
                   t.join()

             procedimiento quicksort(lista : Lista, inicio : Int, final : Int, orden : TipoOrdenamiento)
                Si final-inicio <= 1
                   return
                indicePivote : Int -> particion(lista, inicio, fin, orden)
                Opción 1: Implementación paralela
                   Si final-inicio > 2
                      Iniciar un hilo de ejecución y ejecutar quicksort(lista, inicio, pivote, orden)
                      quicksort(lista, indicePivote+1, final, orden)
                      Unir el hilo de ejecución y finalizar
                   De lo contrario, usar la opción 2.
                Opción 2: Implementación estándar
                   quicksort(lista, inicio, indicePivote, orden)
                   quicksort(lista, indicePivote+1, final, orden)
           **/


     }

    private static int particion(Comparable[] lista, int inicio, int fin, TipoOrdenamiento orden)
    {
         /**
           El presente procedimiento ordena los elementos de una lista de acuerdo a un pivote
           o valor de referencia bien elegido; los elementos mayores al pivote deben ser ubi-
           cados a la derecha del mismo, los elementos menores, a la izquierda.

            procedimiento particion(lista : Lista, inicio : Int, fin : Int, orden : TipoOrdenamiento)
               indicePivote : Int -> eleccionPivote(inicio, fin)     //El procedimiento de elección puede ser aleatorio.
               Intercambiar lista[inicio] y lista[indicePivote]

               pivote : Comparable -> lista[inicio]

               i : Int -> inicio+1
               Desde j = inicio+1 hasta fin
                  Si lista[j] < pivote
                     Intercambiar lista[j] y lista[i]
                     Incrementar i
               Intercambiar lista[inicio] y lista[i-1]
               return i-1
          **/
          return 0;
    }

    private static int eleccionPivote(int inicio, int fin)
    {
         /**
           Este procedimiento realiza la elección de un índice que corresponde al pivote res-
           pecto al cual se realizaría la partición de la lista. Se recomienda escoger el ele-
           mento que se encuentra en la mitad, o de forma aleatoria entre los índices [inicio, fin).
          **/
         return 0;
    }

    /**
      Retorna un número aleatorio que se encuentra en el intervalo [min, max]; inclusivo.
      @param min, índice inicial del intervalo.
      @param max, índice final del intervalo.
      @return Un número aleatorio en el intervalo [min, max].
    **/
    public static int randInt(int min, int max) 
    {
          int randomNum = random.nextInt((max - min) + 1) + min;
          return randomNum;
    }


}
