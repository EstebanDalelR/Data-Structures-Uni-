package taller.estructuras;

/*
 * MapGraph.java
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

import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

/**
 *  La clase <tt>MapGraph</tt> representa y modela un grafo dirigido con pesos
 *  entre dos nodos relacionados entre sí. En el presente caso, se desea 
 *  realizar la representación de la malla víal de la ciudad de Bogotá, Colombia,
 *  considerando cada intersección o punto de inflexión del sistema como un nodo, 
 *  y un segmento de vía que une dos nodos como un arco que declara su peso respectivo
 *  como la distancia en metros entre ambos puntos.
 *  <p>
 *  La implementación considerada a continuación, se basa en la representación de un
 *  grafo a partir del uso de listas de adyacencia, las cuales corresponden a un
 *  diccionario que establecen una correspondencia entre un {@link MapNode} y un conjunto
 *  {@link Set} que contiene cada uno de los segmentos viales {@link MapEdge} asociados 
 *  al nodo solicitado.
 *  <p>
 *  Se garantiza que todas las operaciones de acceso al grafo, se realizan en un tiempo
 *  constante. Las operaciones de búsqueda sobre cada uno de los segmentos asociados a 
 *  un nodo, tardan un tiempo proporcional al número de segmentos presentes.
 *  <p>
 *  <b>Para obtener mayor información:</b>
 *  Consultar la <a href="http://algs4.cs.princeton.edu/43mst">Sección 4.3</a> de
 *  <i>Algorithms, 4th Edition</i> de Robert Sedgewick y Kevin Wayne.
 *
 *  @author ISIS1206 Team
 */


public class MapGraph
{
    /**
     *  Diccionario que permite establecer una relación entre el
     *  número de identificación de un nodo y su información respectiva
     **/
    private Map<Integer, MapNode> nodes;

    /**
     * Diccionario que representa la lista de adyacencia principal del
     * grafo que abstrae el mapa.
     **/
    private Map<Integer, Set<MapEdge>> edges;

    /**
     * Diccionario que establece una correspondencia entre el nombre de un tramo
     * específico, y el conjunto de identificadores de nodos que lo componen.
     **/
    private Map<String, Set<Integer>> nodesByName;

    /**
     * Constructor principal del grafo.
     **/
    public MapGraph()
    {
       this.nodes = new HashMap<Integer, MapNode>();
       this.edges = new HashMap<Integer, Set<MapEdge>>();
       this.nodesByName = new HashMap<String, Set<Integer>>();
    }

   /**
    * Agrega el identificador y la información que describe a un nodo del
    * mapa.
    *
    * @param id Número de identificación única del nodo en el mapa. id >= 0
    * @param latitude Número que establece la latitud geográfica del nodo en el mapa real.
    * @param longitude Número que establece la longitud geográfica del nodo en el mapa real.
    */
   public void addNode(int id, double latitude, double longitude)
   {
        //TODO: Agregue un nuevo nodo al conjunto de nodos del grafo.
   }

   /**
    * Añade un nodo al conjunto de nodos que componen un segmento vial identificado con
    * nombre <i>name</i>.
    *
    * @param id Número de identificación única del nodo en el mapa. id >= 0
    * @param name Nombre del segmento vial al cual pertecenece el nodo a asociar. name != null
    */
   public void addName(int id, String name)
   {
        /**
          TODO : Agregue un nuevo nodo al conjunto de nodos que conforman una vía
                 con nombre name.
        **/
   }

   /**
    * Añade un arco entre dos nodos, cuya distancia se encuentra expresada en metros.
    *
    * @param from Nodo que establece el inicio del segmento.
    * @param to Nodo final del segmento.
    * @param distance Distancia geográfica real entre los dos nodos solicitados.
    */
   public void addEdge(int from, int to, double distance)
   {
       /**
          TODO : Agregue un nuevo arco al conjunto de arcos del grafo.
        **/
   }

   /**
    * Basándose en los dos componentes de una dirección (<i>e.g.,</i> Calle y Carrera),
    * encuentra el identificador del nodo que representa la intersección entre ambas vías.
    *
    * @param addrMain Primer componente de la dirección a buscar. Este debe cumplir con la
    * nomenclatura de nombres estándar dispuesta por el sistema de direcciones de Bogotá.
    * @param addrSec Primer componente de la dirección a buscar. Este debe cumplir con la
    * nomenclatura de nombres estándar dispuesta por el sistema de direcciones de Bogotá.
    * @return El número de identificación del nodo que describe la intersección en el grafo,
    * -1, si este no existe.
    * @see Set 
    */
   public int searchAddress(String addrMain, String addrSec)
   {
       /**
         TODO: Basándose en los componentes de la dirección solicitada, retorne el índice del nodo
               que contiene la información que la describe.

               Nota: Puede hacer uso de la intersección entre dos conjuntos.
        **/
       return -1;
   }

   /**
    * Basándose en el identificador de un nodo, obtiene la información respectiva del nodo
    * solicitado.
    *
    * @param id Número de identificación único de un nodo en el mapa. id >= 0
    * @return La información completa de descripción del nodo solicitado.
    * @see MapNode
    */
   public MapNode getMapNode(int id)
   {
       return nodes.get(id);
   }

   /**
    * Basándose en el identificador de un nodo, obtiene el conjunto de arcos que tienen como
    * origen, el nodo solicitado.
    *
    * @param id Número de identificación único de un nodo en el mapa. id >= 0
    * @return El conjunto de arcos que tienen como origen, el nodo identificado con número id.
    * @see Set
    * @see MapEdge
    */
   public Set<MapEdge> getNodeEdges(int id)
   {
       return edges.get(id);
   }
}
