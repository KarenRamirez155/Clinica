/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.PacienteModel;
import repositorio.PacienteRepositorio;

/**
 *
 * @author KAREN RAMIREZ
 */
public class Paciente implements PacienteRepositorio {


    ;
    @Override
    public ArrayList<PacienteModel> consultarPorMedico(String nombreMedico) {
            ArrayList<PacienteModel> pacientes = new PacienteModel().construirLista();
        ArrayList<PacienteModel> medico = new ArrayList<>();
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getMedico().equals(nombreMedico)) {
                medico.add(pacientes.get(i));
            }
        }
        return medico;
    }

    @Override
    public ArrayList<PacienteModel> consiltarPaciente(String nombrePaciente) {
            ArrayList<PacienteModel> pacientes = new PacienteModel().construirLista();

        ArrayList<PacienteModel> medico = new ArrayList<>();
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getNombre().equals(nombrePaciente)) {
                medico.add(pacientes.get(i));
            }
        }
        return medico;
    }

    @Override
    public ArrayList<PacienteModel> consiltarCentro(String nombreCentro) {
            ArrayList<PacienteModel> pacientes = new PacienteModel().construirLista();

        ArrayList<PacienteModel> medico = new ArrayList<>();
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getLugar().equals(nombreCentro)) {
                medico.add(pacientes.get(i));
            }
        }
        return medico;
    }

}
