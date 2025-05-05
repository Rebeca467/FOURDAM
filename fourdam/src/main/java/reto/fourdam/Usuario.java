/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto.fourdam;

import ENUMs.TipoUsuario;

/**
 *
 * @author DAM120
 */
public class Usuario {
    private String correo;
    private String contraseña;
    private TipoUsuario rol;

    public Usuario(String correo, String contraseña) {
        this.correo = correo;
        this.contraseña = contraseña;
        if(correo.equals("alumno")){
           this.rol =TipoUsuario.ALUMNO; 
        }
        if(correo.equals("DiseñadorRutas")){
           this.rol =TipoUsuario.DISENADOR_DE_RUTAS; 
        }
        if(correo.equals("admin")){
           this.rol =TipoUsuario.ADMINISTRADOR; 
        }
        if(correo.equals("profesor")){
           this.rol =TipoUsuario.PROFESOR; 
        }  
    }
    public Usuario(){
        this.correo="invitado";
        this.contraseña="";
        this.rol=TipoUsuario.INVITADO;
    }
    
    
}
