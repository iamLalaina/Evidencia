/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hospital3;
import java.util.Date;
/**
 *
 * @author Liliana
 */
public class Cita {
    private Integer idc, id;
    private String nombreCita, nombreCita2;
    private String fecha, fecha2;
    private Medico medico, medico2;
    private Paciente paciente, paciente2;
    
    //private String motivo;
    
    /*public Cita(int idc, String nombreCita, String fecha, Medico medico, Paciente paciente) {*/
    public Cita(int idc, String nombreCita, String fecha) {
        this.idc = idc;
        this.nombreCita = nombreCita;
        this.fecha = fecha;
        this.paciente = paciente;
        this.medico = medico;
    }
    
    public Cita(String nombreCita) {
        this.idc = 0;
        this.nombreCita = nombreCita;
        this.fecha = fecha;
        this.paciente = paciente;
        this.medico = medico;
    }

    /*Cita(int idc, String nombreCita, String fecha, String paciente, String medico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
    public int getIdC(){
        return idc;
    }
    public void setIdC(int idc){
        this.idc = idc;
    }
    
    public String getNombreCita(){
        return nombreCita;
    }
    public void setNombreCita(String nombreCita){
        this.nombreCita = nombreCita;
    }
    
    
    
    
    
    
    //----------------------------
    
    
    /*public Integer getIdC() {
        return idc;
    }

    public void setIdC(Integer idc) {
        this.idc = idc;
    }

    public String getNombreCita() {
        return nombreCita;
    }

    public void setNombreCita(String nombreCita) {
        this.nombreCita = nombreCita;
    }*/

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public boolean equals(Cita cit){
        if(this.nombreCita.equalsIgnoreCase(cit.getNombreCita())) {
            return true;
        }
        return false;
    }
    
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCita2() {
        return nombreCita2;
    }

    public void setNombreCita2(String nombreCita2) {
        this.nombreCita2 = nombreCita2;
    }

    public String getFecha2() {
        return fecha2;
    }

    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }

    public Medico getMedico2() {
        return medico2;
    }

    public void setMedico2(Medico medico2) {
        this.medico2 = medico2;
    }

    public Paciente getPaciente2() {
        return paciente2;
    }

    public void setPaciente2(Paciente paciente2) {
        this.paciente2 = paciente2;
    }
    
    
    
    
    @Override
    public String toString(){
        return idc + "," + nombreCita + "," + fecha;
    }
    
    /*@Override
    public String toString(){
        return idc + "," + nombreCita + "," + fecha + "," + paciente + "," + medico;
    }*/
    
}
