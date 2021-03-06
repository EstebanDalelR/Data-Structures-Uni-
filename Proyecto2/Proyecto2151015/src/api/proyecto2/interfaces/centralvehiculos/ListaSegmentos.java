package api.proyecto1.interfaces.centralvehiculos;
public class ListaSegmentos<T> implements IListaSegmentos{
private NodeLista nodo;
private int size;
public ListaSegmentos(){
ListaSegmentos lista = new ListaSegmentos;
size=0;
}
/**
 * Metodo que retorna el tama�o de la lista de segmentos 
 *@return retorna el tama�o de la lista 
 */
public int darTamanio(){
return size;
}
/**
 * Metodo que verifica si la lista de segmentos esta vacia 
 * @return true, si la lista esta vacia. False de lo contrario 
 */
public boolean estaVacia(){
  if(darTamanio==0){
  return true;
  }  
  else{
    return false;
  }
}
/**
 * M�todo que busca un elemento en la Lista
 * @param e - objeto a ser buscado en la Lista
 * @return el elemento buscado en caso de existir, o null en su defecto 
 */
public T buscar(T e){
  boolean a = false;
  NodoLista temp = nodo;
  while(temp!=null){
    if(temp.darElemento==e){
    return temp;
    a=true;
    }
    temp=temp.siguiente();   
  }
  if(a==false){
  return null;
  }
}
  /**
   *M�todo que retorna el elemento de la Lista encontrado en la posici�n ingresada por par�metro. La lista inicia con la posici�n 0
   *@param posicion - es la posici�n de la cual nos interesa obtener el elemento
   *@return el elemento encontrado en la posici�n ingresada por par�metro, null si la posici�n supera el tama�o de la Lista
   */
public T dar(int posicion){
  T buscado = null;
  NodeLista temp = nodo;
  int contador=0;
  if(posicion>darTamanio()){
    return buscado;
  }
  else {
    while (temp!=null){
      if(contador==posicion){
      return temp;
      }
      else{
      contador++;
      temp= temp.siguiente();
      }    
    }
  }
  }
/**
 * M�todo que elimina un elemento de la Lista
 * @param elem - elemento a ser buscado en la Lista
 * @return el elemento buscado en caso de existir, o null en su defecto
 */
public T eliminar(T e){
T buscado = this.buscar(e);
if(buscado == null){
return null;
}
else{
NodeLista anteriorAlB = buscado.anterior();
NodeLista siguienteAlB = buscado.siguiente();
anteriorAlB.cambiarSiguiente(siguienteAlB);
siguienteAlB.cambiarAnterior(anteriorAlB);
size--;
return buscado;
}
}
/**
 * M�todo que agrega un elemento al principio de la Lista
 * @param elem - elemento a ser agregado
 */
public void agregarAlPrincipio(T elem){
  if(size==0){
    NodeLista nuevo = new NodeLista(elem, null, null);
  nodo=nuevo;
  
  }
  else{
  NodeLista nuevo = new NodeLista(elem, nodo, null);
  nodo.cambiarAnterior(nuevo);
  nodo=nuevo;
  }
  size++;
}
/**
 * M�todo que agrega un elemento al final de la Lista
 * @param elem - elemento a ser agregado
 */
public void agregarAlFinal(T elem){
if(size==0){
    NodeLista nuevo = new NodeLista(elem, null, null);
  nodo=nuevo;
  }
else{
NodeLista ultimo = dar(darTamanio);
NodeLista nuevo = new NodeLista(elem, null, ultimo);
ultimo.cambiarSiguiente(nuevo);
}
size++;
}
/**
 * M�todo que agrega un nuevo elemento en la Lista, antes de otro elemento de referencia
 * @param elem - elemento a ser agregado en la Lista
 * @param ref - elemento de referencia. El nuevo elemento se agregar� antes de este elemento en la Lista.
 * @return true si el elemento pudo ser agregado, false de lo contrario
 */
public boolean agregarAntesDe(T elem,T ref){
NodeLista anterior = buscar(ref);
if(anterior==null){
return false;
}
else{
NodeLista nuevo = new NodeLista(elem, anterior , null);
anterior.cambiarAnterior(nuevo);
return true;
size++;
}
}
/**
 * M�todo que agrega un nuevo elemento en la Lista, despues de otro elemento de referencia
 * @param elem - elemento a ser agregado en la Lista
 * @param ref - elemento de referencia. El nuevo elemento se agregar� despues de este elemento en la Lista.
 * @return true si el elemento pudo ser agregado, false de lo contrario
 */
public boolean agregarDespuesDe(T elem,T ref){
NodeLista anterior = buscar(ref);
if(anterior==null){
return false;
}
else{
NodeLista nuevo = new NodeLista(elem, null , anterior);
anterior.cambiarSiguiente(nuevo);
return true;
size++;
}
}
public T darElemento(){
  return nodo.darElemento();
}
}

