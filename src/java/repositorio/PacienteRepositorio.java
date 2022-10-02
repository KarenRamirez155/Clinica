/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositorio;

import java.util.ArrayList;
import modelo.PacienteModel;

/**
 *
 * @author KAREN RAMIREZ
 */
public interface PacienteRepositorio {
    ArrayList<PacienteModel> consultarPorMedico(String nombreMedico);
    ArrayList<PacienteModel> consiltarPaciente (String nombrePaciente);
    ArrayList<PacienteModel> consiltarCentro (String nombreCentro);
}
