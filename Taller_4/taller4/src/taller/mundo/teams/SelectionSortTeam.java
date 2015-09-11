package taller.mundo.teams;

/*
 * SelectionSortTeam.java
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
import static taller.mundo.AlgorithmTournament.TipoOrdenamiento;

public class SelectionSortTeam extends AlgorithmTeam
{
     public SelectionSortTeam()
     {
          super("Selection Sort (*)");
          userDefined = false;
     }

     @Override
     public Comparable[] sort(Comparable[] list, TipoOrdenamiento orden)
     {
          return selectionSort(list, orden);
     }

     /**
      Ordena un arreglo de enteros, usando Ordenamiento por selección.
      @param arr Arreglo de enteros.
    **/
    private Comparable[] selectionSort(Comparable[] arr, TipoOrdenamiento orden)
    {
        int elemPos = 0;                     //Índice de almacenamiento del elemento menor, el área de exploración se encuentra 
                                             //en el intervalo (elemPos, arr.length-1]
        while(elemPos < arr.length)          //Mientras el arreglo no haya sido ordenado
        {
            Comparable minElem = null;           //Variable que almacena el elemento menor presente en el área restante del arreglo.
            int pos = elemPos;                     //Variable que almacena el índice del mínimo encontrado.
            for(int i = elemPos; i < arr.length; i++)        //Se exploran los elementos presentes en el intervalo
            {
                 int stat = 0;
                 boolean val = false;
                 if(minElem != null)
                 {
                     stat = arr[i].compareTo(minElem);
                     val = stat < 0 && orden == TipoOrdenamiento.ASCENDENTE;
                     val |= stat > 0 && orden == TipoOrdenamiento.DESCENDENTE;
                 }
                 else
                 {
                     val = true;
                 }
                 if(val)        //Si el elemento actual es menor que el mínimo reportado
                 {
                     pos = i;                //Se reemplaza el mínimo reportado
                     minElem = arr[i];
                 }
            }
            Comparable temp = arr[elemPos];         //Se inserta el mínimo global hallado en la posición correspondiente
            arr[elemPos] = minElem;
            arr[pos] = temp;
            elemPos++;                       //Se reduce el área de exploración
        }
        return arr;
    }
}
