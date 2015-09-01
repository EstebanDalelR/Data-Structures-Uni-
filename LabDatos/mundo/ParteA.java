package mundo;

import java.io.File;
import java.util.Date;

import api.proyecto1.interfaces.centralvehiculos.ICentralVehiculos;
import api.proyecto1.interfaces.centralvehiculos.IEventoVehiculo;
import api.proyecto1.interfaces.centralvehiculos.IPunto;
import api.proyecto1.interfaces.centralvehiculos.IRuta;
import api.proyecto1.interfaces.centralvehiculos.ISegmento;
import api.proyecto1.interfaces.centralvehiculos.IVehiculo;

public class ParteA {

	public void executeParteATest() {

		//TODO A medida que vaya realizando su proyecto debe ir descomentando este metodo. Este metodo esta comentado
    //para no generar problemas de compilacion. Para la correcion, debe estar completamente descomentado y funcionando.

		//File archJson = new File("./data/eventos_central_vehiculo.json");
		//TODO mosificar la siguiente linea para instanciar un ICentralVEhiculos
		//ICentralVehiculos centralVehiculos = new CentralVehiculos();

		//Aqui entran todos los eventos a la logica del mundo, a travez del JSON
		//Toda la información deberia ser cargada en este metodo,
		//y por dentro usaria metodos auxiliares de ustedes y ofrecidos por ICentralVehiculo
		//centralVehiculos.recibirEventosControl(archJson);

		//TODO Aqui deberian dar un vehiculo cualquier por su ID
		//Tambien deberian dar una ruta por su ID
		//IVehiculo vehiculo = centralVehiculos.darVehiculoPorId(1);
		//IRuta ruta = centralVehiculos.darRutaPorId(1);

		//Aqui se unificaran los eventos de una ruta para un vehiculo dado
		//Long inicioUnificar = System.currentTimeMillis();
		//Iterable<IEventoVehiculo> eventosOrdenados = centralVehiculos.unificarEventosRuta(vehiculo, ruta);
		//Long tiempoTotalBitacora = System.currentTimeMillis() - inicioUnificar;

		//imprimirDatos("Requerimiento 1", "Unificar bitacoras de ventos", tiempoTotalBitacora, eventosOrdenados);

		//Aqui se rectifica que hayan quedado en el orden correcto, mirando que los patrones
		//que hay sean detectados
		//Long inicioPatrones = System.currentTimeMillis();
		//Iterable<IEventoVehiculo> eventosSospechosos = centralVehiculos.darEventosSospechososPorPatron(vehiculo, ruta, eventosOrdenados);
		//Long tiempoTotalSospecha = System.currentTimeMillis() - inicioPatrones;

		//imprimirDatos("Requerimiento 2", "Recopilar eventos sucesivos sospechosos", tiempoTotalSospecha, eventosSospechosos);


		//TODO Creen 2 puntos, para formar un area, con ellos prueben los datos
		//IPunto surOeste = new Punto();
		//Sets para este punto
		//IPunto norEste = new Punto();
		//Sets para este punto

		//Long inicioCuadrante = System.currentTimeMillis();
		//Iterable<IEventoVehiculo> eventosArea = centralVehiculos.darEventosPorArea(surOeste, norEste,eventosOrdenados);
		//Long tiempoTotalArea = System.currentTimeMillis() - inicioCuadrante;

		//imprimirDatos("Requerimiento 3", "Recopilar eventos en la bitacora de un vehiculo", tiempoTotalArea, eventosArea);

		//Aqui se obtendra el vehiculo que mas reporta accidentes en todo el sistema
		//Long inicioAccidenteVehiculo = System.currentTimeMillis();
		//IVehiculo accidentado = centralVehiculos.buscarVehiculoMasAccidentado();
		//Long totalAccidenteVehiculo = System.currentTimeMillis() - inicioAccidenteVehiculo;

		//imprimirDatos("Requerimiento 4", "Busca el vehiculo mas accidentado", totalAccidenteVehiculo, accidentado);

		//Aqui se obtendra el segmento que mas reporta accidentes en todo el sistema
		//Long inicioAccidenteSegmento = System.currentTimeMillis();
		//ISegmento segmento = centralVehiculos.buscarSegmentoMasAccidentado();
		//Long totalAccidenteSegmento = System.currentTimeMillis() - inicioAccidenteSegmento;

		//imprimirDatos("Requerimiento 5", "Busca el segmento mas accidentado", totalAccidenteSegmento, segmento);


		//Aqui se obtendra la ruta que mas reporta accidentes en todo el sistema
		//Long inicioAccidenteRuta = System.currentTimeMillis();
		//IRuta rutaAccidentada = centralVehiculos.buscarRutaMasAccidentada();
		//Long totalAccidenteRuta = System.currentTimeMillis() - inicioAccidenteRuta;

		//imprimirDatos("Requerimiento 6", "Busca el vehiculo mas accidentado", totalAccidenteRuta, rutaAccidentada);

		//TODO Aqui se obtendra promedio de gasolina entre dos fechas
		//Construya dos fechas diferentes y las usa como parametro
		//Date fechaInicio = new Date();
		//Date fechaFin = new Date();
		//Long inicioGasolina = System.currentTimeMillis();
		//double gasolina = centralVehiculos.darPromedioConsumoCombustiblePorFechas(fechaInicio, fechaFin);
		//Long totalGasolina = System.currentTimeMillis() - inicioGasolina;

		//imprimirDatos("Requerimiento 7", "Busca el vehiculo mas accidentado", totalGasolina, gasolina);


	}

	private void imprimirDatos(String nombre, String descripcion, Long total, Object objeto) {
		if(objeto instanceof IVehiculo){
			System.out.println("Requerimiento: "+nombre);
			System.out.println("Descripcion: "+descripcion);
			System.out.println("TIEMPO DE EJECUCION: " + (total/1000) + " segundos");
			IVehiculo vehiculo = (IVehiculo) objeto;
			System.out.println(vehiculo);
		}
		else if(objeto instanceof IRuta){
			System.out.println("Requerimiento: "+nombre);
			System.out.println("Descripcion: "+descripcion);
			System.out.println("TIEMPO DE EJECUCION: " + (total/1000) + " segundos");
			IRuta ruta = (IRuta) objeto;
			System.out.println(ruta);
		}
		else if(objeto instanceof ISegmento){
			System.out.println("Requerimiento: "+nombre);
			System.out.println("Descripcion: "+descripcion);
			System.out.println("TIEMPO DE EJECUCION: " + (total/1000) + " segundos");
			ISegmento segmen = (ISegmento) objeto;
			System.out.println(segmen);
		}
		else if(objeto instanceof Iterable<?>){
			System.out.println("Requerimiento: "+nombre);
			System.out.println("Descripcion: "+descripcion);
			System.out.println("TIEMPO DE EJECUCION: " + (total/1000) + " segundos");
			Iterable<IEventoVehiculo> eventos = (Iterable<IEventoVehiculo>) objeto;
			for (IEventoVehiculo evento : eventos) {
				System.out.println(evento.getEstampillaTiempo() +" evento de tipo "+evento.getTipo());
			}
		}
		else if(objeto instanceof Double){
			System.out.println("Requerimiento: "+nombre);
			System.out.println("Descripcion: "+descripcion);
			System.out.println("TIEMPO DE EJECUCION: " + (total/1000) + " segundos");
			Double promedio = (Double) objeto;
			System.out.println("El promedio de gasolina usado fue: " +promedio);
		}
	}
}
