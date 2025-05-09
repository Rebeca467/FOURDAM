/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto.fourdam;

import java.time.LocalDate;

/**
 *
 * @author DAM124
 */
public class Valoracion {
    private Usuario usuario;
    private Ruta ruta;
    private LocalDate fecha;
    private int dificultad;
    private int belleza;
    private int interesCultural;

    public Valoracion(Usuario usuario, Ruta ruta, LocalDate fecha, int dificultad, int belleza, int interesCultural) {
        this.usuario = usuario;
        this.ruta = ruta;
        this.fecha = fecha;
        this.dificultad = dificultad;
        this.belleza = belleza;
        this.interesCultural = interesCultural;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public int getBelleza() {
        return belleza;
    }

    public void setBelleza(int belleza) {
        this.belleza = belleza;
    }

    public int getInteresCultural() {
        return interesCultural;
    }

    public void setInteresCultural(int interesCultural) {
        this.interesCultural = interesCultural;
    }
    
    
}
