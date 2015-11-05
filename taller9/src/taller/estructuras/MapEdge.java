package taller.estructuras;

/*
 * MapEdge.java
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

/**
 *  La clase <tt>MapEdge</tt> representa y modela un segmento vial al interior de un {@link MapGraph}.
 *  Cada arco cuenta con un nodo (Representado a través del identificador único asignado) de inicio,
 *  además del identificador del nodo que representa el fin del trayecto. Además, cada arco contiene 
 *  la distancia geográfica (En metros) entre el nodo de inicio y el nodo final.
 *
 *  @author ISIS1206 Team
 */

public class MapEdge
{
    /**
     * Identificador único que describe el nodo de origen del trayecto.
     */
    public final int from;

    /**
     * Identificador único que describe el nodo final del trayecto.
     */
    public final int to;

    /**
     * Distancia geográfica (en metros) entre el nodo de origen y el nodo final.
     */
    public final double distance;

    /**
     * Constructor único de un segmento vial.
     *
     * @param from Identificador único que describe el nodo de origen del trayecto. from >= 0.
     * @param to Identificador único que describe el nodo final del trayecto. to >= 0.
     * @param distance Distancia geográfica entre el nodo de origen y final del trayecto
     */
    public MapEdge(int from, int to, double distance)
    {
        this.from = from;
        this.to = to;
        this.distance = distance;
    }

    @Override
    public int hashCode()
    {
        final int prime = 29;
        int result = 1;
        result += prime * from;
        result += prime * to;
        result += ((int) distance);
        return result;
    }

}

