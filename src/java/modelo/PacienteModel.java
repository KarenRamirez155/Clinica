/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author KAREN RAMIREZ
 */
public class PacienteModel {
    
    private int codigo;
    private String nombre;
    private String sexo;
    private String direccion;
    private String lugar;
    private String motivoConsulta;
    private String medico;
    private Date fecha;
    
      public PacienteModel() {
    }

    public PacienteModel(int codigo, String nombre, String sexo, String direccion, String lugar, String motivoConsulta, String medico, Date fecha) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sexo = sexo;
        this.direccion = direccion;
        this.lugar = lugar;
        this.motivoConsulta = motivoConsulta;
        this.medico = medico;
        this.fecha = fecha;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the lugar
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * @param lugar the lugar to set
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * @return the motivoConsulta
     */
    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    /**
     * @param motivoConsulta the motivoConsulta to set
     */
    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    /**
     * @return the medico
     */
    public String getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(String medico) {
        this.medico = medico;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
   public ArrayList<PacienteModel> construirLista(){
        ArrayList<PacienteModel> lista=new ArrayList<>();
        PacienteModel paciente1 = new PacienteModel(01, "Patricia", "Femenino","Bogotá", "San Rafael1", "Dolor", "Pedro", new Date());
        PacienteModel paciente2 = new PacienteModel(02, "Pedro", "Masculina", "Facatativá", "San Rafael2", "Dolor", "Antonio", new Date());
        PacienteModel paciente3 = new PacienteModel(03, "Cecilia", "Femenino", "Bogotá", "San Rafael3", "Dolor", "Fracisco", new Date());
        PacienteModel paciente4 = new PacienteModel(04, "Rafael","Masculino", "Facactativá", "San Isidro", "Dolor", "Hernando", new Date());
        PacienteModel paciente5 = new PacienteModel(05, "Martha","Femenino", "Santa Fe", "San Benito", "Dolor", "Juan",new Date());
          lista.add(paciente1);
          lista.add(paciente2);
          lista.add(paciente3);
          lista.add(paciente4);
          lista.add(paciente5);
        return lista;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

 
    
    
}
