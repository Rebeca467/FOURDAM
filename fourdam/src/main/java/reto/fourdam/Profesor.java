/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto.fourdam;

/**
 *
 * @author DAM124
 */
public class Profesor extends Usuario implements ValorarTec {

    public Profesor(String nombre, String apellidos, String email, String cnna) {
        super(nombre, apellidos, email, cnna);
    }

    @Override
    public void valoracionRuta(Ruta ruta) {
        //sin hacer
    }

    @Override
    public void valoracionTecRuta(Object ruta) {
        //sin hacer
    }

    @Override
    public void resennaRuta(Ruta ruta) {
        //sin hacer
    }
    
}
