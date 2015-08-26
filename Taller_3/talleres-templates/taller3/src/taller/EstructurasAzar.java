package taller;
import java.util.*;

public class EstructurasAzar{
  
  private LinkedList<Integer> listica;
  private ArrayList<Integer> arreglito;
  public EstructurasAzar(){
    LinkedList<Integer> listica= new LinkedList<Integer>();
    ArrayList<Integer> arreglito= new ArrayList<Integer>();
  }
  public static int randInt(int min, int max) {
    
    // NOTE: Usually this should be a field rather than a method
    // variable so that it is not re-seeded every call.
    Random rand = new Random();
    
    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    int randomNum = rand.nextInt((max - min) + 1) + min;
    
    return randomNum;
  }
  public boolean llenarLista(int numeroAMeter){
    boolean resp=false;
    long tInicio= System.currentTimeMillis();
    for(int i=0;i<numeroAMeter;i++){
      listica.add(randInt(0,100));
    }
    long tTranscurrido = System.currentTimeMillis()-tInicio;
    System.out.print(tTranscurrido); 
    resp=true;
    return resp;
  }
  public boolean llenarArreglo(int numeroAMeter){
    boolean resp=false;
    long tInicio= System.currentTimeMillis();
    for(int i=0;i<numeroAMeter;i++){
      arreglito.add(randInt(0,100));
    }
    long tTranscurrido = System.currentTimeMillis()-tInicio;
    System.out.print(tTranscurrido); 
    resp=true;
    return resp;
  }
}