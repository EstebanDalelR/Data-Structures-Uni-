package taller.interfaz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class pilasCLI {

 private Scanner in;
 private IVerificador verificador;


 public pilasCLI()
 {
  in = new Scanner(System.in);
  // Definir la implementación de la interfaz
  //TODO verificador = new Verificador();
 }

 public void mainMenu()
 {
  boolean finish = false;
  while(!finish)
  {
   Screen.clear();
   System.out.println("------------------------------------------");
   System.out.println("-                                        -");
   System.out.println("-       Revisión de documentos JSON      -");
   System.out.println("-                                        -");
   System.out.println("------------------------------------------");
   System.out.println("EL sistema para la verificación de escritura de documentos JSON\n");

   System.out.println("Menú principal:");
   System.out.println("-----------------");
   System.out.println("1. Revisar archivo JSON");
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
   System.out.println("debe ser un archivo JSON");
   System.out.println("guardado en la carpeta data.");
   System.out.println("No olvide incluir la extensión.");
   System.out.println("");
   System.out.println("Introduzca el nombre del archivo:");
   String arch = in.next();

   try {
    String json = verificador.cargarArchivo(arch);
    imprimirResultado(verificador.hayError(json));
   } catch (Exception e) {
    System.out.println("Hubo un problema cargando el archivo:");
    System.out.println(e.getMessage());
    System.out.print("\nSeleccione 1 para retornar al menu principal: ");
    int opt1 = in.nextInt();
    switch(opt1)
    {
    case 1:
     mainMenu();
     break;
    default:
     break;
    }

   }
  }
 }


 public void imprimirResultado(int resultado)
 {
  boolean finish = false;
  while(!finish)
  {
   Screen.clear();
   if(resultado == -1)
   {
    System.out.println("El String JSON está correctamente construido.");
   }
   else
   {
    System.out.println("Se encontró un error en el carácter: "+resultado);
   }
   System.out.print("\n\nSeleccione 1 para retornar al menu principal: ");

   int opt1 = in.nextInt();
   switch(opt1)
   {
   case 1:
    mainMenu();
    break;
   default:
    finish=true;
    break;
   }
  }
 }

 public static void main(String... args)
 {
  new pilasCLI().mainMenu();
 }


}
