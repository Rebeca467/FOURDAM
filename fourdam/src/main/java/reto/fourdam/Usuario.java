/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto.fourdam;

/**
 *
 * @author DAM124
 */
public abstract class Usuario implements Valorar<Ruta>,Resennar<Ruta>{
    private String nombre;
    private String apellidos;
    private String email;
    private String cnna;

    public Usuario(String nombre, String apellidos, String email, String cnna) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.cnna = cnna;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + '}';
    }
}
