package taller.estructuras;

/*
 * MapNode.java
 * This file is part of BogotáRoutes
 *
 * Copyright (C) 2015 - ISIS1206 Team 
 *
 * BogotáRoutes is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * BogotáRoutes is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with BogotáRoutes. If not, see <http://www.gnu.org/licenses/>.
 */

import java.util.List;
import java.util.ArrayList;

/**
 *  La clase <tt>MapNode</tt> representa y modela un nodo que pertecenece a
 *  un segmento vial al interior de un {@link MapGraph}. Cada nodo cuenta con un número 
 *  de identificación único en el sistema, además de una coordenada geográfica {@see LatLong}
 *  que permite establecer su ubicación espacial bajo la representación real.
 *  <p>
 *  Cada nodo cuenta, además, con una lista de nombres de segmentos viales a los cuales pertecenece.
 *  Se dice que un nodo representa una intersección de dos o más vías, si la longitud de la lista
 *  de nombres es mayor a uno.
 *
 *  @author ISIS1206 Team
 */

public class MapNode
{
    /**
     * Número entero que describe el identificador único del nodo al interior del grafo.
     */
    public final int id;

    /**
     * Lista que contiene los nombres y nomenclatura de las vías a las cuales pertecenece
     * el presente nodo.
     */
    public final List<String> names;

    /**
     * Coordenada geográfica que establece la posición del nodo.
     */
    public final LatLong gPosition;

    /**
     * Constructor principal de un nodo que pertecenece a un mapa.
     *
     * @param id Número de identificación único asignado al presente nodo.
     * @param latitude Número que establece la latitud geográfica del nodo en el mapa real.
     * @param longitude Número que establece la longitud geográfica del nodo en el mapa real.
     */
    public MapNode(int id, double latitude, double longitude)
    {
         this.id = id;
         this.gPosition = new LatLong(latitude, longitude);
         this.names = new ArrayList<String>();
    }

    /**
     * Añade una nueva vía a la cual pertecenece el presente nodo.
     *
     * @param name Nombre (Nomenclatura) de la vía a la cual pertecenece el nodo. name != null
     */
    public void addName(String name)
    {
         this.names.add(name);
    }

    @Override
    public String toString()
    {
         StringBuilder sb = new StringBuilder();
         for(String name : names)
         {
              sb.append(name+" - ");
         }
         sb.append(gPosition.toString());
         return sb.toString();
    }

    @Override
    public int hashCode()
    {
         final int prime = 41;
         int result = 1;
         result += prime*id;
         result += names.hashCode();
         result += gPosition.hashCode();
         return result;
    }

}


