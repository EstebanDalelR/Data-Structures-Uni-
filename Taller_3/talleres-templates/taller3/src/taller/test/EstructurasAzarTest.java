package taller.test;

import junit.framework.TestCase;
import taller.EstructurasAzar;
public class EstructurasAzarTest extends TestCase{
  
  private EstructurasAzar estructuras;
  public void probarLista(int aProbar){
    assertTrue("No se pudo llenar la lista", estructuras.llenarLista(aProbar));
  }
  public void probarArreglo(int aProbar){
   
    assertTrue("No se pudo llenar el arreglo", estructuras.llenarArreglo(aProbar));
  }
    
  public void probar1000(){
    probarLista(1000);
    probarArreglo(1000);
  }
  public void probar2000(){
    probarLista(2000);
    probarArreglo(2000);
  }
  public void probar4000(){
    probarLista(4000);
    probarArreglo(4000);
  }
  public void probar8000(){
    probarLista(8000);
    probarArreglo(8000);
  }
  public void probar16000(){
    probarLista(16000);
    probarArreglo(16000);
  }
  public void probar32000(){
    probarLista(32000);
    probarArreglo(32000);
  }
  public void probar64000(){
    probarLista(64000);
    probarArreglo(64000);
  }
  
}