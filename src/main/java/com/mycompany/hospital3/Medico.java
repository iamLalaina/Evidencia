/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hospital3;

/**
 *
 * @author Liliana
 */
public class Medico {
    private int idm, id;
    private String nombre, especialidad, nombre2, especialidad2;
    
    public Medico(int idm, String nombre, String especialidad) {
        this.idm = idm;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    
    public Medico(String nombre) {
        this.idm = 0;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    
    public int getIdM(){
        return idm;
    }
    public void setIdM(int idm){
        this.idm = idm;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getespecialidad(){
        return especialidad;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    
    public boolean equals(Medico med){
        if(this.nombre.equalsIgnoreCase(med.getNombre())){
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

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getEspecialidad2() {
        return especialidad2;
    }

    public void setEspecialida2(String especialidad2) {
        this.especialidad2 = especialidad2;
    }
    
    @Override
    public String toString(){
        return idm + "," + nombre + "," + especialidad;
    }
}
