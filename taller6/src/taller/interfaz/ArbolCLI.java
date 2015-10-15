package taller.interfaz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import java.util.Scanner;

import taller.mundo.ReconstructorArbol;


public class ArbolCLI {
	
    private Scanner in;
    private IReconstructorArbol ra;

    public ArbolCLI()
    {
        in = new Scanner(System.in);
        //ra = new ReconstructorArbol();   Remplace aquí con su mundo
    }

    public void mainMenu()
    {
        boolean finish = false;
        while(!finish)
        {
           Screen.clear();
           System.out.println("------------------------------------------");
           System.out.println("-                                        -");
           System.out.println("-           Siembra de árboles           -");
           System.out.println("-                                        -");
           System.out.println("------------------------------------------");
           System.out.println("EL sistema para la plantación de árboles binarios\n");
          
           System.out.println("Menú principal:");
           System.out.println("-----------------");
           System.out.println("1. Cargar archivo con semillas");
           System.out.print("\nSeleccione una opción: ");
           int opt1 = in.nextInt();
           switch(opt1)
           {
                case 1:
                  recibirArchivo();
                  break;
                default:
                  break;
           }
        }
    }

    public void recibirArchivo()
    {
         boolean finish = false;
         while(!finish)
         {
              Screen.clear();
              System.out.println("Recuerde que el archivo a cargar");
              System.out.println("debe ser un archivo properties");
              System.out.println("que tenga la propiedad inorden,");
              System.out.println("la propiedad preorden (donde los ");
              System.out.println("elementos esten separados por comas) y");
              System.out.println("que esté guardado en la carpeta data.");
              System.out.println("");
              System.out.println("Introduzca el nombre del archivo:");
              String arch = in.next();
              
              try {
				ra.cargarArchivo(arch);
				ra.reconstruir();
				System.out.println("Ha plantado el árbol con éxito!\nPara verlo, dirijase a /data/arbolPlantado.json");
				System.out.println("Para volver al menu principal, escoja 1:");
				in.next();
				finish=true;
			} catch (Exception e) {
	              System.out.println("Hubo un problema cargando el archivo:");
	              System.out.println(e.getMessage());
	              e.printStackTrace();

			}
         }
    }



}
