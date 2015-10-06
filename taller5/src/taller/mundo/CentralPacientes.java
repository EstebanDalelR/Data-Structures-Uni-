package taller.mundo;

import taller.estructuras.HeapSort;
import taller.estructuras.IMaxPQ;
import taller.estructuras.MaxHeapPQ;

import java.util.Arrays;

/**
 * Auto Generated Java Class.
 */

public class CentralPacientes {


  private IMaxPQ<Paciente> pacientes;

  public CentralPacientes() {

    pacientes = new MaxHeapPQ();

  }

  public void agregarPaciente(String nombre, int triage) {

    Paciente paciente = new Paciente(nombre, triage);
    pacientes.insert(paciente);

  }

  public Paciente atenderPacienteConMasUrgencia() {
    return pacientes.delMax();
  }

  public Paciente[] darPacientesEnOrden() {

    Paciente[] copiaPacientes = Arrays.copyOfRange(pacientes.getKeys(), 1, pacientes.size() + 1, Paciente[].class);
    HeapSort.sort(copiaPacientes);
    return copiaPacientes;

  }

}
