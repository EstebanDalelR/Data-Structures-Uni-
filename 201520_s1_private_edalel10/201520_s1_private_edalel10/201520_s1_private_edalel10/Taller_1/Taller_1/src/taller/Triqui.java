  package taller;
  
  public class Triqui
  {
    private char[][] tablero;
    private char turnoActual;
    public Triqui()
    {
      tablero= new char [3][3];
      turnoActual='X';
      inicializar();
      
    //aparece el tablero       
    }
    public void inicializar()
    {
      for(i=0;i<3;i++)
      {
        for(j=0;j<3;j++)
        {
          tablero [i][j]='-';
        }
      }
    }
    //se dejan todas las casillas en '-'
    public boolean ganar(char j1, char j2, char j3)
    {
      if ((c1!='-')&&(c1==c2)&&(c1==c3))
      {
        return true;
      }
      return false;
    }
    //recibe 3 jugadas, revisa que no sean vacíos y, si son iguales, reotrna ganada.
    public boolean revisarVictoria()
    {
      for(i=0;i<3;i++)
      {
        if(ganar(tablero [i][0],tablero [i][1],tablero [i][2])||ganar(tablero [0][i],tablero [1][i],tablero [2][i])||ganar(tablero [0][0],tablero [1][1],tablero [2][2])||ganar(tablero [0][2],tablero [1][1],tablero [2][0]))
        {
          return true;
        }
      }
      return false;
    }
    //revisa si hay un ganador en diagonales, filas y columnas
    public void siguienteTurno()
    {
      if(turnoActual=='X')
      {
        turnoActual='O';
      }
      else
      {
        turnoActual='X';
      }
    }
    public void tableroLleno()
    {
      boolean lleno=true;
      for(i=0;i<3;i++)
      {
        for(j=0;j<3;j++)
        {
          if(tablero[i][j]=='-';)
             {
               lleno=false;
             }
        }
      }
    }
    
    public boolean ponerTurno(int col, int fila)
    {
      if(col>=0&&col<3)
      {
        if(fila>=0&&fila<3)
        {
          if(tablero[fila][col]=='-')
          {
            tablero[fila][col]=turnoActual;
            return true;
          }
        }
      }
      return false;
    }
        