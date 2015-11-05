package taller.interfaz;

/*
 * BogotaRoutingCLI.java
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

import taller.mundo.BogotaMap;

import java.util.Map;
import java.util.Set;
import java.util.Scanner;
import java.util.ArrayList;

public class BogotaRoutingCLI
{
     private BogotaMap map;
     private Scanner in;

     public BogotaRoutingCLI()
     {
         in = new Scanner(System.in);
         System.out.println("Cargando Información de Rutas y Malla vial...");
         map = new BogotaMap();
     }

     public void mainMenu()
     {
         Screen.clear();
         boolean finish = false;
         while(!finish)
         {
              System.out.println("------------------------------------------------");
              System.out.println("-                                              -");
              System.out.println("-    Sistema de búsqueda de rutas en Bogotá    -");
              System.out.println("-                                              -");
              System.out.println("------------------------------------------------\n");

              System.out.println("Menú principal");
              System.out.println("--------------");
              System.out.println("1. Encontrar la información de una dirección específica en Bogotá");
              System.out.println("2. Conocer la nomenclatura de direcciones del sistema");
              System.out.println("3. Salir\n");

              System.out.print("Seleccione una opción: ");
              int opt = in.nextInt();

              switch(opt)
              {
                  case 1:
                    getAddressInfo();
                    break;
                  case 2:
                    listRoadNomenclature();
                    break;
                  case 3:
                    finish = true;
                    break;
              }
              Screen.clear();
         }
     }

     private String removeWhitespace(String s)
     {
          Integer init = null;
          Integer end = null;
          for(int i = 0; i < s.length(); i++)
          {
              char c = s.charAt(i);
              if(c != ' ')
              {
                   if(init == null)
                   {
                       init = i;
                   }
                   else
                   {
                       end = i;
                   }
              }
          }
          if(init != null && end == null)
          {
               end = init;
          }
          else if(init == null)
          {
               return "";
          }
          return s.substring(init, end+1);
     }

     public void getAddressInfo()
     {
         Screen.clear();
         in.nextLine();
         System.out.println("Obtener información de una dirección");
         System.out.println("------------------------------------\n");

         System.out.println("Ejemplo de entradas válidas de consulta:");
         System.out.println("* CL 167 # 62");
         System.out.println("* KR 45 # 13");
         System.out.println("* CL 40 S # 24");
         System.out.println("* KR 1 E # 19");
         System.out.println("* AK 72 # 134\n");


         System.out.print("\nIngrese una dirección válida: ");
         String addr = in.nextLine();

         if(addr.matches("^[A-Z]{2}[A-Z]? \\d+( E| S)? # \\d+[A-Z]?( E| S)?$"))
         {
               Screen.clear();
               String[] values = addr.split("#");
               int i = 0;
               for(String s : values)
               {
                    values[i] = removeWhitespace(s);
                    i++;
               }
               ArrayList<String> options = findAddressOptions(values);
               System.out.println("\nOpciones de búsqueda de dirección");
               System.out.println("-----------------------------------\n");
               int idx = 1;
               for(String opt : options)
               {
                   System.out.println(String.format("%d. %s # %s", idx, values[0], opt));
                   idx++;
               }
               System.out.println(String.format("%d. Volver al menú principal", idx));
               System.out.print("Seleccione una opción: ");
               int opt = in.nextInt();
               if(opt != idx)
               {
                   in.nextLine();
                   String addrMain = values[0];
                   String addrSec = options.get(opt-1);
                   String info = map.findAddress(addrMain, addrSec);
                   if(info == null)
                   {
                        /**
                          TODO: En caso de que el primer componente corresponda a una Calle o Carrera,
                                y la dirección solicitada no exista en el sistema, se debe emprender 
                                una nueva búsqueda, reemplazando el prefjo Calle por Avenida Calle 
                                (Avenida Carrera, respectivamente), y viceversa.

                                En caso de que alguna de las combinaciones generadas no correspondan a 
                                un nodo en el sistema, el programa debería responder "La dirección solicitada, 
                                no existe en el sistema."
                         **/
                         System.out.println("La dirección solicitada, no existe en el sistema.");
                   }
                   else
                   {
                        System.out.println(info+"\n");
                   }
                   System.out.print("Presione cualquier tecla para continuar...");
                   in.nextLine();
               }
         }
         else
         {
             System.out.println("Dirección inválida, intente de nuevo.\n");
             System.out.print("Presione cualquier tecla para continuar...");
             in.nextLine();
         }
     }

     public ArrayList<String> findAddressOptions(String[] values)
     {
          ArrayList<String> options = new ArrayList<String>();
          String addrMainNom = values[0].split(" ")[0];
          Set<String> nomOptions = map.getNomenclatureAbbr();
          for(String s : nomOptions)
          {
               if(!addrMainNom.equals(s))
               {
                     options.add(s+" "+values[1]);
               }
          }
          return options;
     }

     public void listRoadNomenclature()
     {
         Screen.clear();
         in.nextLine();
         System.out.println("Nomeclatura y abreviaturas usadas por el sistema");
         System.out.println("------------------------------------------------\n");

         Map<String, String> abbr = map.getNomenclature();
         abbr.forEach((k,v) -> System.out.println(k+" : "+v));
         System.out.println("Presione cualquier tecla para continuar... ");
         in.nextLine();
     }

}

