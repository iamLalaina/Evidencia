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
public class Book {
    private Medico[] medicos;
    private Paciente[] pacientes;
    private Cita[] citas;
    
    public Book(){
        
        this.medicos = new Medico[10];
        this.pacientes = new Paciente[10];
        this.citas = new Cita[10];
    }
    
    public Book(int tamanio){
        
        this.medicos = new Medico[tamanio];
        this.pacientes = new Paciente[tamanio];
        this.citas = new Cita[tamanio];
    }
   
    //MEDICOS
    public void agregarMedico(Medico med){
        
        if(existeMedico(med)){
            System.out.println("El contacto ya existe :|");
        }else if(capacidadMedico()){
            System.out.println("Book ya no tiene espacio :c");
        }else{
            boolean encontrado = false;
        for(int i=0;i<medicos.length && !encontrado;i++){
        if(medicos[i]==null){
            medicos[i]=med;
            encontrado=true;
        }
    }
        if(encontrado){
            System.out.println("Se agregó el medico.");
        }else {
            System.out.println("No se agregó el medico :c");
        }
        }
        
        
    }
    
    //PACIENTES
    public void agregarPaciente(Paciente pac){
        
        if(existePaciente(pac)){
            System.out.println("El contacto ya existe :|");
        }else if(capacidadPaciente()){
            System.out.println("Book ya no tiene espacio :c");
        }else{
            boolean encontrado = false;
        for(int i=0;i<pacientes.length && !encontrado;i++){
        if(pacientes[i]==null){
            pacientes[i]=pac;
            encontrado=true;
        }
    }
        if(encontrado){
            System.out.println("Se agregó el paciente.");
        }else {
            System.out.println("No se agregó el paciente :c");
        }
        }
        
        
    }
    
    //CITA
    public void agregarCita(Cita cit){
        
        if(existeCita(cit)){
            System.out.println("El contacto ya existe :|");
        }else if(capacidadCita()){
            System.out.println("Book ya no tiene espacio :c");
        }else{
            boolean encontrado = false;
        for(int i=0;i<citas.length && !encontrado;i++){
        if(citas[i]==null){
            citas[i]=cit;
            encontrado=true;
        }
    }
        if(encontrado){
            System.out.println("Se agregó la cita.");
        }else {
            System.out.println("No se agregó la cita :c");
        }
        }
        
        
    }
    
    
    //MEDICO
    public boolean existeMedico(Medico med){
        for(int i=0;i<medicos.length;i++){
            if(medicos[i]!=null && med.equals(medicos[i])){
                return true;
            }
        }
        return false;
    }
    
    //PACIENTE
    public boolean existePaciente(Paciente pac){
        for(int i=0;i<pacientes.length;i++){
            if(pacientes[i]!=null && pac.equals(pacientes[i])){
                return true;
            }
        }
        return false;
    }
    
    //CITA
    public boolean existeCita(Cita cit){
        for(int i=0;i<citas.length;i++){
            if(citas[i]!=null && cit.equals(citas[i])){
                return true;
            }
        }
        return false;
    }
    
    
    //MEDICO
    public void verMedico(){
        if(espacioVacioM()==medicos.length){
            System.out.println("No hay medicos que mostrar");
        }else {
            for(int i=0;i<medicos.length;i++){
            if(medicos[i]!=null){
                System.out.println(medicos[i]);
            }
        }
        }
        
    }
    
    //PACIENTE
    public void verPaciente(){
        if(espacioVacioP()==pacientes.length){
            System.out.println("No hay pacientes que mostrar");
        }else {
            for(int i=0;i<pacientes.length;i++){
            if(pacientes[i]!=null){
                System.out.println(pacientes[i]);
            }
        }
        }
        
    }
    
    //CITA
    public void verCita(){
        if(espacioVacioC()==citas.length){
            System.out.println("No hay citas que mostrar");
        }else {
            for(int i=0;i<citas.length;i++){
            if(citas[i]!=null){
                System.out.println(citas[i]);
            }
        }
        }
        
    }
    
    
    
   
    //MEDICO
    public void buscarMedicoN (String nombre){
        boolean encontrado = false;
        for(int i=0;i<medicos.length && !encontrado;i++){
            if(medicos[i]!=null && medicos[i].getNombre().equalsIgnoreCase(nombre)){
                System.out.println("El ID es: " + medicos[i].getIdM());
                System.out.println("Sus citas son " );
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("No se encontró el medico que busca :c");
        }
    }
    
    //PACIENTE
    public void buscarPacienteN (String nombre){
        boolean encontrado = false;
        for(int i=0;i<pacientes.length && !encontrado;i++){
            if(pacientes[i]!=null && pacientes[i].getNombre().equalsIgnoreCase(nombre)){
                System.out.println("El ID es: " + pacientes[i].getIdP());
                System.out.println("Sus citas son " );
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("No se encontró el paciente que busca :c");
        }
    }
    
    
    //CITA
    public void buscarCitaN (String nombreCita){
        boolean encontrado = false;
        for(int i=0;i<citas.length && !encontrado;i++){
            if(citas[i]!=null && citas[i].getNombreCita().equalsIgnoreCase(nombreCita)){
                System.out.println("El ID es: " + citas[i].getIdC());
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("No se encontró la cita que busca :c");
        }
    }
    
 
    
    
    
    //MEDICO
    public boolean capacidadMedico(){
        for(int i=0;i<medicos.length;i++){
            if(medicos[i]==null){
                return false;
            }
        }
        return true;
    }
    
    //PACIENTE
    public boolean capacidadPaciente(){
        for(int i=0;i<pacientes.length;i++){
            if(pacientes[i]==null){
                return false;
            }
        }
        return true;
    }
    
    //CITA
    public boolean capacidadCita(){
        for(int i=0;i<citas.length;i++){
            if(citas[i]==null){
                return false;
            }
        }
        return true;
    }
    
    
    //MEDICO
    public void eliminarMedico(Medico med){
        boolean encontrado = false;
        for(int i=0;i<medicos.length && !encontrado;i++){
            if(medicos[i]!=null && medicos[i].equals(med)){
                medicos[i]= null;
                encontrado=true;
            }
        }
        if(encontrado){
            System.out.println("Se eliminó exitosamente!");
        }else {
            System.out.println("No se eliminó el contacto :c");
        }
    }
    
    //PACIENTE
    public void eliminarPaciente(Paciente pac){
        boolean encontrado = false;
        for(int i=0;i<pacientes.length && !encontrado;i++){
            if(pacientes[i]!=null && pacientes[i].equals(pac)){
                pacientes[i]= null;
                encontrado=true;
            }
        }
        if(encontrado){
            System.out.println("Se eliminó exitosamente!");
        }else {
            System.out.println("No se eliminó el paciente :c");
        }
    }
    
    //CITAS
    public void eliminarCita(Cita cit){
        boolean encontrado = false;
        for(int i=0;i<citas.length && !encontrado;i++){
            if(citas[i]!=null && citas[i].equals(cit)){
                citas[i]= null;
                encontrado=true;
            }
        }
        if(encontrado){
            System.out.println("Se eliminó exitosamente!");
        }else {
            System.out.println("No se eliminó la cita :c");
        }
    }
    
    
    
    //MEDICO
    public int espacioVacioM(){
        int contadorVacio=0;
        for(int i=0;i<medicos.length;i++){
            if(medicos[i]==null){
                contadorVacio++;
            }
        }
        return contadorVacio;
    }
    
    //PACIENTE
    public int espacioVacioP(){
        int contadorVacio=0;
        for(int i=0;i<pacientes.length;i++){
            if(pacientes[i]==null){
                contadorVacio++;
            }
        }
        return contadorVacio;
    }
    
     //CITA
    public int espacioVacioC(){
        int contadorVacio=0;
        for(int i=0;i<citas.length;i++){
            if(citas[i]==null){
                contadorVacio++;
            }
        }
        return contadorVacio;
    }
    
}
