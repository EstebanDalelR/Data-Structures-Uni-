/*
 * CentralPacienteCLI.java
 * This file is part of ISIS1206
 *
 * Copyright (C) 2015 - ISIS1206 Team
*/
package taller.interfaz;

import java.util.Scanner;
import taller.mundo.*;

public class CentralPacientesCLI
{

    private CentralPacientes centralPacientes;

    private Scanner in;

    public CentralPacientesCLI() {
        centralPacientes = new CentralPacientes();
        in = new Scanner(System.in);
    }

    public void mainMenu() throws InterruptedException {
        boolean finish = false;
        while (!finish) {
            Screen.clear();
            System.out.println("------------------------------------------");
            System.out.println("-                                        -");
            System.out.println("-    Clinica de Pacientes                -");
            System.out.println("-                                        -");
            System.out.println("------------------------------------------");
            System.out.println("Bienvenido a la Clinica de Pacientes\n");

            System.out.println("Menú principal:");
            System.out.println("-----------------");
            System.out.println("1. Agregar un paciente nuevo a la lista de espera");
            System.out.println("2. Atender al paciente con más urgencia");
            System.out.println("3. Ver todos los pacientes en orden a atender");
            System.out.println("4. Salir");
            System.out.print("\nSeleccione una opción: ");
            int opt1 = in.nextInt();
            in.nextLine();
            switch (opt1) {
                case 1:
                    agregarPaciente();
                    break;
                case 2:
                    atenderPacienteConMasUrgencia();
                    break;
                case 3:
                    darPacientesEnOrden();
                    break;
                case 4:
                    finish = true;
                    break;
                default:
                    break;
            }
        }
    }

    private void agregarPaciente() throws InterruptedException {
        boolean finish = false;
        while (!finish) {
            Screen.clear();
            System.out.println("Agregar un paciente nuevo a la lista de espera");
            System.out.println("----------------------------------");
            System.out.println("Ingrese el nombre del paciente:");
            String nombre = in.nextLine();
            System.out.println("Ingrese el triage del paciente con respecto a una de las siguientes opciones:");
            System.out.println("5. Resureccion");
            System.out.println("4. Emergencia");
            System.out.println("3. Urgente");
            System.out.println("2. Menos urgente");
            System.out.println("1. No urgente");
            int triage = in.nextInt();
            if(triage < 1 || triage > 5) {
                break;
            }
            centralPacientes.agregarPaciente(nombre, triage);
            System.out.println("Se agregó al paciente llamando " + nombre + " a la lista de espera");
            finish = true;
        }

    }

    private void atenderPacienteConMasUrgencia() throws InterruptedException {
        System.out.println("Atender al paciente con más urgencia");
        System.out.println("----------------------------------");
        Paciente paciente = centralPacientes.atenderPacienteConMasUrgencia();
        System.out.println("Se atendió al paciente llamado "+paciente.getNombre());
        Thread.sleep(3000);
    }

    private void darPacientesEnOrden() throws InterruptedException {
        System.out.println("Ver todos los pacientes en orden a atender");
        Paciente[] pacientes = centralPacientes.darPacientesEnOrden();
        for(Paciente paciente : pacientes)
            System.out.println("Nombre del paciente: "+paciente.getNombre()+" | Triage del paciente: "+paciente.getTriage());
        Thread.sleep(3000);
    }

}