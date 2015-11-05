package taller.estructuras;

/*
 * LatLong.java
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
 *  La clase <tt>LatLong</tt> representa una tupla (Latitud, Longitud) que describe la
 *  posición de un objeto bajo un sistema posicionamiento y ubicación global.
 *
 *  @author ISIS1206 Team
 */

public class LatLong implements Comparable<LatLong>
{
    /**
     * Número que establece la latitud geográfica del objeto en el mapa real.
     */
    public final double latitude;

    /**
     * Número que establece la longitud geográfica del objeto en el mapa real.
     */
    public final double longitude;

    /**
     * Constructor principal de una tupla de georeferencia y ubicación.
     * @param latitude Número que establece la latitud geográfica del objeto en el mapa real.
     * @param longitude Número que establece la longitud geográfica del objeto en el mapa real.
     */
    public LatLong(double latitude, double longitude)
    {
          this.latitude = latitude;
          this.longitude = longitude;
    }

    @Override
    public String toString()
    {
          return String.format("(%f, %f)", this.latitude, this.longitude);
    }

    @Override
    public int compareTo(LatLong l)
    {
         if((this.latitude == l.latitude) && (this.longitude == l.longitude))
         {
             return 0;
         }
         return -1;
    }

    @Override
    public int hashCode() 
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((int)this.latitude);
        result = prime * result + ((int)this.longitude);
        return result;
    }

}

