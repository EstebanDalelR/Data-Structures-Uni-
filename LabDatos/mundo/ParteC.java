package mundo;

import api.proyecto1.interfaces.centralvehiculos.IEventoVehiculo;


public class ParteC {

  public void executeParteCTest(){

    //TODO A medida que vaya realizando su proyecto debe ir descomentando este metodo. Este metodo esta comentado
    //para no generar problemas de compilacion. Para la correcion, debe estar completamente descomentado y funcionando.

    //Long tiempoInicial;
    //Long tiempo;

    //File archJson = new File("./data/eventos_central_vehiculo.json");
    //TODO mosificar la siguiente linea para instanciar un ICentralVEhiculos
    //ICentralVehiculos centralVehiculos = new CentralVehiculos();

    //Aqui entran todos los eventos a la logica del mundo, a travez del JSON
    //Toda la información deberia ser cargada en este metodo,
    //y por dentro usaria metodos auxiliares de ustedes y ofrecidos por ICentralVehiculo
    //centralVehiculos.recibirEventosControl(archJson);


    //TODO Nota genera: Todas las clases que se llaman "SuClaseX" son una referencia simplemente
    //para que usted ponga la case que implementa la interface requerida.

    //archJson = new File("./data/eventos_central_llamadas.json");
    //TODO Inicalizar su central de llamadas en la siguiente linea:
    //ICentralLlamadas centralLlamadas = new SuClaseDeCentralLlamadas(...);//La clase en su Kernel que implemente ICentralLlamadas
    //centralLlamadas.iniciarCentralLlamadas();

    //Hasta este punto la central de llamadas debe estar lista para recibir el archivo JSON
    //El siguiente metodo deberia cargar todos los datos de los Eventos de control.
    //Por dentro debe utilizar todos los metodos neceasrios (Suyos o de las interfaces) para que la informacion
    //quede propiamente cargada.
    //centralLlamadas.recibirEventosControl(archJson);

    //TODO inicializar su clase que implementa la interface unificada
    //IAnalisisUnificado analisisUnificado = new SuClaseDeAnalisisUnificado(...);

    //TODO Aqui deberian dar una ruta cualquier por su ID
    //IRuta ruta = centralVehiculos.darRutaPorId(1);
    //TODO Devuelve algun agente que este registrado en el sistema. Utilice algun metodo en su mundo para obtener
    //un agente cualquiera que tenga llamadas o casos.
    //ICliente cliente = centralLlamadas.metodoQueDevuelveUnAgenteCualquiera();
    //tiempoInicial = System.currentTimeMillis();
    //Iterable<IEventoVehiculo> eventosSospechosos = analisisUnificado.darEventosSospechososAsociadosAPQR(cliente, ruta);
    //tiempo = System.currentTimeMillis() - tiempoInicial;
    //imprimirDatos("Requerimiento 1 unificado", "Devuelve los eventos sospechosos que estan asociados a las PQR de un cliente", tiempo, eventosSospechosos);

    //TODO Probar el metodo unificado que devuelve los eventos que deneran mas PQR.
    //tiempoInicial = System.currentTimeMillis();
    //Iterable<IEventoVehiculo> eventosConPQRAlta = analisisUnificado.darEventosGeneranMasPQRPorRuta(ruta);
    //tiempo = System.currentTimeMillis() - tiempoInicial;
    //imprimirDatos("Requerimiento 2 unificado", "Devuelve los eventos que mas generan PQR dada una ruta", tiempo, eventosConPQRAlta);

    //TODO Probar el metodo unificado que agrupa los eventos en torno a las PQR asociadas a ellos.
    //tiempoInicial = System.currentTimeMillis();
    //Iterable<Iterable<IEventoVehiculo>> eventosAgrupadosPorPQR = analisisUnificado.darRutaPQRAgrupadoPorSegmentos();
    //tiempo = System.currentTimeMillis() - tiempoInicial;
    //imprimirDatos("Requerimiento 3 unificado", "Devuelve los eventos agrupados por PQR realizadas", tiempo, eventosAgrupadosPorPQR);


  }

  private void imprimirDatos(String requerimiento, String descripcion, Long tiempo, Object data){
    System.out.println("Requerimiento: "+requerimiento+"\n");
    System.out.println("Descripcion: "+descripcion+"\n");
    System.out.println("Resuelto en: " + (tiempo/1000) + "segundos"+"\n");

    if (data instanceof Iterable<?>){
      int size = 0;
      for (Object dataActual : (Iterable<?>)data) {
        imprimirDato(dataActual);
        size++;
      }
      System.out.println("Objetos devuletos: "+size+"\n");
    }
  }

  private void imprimirDato(Object data){
    if (data instanceof IEventoVehiculo){
      IEventoVehiculo evento = (IEventoVehiculo)data;
      System.out.println("Evento: "+evento.getEstampillaTiempo()+" - Tipo: "+evento.getTipo()+"\n");
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
