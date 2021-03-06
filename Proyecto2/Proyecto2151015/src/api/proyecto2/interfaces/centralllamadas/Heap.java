package api;

import estructuras.cola.ILista;

public class Heap<T> implements serializable, ILista
{
  private int tamanioEst=0;
  private Lista elementos[];
  //------------------------------------
  //Constructors
  //------------------------------------
  //un construtor para una estructura vac�a 

  public Heap()
  {
    elementos= (T[]) new Object[tamanioEst];
  }
  //un constructor para un tama�o
  public Heap(int tam)
  {
    elementos = (T[]) new Object[tam];
  }

  //------------------------------------
  //Methods
  //------------------------------------  

  public void agregar(T aAgregar)
  {
    elementos.agregar(aAgregar);
    ordenar();
  }

  public void Ordenar(Comparable[] pq)
  {
    int N = pq.length;
    for (int k = N/2; k >= 1; k--)
    {
     sink(pq, k, N);
    }
    while (N > 1) 
    {
      exch(pq, 1, N--);
      sink(pq, 1, N);
    }
  }

  public void agrandarArreglo()
  {
    int nuevoTamanio= elementos.length*2;
    elementos= Arrays.copyOf(elementos, nuevoTamanio);
  }

  public boolean eliminar(T aEliminar)
  {
    for(i =0; i<elementos.length; i++)
    {
      if(aComparar[i]==aBuscar)
      { 
      return true;
      }
    }
    return false;
  }

  public boolean contieneElemento(T aBuscar)
  {
    Lista aComparar = darElementos();
    for(i =0; i<elementos.length; i++)
    {
      if(aComparar[i].equals(aBuscar))
      { 
      return true;
      }
    }
    return false;
  }
  

  public Lista darElementos() 
  {
  Lista retornar = new Lista[];
   if(estaVacio())
   {
    return null;
   }
   for (i =0; i<elementos.length; i++)
   {
    if(elementos[i]==null)
    {}
    else
    {
    retornar.agregar(elementos[i]);
    }
  }
    return retornar;
  }

  public int darTamano()
  {
    if(estaVacio())
    {
    return 0;
    }
    int contador =0;
    for (i = 0; i <elementos.length; i++)
    {
      if(elementos[i]==null)
      {}
      else
      {
      contador += elementos[i].length ;
      }
    }
    return contador;
  }

  public boolean estaVacio()
  {
    if (elementos.length ==0)
    {
      return true;
    }
    else
    {
      return false
    }
  }
  //------------------------------------
  //Helper Functions
  //------------------------------------  

  public void sink(Comparable[] pq, int k, int N)
  {
   while (2*k <= N) 
    {
    int j = 2*k;
    if (j < N && less(pq, j, j+1)) 
    {
      j++;
    }
    if (!less(pq, k, j)) 
    {
      break;
    }
    exch(pq, k, j);
    k = j;
    }
  }

   public void swim()
  {
    while (k > 1 && greater(k/2, k)) 
    {
     exch(k, k/2);
     k = k/2;
    }
  }

  private void exch(int i, int j) {
      Key swap = pq[i];
      pq[i] = pq[j];
      pq[j] = swap;
  }
}