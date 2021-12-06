/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hospital3;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Date;
import java.util.List;
import java.awt.SystemColor;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 *
 * @author Liliana
 */
public class Main {
    public static List<Usuario> usuarios;
    
    public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        boolean salir = false;
        int opcion;
        //Usuario us;
        Medico med;
        Paciente pac;
        Cita cit;
       
        
        Book libroRegistro = new Book(5);
        int numero, idm, idp, idc;
        String nombre, esp, nombreCita, fecha, paciente, medico;
        
        boolean existeUsuario;
        String usuario = "";
        String contrasena = "";
        Scanner credenciales = new Scanner(System.in);
        System.out.println("Cargando sistema... ");
        cargarUsuarios();
        System.out.println("Inicio de sesion:");
        System.out.println("Usuario:");
        usuario = credenciales.nextLine();
        System.out.println("Contraseña");
        contrasena = credenciales.nextLine();
        existeUsuario = validarCredenciales(usuario, contrasena);
        if (existeUsuario) {
            System.out.println("existe el usuario");
            //menu();
            
            while (!salir){
            System.out.println("1.-Dar de alta a medico\n"
                + "2.-Dar de alta a un paciente\n"
                + "3.Crear una cita\n"
                + "4.Ver las citas de todos los medicos\n"
                + "5.-Ver las citas por nombre del medico\n"
                + "6.-Ver las citas por nombre del paciente\n"
                + "7.-Guardar cita\n"
                + "8. Salir");
            
            
            /*Cita cita = new Cita();
        Medico medico = new Medico();
        Paciente paciente = new Paciente();
   med.setId(1);
        med.setNombre2("Juan");
        med.setEspecialida2("General");
        pac.setId(1);
        pac.setNombre("Jose");
        cit.setId(1);
        cit.setNombreCita2("Cita numero 1");
        cit.setMedico(med);
        cit.setPaciente(pac);
        cit.setFecha2("05/12/2021");
        save(cit);*/
            
            try {
                System.out.println("Elige una opción");
                opcion = sn.nextInt();
                
                switch (opcion) {
                    case 1:
                        System.out.println("DAR DE ALTA A MEDICO: ");
                        System.out.println("Escribe el nombre: ");
                        nombre = sn.next();
                        System.out.println("Escribe el ID: ");
                        idm = sn.nextInt();
                        System.out.println("Escribe la especialidad: ");
                        esp = sn.next();
                        med = new Medico(idm, nombre, esp);
                        libroRegistro.agregarMedico(med);
                        libroRegistro.verMedico();
                        break;
                    case 2:
                        System.out.println("DAR DE ALTA A PACIENTE: ");
                        System.out.println("Escribe el nombre: ");
                        nombre = sn.next();
                        System.out.println("Escribe el ID: ");
                        idp = sn.nextInt();
                        pac = new Paciente(idp, nombre);
                        libroRegistro.agregarPaciente(pac);
                        libroRegistro.verPaciente();
                        break;
                    case 3:
                        System.out.println("CREAR UNA CITA: ");
                        System.out.println("Escribe el nombre: ");
                        nombreCita = sn.next();
                        System.out.println("Escribe el ID: ");
                        idc = sn.nextInt();
                        System.out.println("Escribe la fecha: ");
                        fecha = sn.next();
                        /*System.out.println("Escribe el nombre del paciente: ");
                        paciente = sn.next();
                        System.out.println("Escribe el nombre del medico: ");
                        medico = sn.next();*/
                        //cit = new Cita(idc, nombreCita, fecha, paciente, medico);
                        cit = new Cita(idc, nombreCita, fecha);
                        
                        libroRegistro.agregarCita(cit);
                        libroRegistro.verCita();
                        //libroRegistro.buscarCitaN(nombreCita);
                        
                        //Cita cit = new Cita();
                        //Medico med = new Medico();
                        //Paciente pac = new Paciente();
                        /*med.setId(1);
                        med.setNombre2("Juan");
                        med.setEspecialida2("General");
                        pac.setId(1);
                        pac.setNombre("Jose");
                        cit.setId(1);
                        cit.setNombreCita2("Cita numero 1");
                        cit.setMedico(med);
                        cit.setPaciente(pac);
                        cit.setFecha2("05/12/2021");
                        save(cit);*/
                        
                        break;
                    case 4:
                        System.out.println("VER LAS CITAS DE TODOS LOS MEDICOS: ");
                        libroRegistro.verCita();
                        //System.out.println("Escribe el nombre: ");
                        //nombre = sn.next();
                        //med = new Medico(0, nombre);
                        //if(libroRegistro.existeMedico(med)){
                            //System.out.println("Existe el medico!");
                       // }else {
                          //  System.out.println("No existe el medico!");
                       // }
                        break;
                    case 5:
                        System.out.println("VER CITAS POR NOMBRE DE MEDICO: ");
                        System.out.println("Escribe el nombre del medico: ");
                        nombre = sn.next();
                        libroRegistro.buscarMedicoN(nombre);
                        //libroRegistro.verCita();
                        //med = new Medico(0, nombre);
                        //libroRegistro.eliminarMedico(med);
                        break;
                    case 6:
                        System.out.println("VER CITAS POR NOMBRE DE PACIENTE: ");
                        System.out.println("Escribe el nombre del paciente: ");
                        nombre = sn.next();
                        libroRegistro.buscarPacienteN(nombre);
                        //System.out.println("Hay "+libroRegistro.espacioVacio()+" usuarios vacios");
                        break;
                    case 7:
                        System.out.println("GUARDAR CITA ");
                        /*if(libroRegistro.capacidadUsuarios()){
                            System.out.println("La AddressBook esta completa");
                        }else {
                            System.out.println("Aún puedes agregar :D");
                        }*/
                   
        
        load();
                            
                        break;
                    case 8:
                        System.out.println("SALIR: ");
                        salir = true;
                        break;
                    default:
                        System.out.println("Opciones permitidas entre 1 y 8");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresa un número");
                sn.next();
            }
        }
            
            

        } else {
            System.out.println("el usuario no existe");
        }

    }

    public static void cargarUsuarios() {

        if (usuarios == null) {
            usuarios = new ArrayList<>();
        }

        usuarios.add(new Usuario(1, "isabella", "1234"));
        usuarios.add(new Usuario(2, "emilio", "1234")
        );
        System.out.println("Los usuarios han sido cargados: " + usuarios.size());

    }

    public static boolean validarCredenciales(String usuario, String contrasena) {
        return usuarios.stream().anyMatch(x -> x.getNombre().equals(usuario) && x.getContrasena().equals(contrasena));
    }
        
    public static void save(Cita cit) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(cit);
            System.out.println(json);
        } catch (Exception e) {
            System.out.println("Error->" + e.getMessage());
        }

        /*Guardar variable*/
    }
    
    
        public static void load() {
        String json = "{\"id\":1,\"nombreCita\":\"Cita numero 1\",\"fecha\":\"24/11/2021\",\"medico\":{\"id\":1,\"nombre\":\"Carlos\",\"especialida\":\"General\"},\"paciente\":{\"id\":1,\"nombre\":\"Maria\"}}";
        System.out.println("load " + json);
        Gson gson = new Gson();
        Cita cit = gson.fromJson(json, Cita.class);

        System.out.println("nombre del paciente:" + cit.getPaciente().getNombre());
    }
        
        
}
