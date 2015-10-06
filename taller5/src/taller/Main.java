package taller;
import taller.interfaz.*;

public class Main{
  
  
  public static void main(String[] args){
    
    CentralPacientesCLI centralPacientesCLI = new CentralPacientesCLI();
    try {
      centralPacientesCLI.mainMenu();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
  
}