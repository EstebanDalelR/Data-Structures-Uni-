package taller.interfaz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class RevisaJSON implements IVerificador
{
  FileInputStream fis;
  
  public boolean cargarArchivo(String nombre) throws IOException
  {
    BufferedReader br = null;
    //carga el archivo
    try {
      
      String sCurrentLine;
      
      br = new BufferedReader(new FileReader("/data"));
      
      while ((sCurrentLine = br.readLine()) != null) {
        System.out.println(sCurrentLine);
      }
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (br != null)br.close();
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }
    
  }
  public boolean revisarArchivo(String sCurrentLine)
  {
    Stack revisador=new Stack();
    char[] charArray = sCurrentLine.toCharArray();
    for(i=0;i<charArray.size;i++)
      
    { //entra cada char
      char nextChar=charArray[i];
      //entra cada paréntesis
      if((nextChar.equals("(")||nextChar.equals("[")||nextChar.equals("{"))&&!revisador.peek().equals('"'))
      {
        revisador.push(nextChar);
      }
      else(((nextChar.equals(")")&&revisador.peek().equals('('))||(nextChar.equals("]")&&revisador.peek().equals('['))||(nextChar.equals("}"))&&revisador.peek().equals('{'))
      {
        revisador.pop();
      }
      else if(((nextChar.equals(")")&&!revisador.peek().equals('('))||(nextChar.equals("]")&&!revisador.peek().equals('['))||(nextChar.equals("}"))&&!revisador.peek().equals('{'))
      {
        System.out.println("el JSON no es válido");
      }
   }

}