
import controlador.Paciente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author KAREN RAMIREZ
 */
public class Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paciente p1 = new Paciente();
        System.out.println(p1.consultarPorMedico("Pedro").toString());
    }
    
}
