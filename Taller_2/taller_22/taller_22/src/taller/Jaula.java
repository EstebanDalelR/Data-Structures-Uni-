  package taller;
  
  public class Jaula<T> {
    
  
    private T t;
    
    public void asignarAnimal (T R){
    t= R;
    }
    public void vaciarJaula(){
      t=null;
    }
  }
  
  