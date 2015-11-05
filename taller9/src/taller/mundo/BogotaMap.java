package taller.mundo;

/*
 * BogotaMap.java
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

import java.io.File;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import taller.estructuras.MapEdge;
import taller.estructuras.MapNode;
import taller.estructuras.MapGraph;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;

/**
 *  La clase <tt>BogotaMap</tt> establece una relación directa entre un gestor de interacción
 *  directa con el usuario y la abstracción del mapa de la ciudad de Bogotá ({@link MapGraph}). Esta clase provee
 *  operaciones principales y críticas de búsqueda de direcciones y rutas óptimas de desplazamiento
 *  al interior de la ciudad.
 *
 *  @author ISIS1206 Team
 */


public class BogotaMap
{

    /**
     * Constante que establece la ubicación del archivo comprimido inicial.
     */
    private final static String COMPRESSED_USER_DATA = "./data/map.tar.bz2";

    /**
     * Constante que establece la ubicación del archivo que contiene la nomenclatura
     * principal de las vías de Bogotá.
     */
    private final static String DEFINITIONS_FILE = "./data/definitions.csv";

    /**
     * Constante que establece la ubicación del archivo que contiene la descripción de
     * los nodos que componen la malla vial de la ciudad.
     */
    private final static String NODES_FILE = "./data/nodes.csv";

    /**
     * Constante que establece la ubicación del archivo que contiene el conjunto de nodos
     * que conforman cada arteria vial de la ciudad.
     */
    private final static String NAMES_FILE = "./data/names.csv";

    /**
     * Constante que establece la ubicación del archivo que contiene la descripción de cada
     * arco que conforma un segmento de vía.
     */
    private final static String EDGES_FILE = "./data/edges.csv";

    /**
     * Instancia del grafo que contiene y abstrae la malla vial de la ciudad de Bogotá.
     */
    private MapGraph graph;

    /**
     * Diccionario que establece una relación entre una abreviatura nominal y su significado
     * correspondiente en la nomenclatura estándar de la ciudad.
     */
    private Map<String, String> definitions;


    /**
     * Constructor principal de la clase, esta se encuentra encargada de realizar la
     * inicialización y carga de los archivos de descripción de la representación de
     * grafo de la malla vial Bogotana.
     */
    public BogotaMap()
    {
         graph = new MapGraph();
         definitions = new HashMap<String, String>();

         File f = new File(COMPRESSED_USER_DATA);
         if(f.exists())
         {
             uncompressTarBzip(COMPRESSED_USER_DATA);
             f.delete();
         }

         try(BufferedReader br = new BufferedReader(new FileReader(DEFINITIONS_FILE)))
         {
              String line;
              br.readLine();
              while((line = br.readLine()) != null)
              {
                   String[] values = line.split(",");
                   definitions.put(values[0], values[1]);
              }
         }
         catch(Exception e)
         {
              e.printStackTrace();
         }

         /**
           TODO: Realice la carga de los archivos y complete la inicialización del grafo que
                 representa la malla vial.
          **/
    }

    /**
     * Basándose en los dos componentes de una dirección (<i>e.g.,</i> Calle y Carrera),
     * retorna la información completa del nodo que representa la intersección entre ambas vías.
     *
     * @param addrMain Primer componente de la dirección a buscar. Este debe cumplir con la
     * nomenclatura de nombres estándar dispuesta por el sistema de direcciones de Bogotá.
     * @param addrSec Primer componente de la dirección a buscar. Este debe cumplir con la
     * nomenclatura de nombres estándar dispuesta por el sistema de direcciones de Bogotá.
     * @return Una cadena que contiene la información del nodo que representa la dirección
     *         solicitada, en caso de que el nodo no exista, null.
     */
    public String findAddress(String addrMain, String addrSec)
    {
         /**
            TODO: A partir de los componentes de una dirección, retorne la información
                  del nodo que representa la dirección del sistema, si este existe.
          **/
         return null;
    }

    /**
     * Retorna el conjunto de abreviaturas nominales que representan la nomenclatura
     * estándar de las vías del sistema.
     * <p>
     * <b>Para obtener mayor información:</b>
     * Consultar la definición y descripción de la <a href="http://www.ideca.gov.co/sites/default/files/files/Proyectos/MR/EI%20-%20Cat%C3%A1logo%20de%20Objetos%20MR%20V4_9_2015.pdf">Definición Malla Vial Integral</a> de Bogotá, Página 46.
     *
     * @return Conjunto que contiene las abreviaturas que representan la nomenclatura estándar.
     */
    public Set<String> getNomenclatureAbbr()
    {
        return definitions.keySet();
    }

    /**
     * Retorna el conjunto de abreviaturas y significados que representan la nomenclatura estándar de las vías del sistema.
     * <p>
     * <b>Para obtener mayor información:</b>
     * Consultar la definición y descripción de la <a href="http://www.ideca.gov.co/sites/default/files/files/Proyectos/MR/EI%20-%20Cat%C3%A1logo%20de%20Objetos%20MR%20V4_9_2015.pdf">Definición Malla Vial Integral</a> de Bogotá, Página 46.
     *
     * @return Diccionario que contiene las abreviaturas y significados de la nomenclatura estándar.
     */
    public Map<String, String> getNomenclature()
    {
        return definitions;
    }

    /**
     *  Rutina que permite realizar la descompresión de un contenedor tar.bz2. Durante el
     *  proceso de descompresión, la rutina informa al usuario en consola, además 
     *  del nombre del archivo actual, el progreso de la operación. La rutina de-
     *  tiene la ejecución del programa si ocurre algún error.
     *  @param path La ubicación del archivo tar.bz2 a ser descomprimido.
     **/
    private void uncompressTarBzip(String path)
    {
       String anim= "|/-\\";
       int buffersize = 1024;
       try(TarArchiveInputStream is = new TarArchiveInputStream(new BZip2CompressorInputStream(new FileInputStream(path))))
       {
           TarArchiveEntry entry;
           while((entry = is.getNextTarEntry()) != null)
           {
                int offset = 0;
                final byte[] buffer = new byte[buffersize];
                FileOutputStream fout = new FileOutputStream("./data/"+entry.getName());
                System.out.println(entry.getName());
                int size = 0;
                int n = 0;
                long total = entry.getSize();
                while (-1 != (n = is.read(buffer))) 
                {
                    double x = ((size*1.0)/total)*100.0;
                    String progress = "\r" + anim.charAt(((int) Math.round(x)) % anim.length()) + " " + Math.round(x) + "% " + String.format("(%d / %d)", size, total) ;
                    System.out.write(progress.getBytes());
                    size += n;
                    fout.write(buffer, 0, n);
                }
                System.out.println();
                fout.close();
           }
       }
       catch(Exception e)
       {
          e.printStackTrace();
       }
    }
}
