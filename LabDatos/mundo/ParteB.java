package mundo;

import java.io.File;
import java.util.Date;

import api.proyecto1.interfaces.centralllamadas.ICentralLlamadas;
import api.proyecto1.interfaces.centralllamadas.IAgente;
import api.proyecto1.interfaces.centralllamadas.ICaso;
import api.proyecto1.interfaces.centralllamadas.ICliente;
import api.proyecto1.interfaces.centralllamadas.ILlamada;
import api.proyecto1.interfaces.centralllamadas.TipoProblema;
import api.proyecto1.interfaces.centralllamadas.CategoriaCaso;

public class ParteB {

  public void executeParteBTest(){

    //TODO A medida que vaya realizando su proyecto debe ir descomentando este metodo. Este metodo esta comentado
    //para no generar problemas de compilacion. Para la correcion, debe estar completamente descomentado y funcionando.

    //Long tiempoInicial;
    //Long tiempo;

    //TODO Nota genera: Todas las clases que se llaman "SuClaseX" son una referencia simplemente
    //para que usted ponga la case que implementa la interface requerida.

    //File archJson = new File("./data/eventos_central_llamadas.json");
    //TODO Inicalizar su central de llamadas en la siguiente linea:
    //ICentralLlamadas centralLlamadas = new SuClaseDeCentralLlamadas(...);//La clase en su Kernel que implemente ICentralLlamadas
    //centralLlamadas.iniciarCentralLlamadas();

    //Hasta este punto la central de llamadas debe estar lista para recibir el archivo JSON
    //El siguiente metodo deberia cargar todos los datos de los Eventos de control.
    //Por dentro debe utilizar todos los metodos neceasrios (Suyos o de las interfaces) para que la informacion
    //quede propiamente cargada.
    //centralLlamadas.recibirEventosControl(archJson);

    //TODO Cargar todos los agentes que hay en el sistema:
    //Debe utilizar algun metodo en su clase de central de llamadas que devuelva todos los agentes registrados.
    //tiempoInicial = System.currentTimeMillis();
    //Iterable<IAgente> agentes = centralLlamadas.metodoQueDevuelvaLosAgentes();
    //tiempo = System.currentTimeMillis() - tiempoInicial;
    //imprimirDatosCompuestos("Dar Agentes", "Obtiene todos los agentes del sistema", tiempo, agentes);

    //TODO Cargar todas las llamadas de todos los agentes de la central.
    //Debe devolver una lista de listas. Cada lista debe contener las llamadas de un agente. Y se
    //debe tener una lista que contenga todas esas listas: ListaGrande<ListaDeLlamadasDeUnAgente<ILlamada>>
    //Iterable<Iterable<ILlamada>> llamadasAgentes = centralLlamadas.metodoQueDevuelvaLlamadasCompletas();
    //TODO Unificar las llamadas
    //tiempoInicial = System.currentTimeMillis();
    //Iterable<ILlamada> llamadasUnificadas = centralLlamadas.unificarLlamadas(llamadasAgentes);
    //tiempo = System.currentTimeMillis() - tiempoInicial;
    //imprimirDatosCompuestos("Unificar llamadas", "Unifica todas las llamadas del sistema en una sola lista", tiempo, llamadasUnificadas);

    //TODO Devolver los casos no resueltos dadas una fecha de inicio y otra de fin
    //Date fechaInicial = new Date(1435708800000L);
    //Date fechaFinal = new Date();
    //tiempoInicial = System.currentTimeMillis();
    //Iterable<ICaso> casosNoResueltos = centralLlamadas.darCasosNoSolucionadosPorFecha(fechaInicial, fechaFinal);
    //tiempo = System.currentTimeMillis() - tiempoInicial;
    //imprimirDatosCompuestos("Casos No Resueltos", "Devuelve los casos que no han sido resueltos en unas fechas", tiempo, casosNoResueltos);

    //TODO Dar la categoria que en promedio se demora mas
    //tiempoInicial = System.currentTimeMillis();
    //CategoriaCaso categoriaMasDemorada = centralLlamadas.darCategoriaPromedioMasDemorado();
    //tiempo = System.currentTimeMillis() - tiempoInicial;
    //imprimirDatosCompuestos("Caso mas demorado", "Devuelve el caso que en promedio se demora mas", tiempo, categoriaMasDemorada);

    //TODO Usar el metodo que devuelve los N agentes que mas atienden dadas unas fechas limites.
    //tiempoInicial = System.currentTimeMillis();
    //Iterable<IAgente> agentesProductivos = centralLlamadas.darAgentesMasAtiendenPorFecha(10, fechaInicial, fechaFinal);
    //tiempo = System.currentTimeMillis() - tiempoInicial;
    //imprimirDatosCompuestos("Agentes productivos", "Devuelve los 10 agentes mas productivos", tiempo, agentesProductivos);
    //Segunda prueba, con muchos agentes
    //tiempoInicial = System.currentTimeMillis();
    //agentesProductivos = centralLlamadas.darAgentesMasAtiendenPorFecha(100, fechaInicial, fechaFinal);
    //tiempo = System.currentTimeMillis() - tiempoInicial;
    //imprimirDatosCompuestos("Agentes productivos", "Devuelve los 100 agentes mas productivos", tiempo, agentesProductivos);

    //TODO Probar el metodo que devuelve los agentes que finalizan mas casos en la primera llamada.
    //tiempoInicial = System.currentTimeMillis();
    //IAgente agenteEfectivo = centralLlamadas.darAgenteMasCasosCierraPrimeraLlamada();
    //tiempo = System.currentTimeMillis() - tiempoInicial;
    //imprimirDatosCompuestos("Agentes efectivos", "Devuelve los agentes que mas casos cierran en la primera llamada", tiempo, agenteEfectivo);

    //TODO Probar el promedio de casos cerrados dadas unas fechas limites.
    //tiempoInicial = System.currentTimeMillis();
    //Double promedioCasosCerrados = centralLlamadas.darPromedioCierreCasosPorFecha(fechaInicial, fechaFinal);
    //tiempo = System.currentTimeMillis() - tiempoInicial;
    //imprimirDatosCompuestos("Promedio de casos cerrados", "Devuelve cuantos casos en promedio se cerraron en el rango de fechas", tiempo, promedioCasosCerrados);

    //TODO Devuelve algun agente que este registrado en el sistema. Utilice algun metodo en su mundo para obtener
    //un agente cualquiera que tenga llamadas o casos.
    //IAgente agente = centralLlamadas.metodoQueDevuelveUnAgenteCualquiera();

    //TODO Probar el metodo que devuelve el promedio de casos cerrados en un rango de fechas pero de un
    //agente especifico.
    //tiempoInicial = System.currentTimeMillis();
    //Double promedioCasosCerradosAgente = centralLlamadas.darPromedioCierreCasosAgentePorFecha(agente, fechaInicial, fechaFinal);
    //tiempo = System.currentTimeMillis() - tiempoInicial;
    //imprimirDatosCompuestos("Promedio casos cerrados: Agente", "Devuelve cuantos casos en promedio cerro un agente especifico en un rango de fechas", tiempo, promedioCasosCerradosAgente);

    //TODO Devolver los casos que tienen un comportamiento sospechoso
    //tiempoInicial = System.currentTimeMillis();
    //Iterable<ICaso> casosSospechosos = centralLlamadas.darCasosSospechaMalServicio();
    //tiempo = System.currentTimeMillis() - tiempoInicial;
    //imprimirDatosCompuestos("Dar casos sospechosos", "Devuelve los casos que han reportado un patron sospechoso de un mal servicio", tiempo, casosSospechosos);

  }

  private void imprimirDatosCompuestos(String requerimiento, String descripcion, Long tiempo, Object data){

    System.out.println("Requerimiento: "+requerimiento+"\n");
    System.out.println("Descripcion: "+descripcion+"\n");
    System.out.println("Resuelto en: "+(tiempo/1000)+" segundos"+"\n");
    if (data instanceof Iterable<?>){
      int size = 0;
      for (Object dataActual : (Iterable<?>)data) {
        imprimirDato(dataActual);
        size++;
      }
      System.out.println("Objetos devuletos: "+size+"\n");
    }
    if (data instanceof Double){
      System.out.println("Promedio: "+((Double)data)+"\n");
    }
    if (data instanceof CategoriaCaso){
      System.out.println("Categoria: "+((CategoriaCaso)data)+"\n");
    }
    if (data instanceof IAgente){
      IAgente agente = (IAgente)data;
      System.out.println("Agente: "+agente.getNombre()+"\n");
    }
  }

  private void imprimirDato(Object data){
    if (data instanceof ILlamada){
      ILlamada llamada = (ILlamada)data;
      System.out.println("Llamada: "+llamada.getEstampillaTiempo()+" - Agente: "+llamada.getAgente().getNombre()+" - Cliente: "+llamada.getCliente().getNombre()+"\n");
    }
    if (data instanceof ICaso){
      ICaso caso = (ICaso)data;
      System.out.println("Caso: "+caso.getCliente().getNombre()+" - Categoria: "+caso.getCategoriaCaso()+"\n");
    }
    if (data instanceof IAgente){
      IAgente agente = (IAgente)data;
      System.out.println("Agente: "+agente.getNombre()+"\n");
    }
    if (data instanceof Iterable<?>){
      int size = 0;
      for (Object dataActual : (Iterable<?>)data) {
        imprimirDato(dataActual);
        size++;
      }
      System.out.println("Objetos devuletos: "+size+"\n");
    }

  }

}
