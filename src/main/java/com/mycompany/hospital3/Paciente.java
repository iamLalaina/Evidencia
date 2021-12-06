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
public class Paciente {
    private int idp, id;
    private String nombre, nombre2;
    
    public Paciente(int idp, String nombre) {
        this.idp = idp;
        this.nombre = nombre;
    }
    
    public Paciente(String nombre) {
        this.idp = 0;
        this.nombre = nombre;
    }
    
    public int getIdP(){
        return idp;
    }
    public void setIdP(int idm){
        this.idp = idp;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public boolean equals(Paciente pac){
        if(this.nombre.equalsIgnoreCase(pac.getNombre())){
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        return idp + "," + nombre;
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

    public void setNombre2(String nombre) {
        this.nombre2 = nombre2;
    }
    
    
    
}

