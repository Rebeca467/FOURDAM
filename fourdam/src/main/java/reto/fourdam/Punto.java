/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto.fourdam;

/**
 *
 * @author DAM106
 */
public abstract class Punto {
    private double latitud;
    private double longitud;
    private String imagen;

    public Punto(double latitud, double longitud,  String imagen) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.imagen = imagen;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public String getImagen() {
        return imagen;
    }

    @Override
    public String toString() {
        return "Punto{" + "latitud=" + latitud + ", longitud=" + longitud + ", imagen=" + imagen + '}';
    }
}
