package taller;

import taller.interfaz.SpyCLI;

public class Main{
  /**
       Punto de entrada a la aplicación.
     **/
    public static void main(String[] args)
    {
          try
          {
             new SpyCLI().mainMenu();
          }
          catch(Exception e)
          {
              e.printStackTrace();
          }
    }
  
}
