package Taller;

public class interfazTriqui
{
        Triqui= new Triqui;
        sc = new Scanner(System.in);
     

     private void show()
     {
        boolean finish = false;
        System.out.println("-----------------------------------------------");
        System.out.println("-                                             -");
        System.out.println("-            El mejor Triqui del mundo mundial            -");
        System.out.println("-                                             -");
        System.out.print  ("-----------------------------------------------");
        while(finish==false)
        {
          try
          {
              showMenu();
              System.out.print("Seleccione una opción ");
              // Leer selección del usuario
              int opt = sc.nextInt();
              // Validar opción seleccionada
              if(opt>=1 && opt<=5)
              {
                if(opt == EXIT_OPTION)
                {
                  finish = true;
                } 
                else 
                {
                  handleOption(opt);
                }
              } 
              else 
                {
                System.out.println("Opción inválida, vuelva a intentar");
                }
          } 
          catch(InputMismatchException ex)
          {
            sc.nextLine();
            System.out.println("El valor ingresado es inválido");
          } 
          catch(Exception ex)
          {
            System.out.println("Ocurrió un error de ejecución "+ex.getMessage());
          }
        }
     }
     private void showMenu()
     {
       System.out.println();
       System.out.println("Menú principal: ");
       System.out.println("1 iniciar");
       System.out.println("2 Salir");
       System.out.println("-------------------------------------------------------");
     }
     private void handleOption(int opt)
     {
       
       switch(opt)
       {
         case 1:
           Triqui.inicializar();
           System.out.println("--------------------");
           for(int i=0;i<3;i++)
           {
             System.out.println("|");
             for(int j=0;j<3;j++)
             {
               System.out.println(tablero[i][j];)
             }
           }
           //imprime el triqui
           
           System.out.print("Inician las X");
           System.out.print("Ingrese la posición de fila");
           int a = sc.nextInt();
           System.out.print("Ingrese la posición de columna");
           int b = sc.nextInt();
         Triqui.ponerTurno(b,a);
         Triqui.revisarVictoria();
         if(Triqui.tableroLleno())
         {
           System.out.print("Hay un empate.");
         }
         Triqui.siguienteTurno();
           break;
         case 2:
           System.exit(0);
           break;

         default :
           throw new RuntimeException("Invalid Option. Check the menu and try again.");
       }
     }
     System.out.println("-------------------------------------------------------");
     System.out.println(" ---> The result of the last operation is: "+calculator.getLasResult());
     System.out.println("-------------------------------------------------------");
}