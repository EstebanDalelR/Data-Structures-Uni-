  package taller;
  
  public class Jaula<T extends Comparable<T>> {
    
  
    private T t;
    
    public void asignarAnimal (T R){
    t= R;
    }
    public void vaciarJaula(){
      t=null;
    }
    public int quienEsMayor(T r){
     return t.getEdad.compareTo(r.getEdad);
    }
  }
  
  