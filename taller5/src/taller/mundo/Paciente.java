/**
 * Auto Generated Java Class.
 */
package taller.mundo;

public class Paciente implements Comparable<Paciente> {
  
  private String nombre;
  private int triage;

  public Paciente(String nombre, int triage) {
    this.nombre = nombre;
    this.triage = triage;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getTriage() {
    return triage;
  }

  public void setTriage(int triage) {
    this.triage = triage;
  }

  public int compareTo(Paciente paciente) {
    return this.triage - paciente.triage;
  }
}
