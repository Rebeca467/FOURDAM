/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto.fourdam;

import ENUMs.TipoUsuario;

/**
 *
 * @author DAM124
 */
public class Usuario{
    private String nombre;
    private String apellidos;
    private String email;
    private String cnna;
    private TipoUsuario rol;

    public Usuario(String nombre, String apellidos, String email, String cnna,TipoUsuario rol) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.cnna = cnna;
        this.rol= rol;

    }
    public Usuario() {
        this.nombre ="Invitado";
        this.apellidos = "";
        this.email = "";
        this.cnna = "";
        this.rol = TipoUsuario.INVITADO;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoUsuario getRol() {
        return rol;
    }
    

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + '}';
    }
}
