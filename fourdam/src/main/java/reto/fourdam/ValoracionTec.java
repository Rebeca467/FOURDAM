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
public class ValoracionTec {
    private Usuario usuario;
    private Ruta ruta;
    private LocalDate fecha;
    private int dificultad;
    private String equipoRecomendado;

    public ValoracionTec(Usuario usuario, Ruta ruta, LocalDate fecha, int dificultad, String equipoRecomendado) {
        this.usuario = usuario;
        this.ruta = ruta;
        this.fecha = fecha;
        this.dificultad = dificultad;
        this.equipoRecomendado = equipoRecomendado;
    }    
}
