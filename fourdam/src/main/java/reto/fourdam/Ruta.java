/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto.fourdam;

import ENUMs.ClasificacionRuta;
import ENUMs.Estado;
import ENUMs.Temporada;
import ENUMs.TipoActividad;
import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author DAM124
 */
public class Ruta {
    private Usuario autor;
    private String nombre;
    private LocalDate fecha_creacion;
    private PuntoInteres punto_ini;
    private PuntoInteres punto_fin;
    private float distanciaTotal;
    private LocalTime duracion;
    private float desnivel;
    private float altMax;
    private float altMin;
    private ClasificacionRuta clasificacion;//Enum - Circular,Lineal -
    private int nivelRiesgo;
    private int nivelEsfuerzo;
    private int tipoTerreno;
    private int indicaciones;
    private TipoActividad tipoActividad;//Enum
    private Temporada temporada;//Enum - Primavera,Verano,Otoño,Invierno -
    private boolean accesibilidad;
    private boolean familiar;
    private String url;
    private Estado estado;//Enum
    private String recomendaciones;
    private String zonaGeografica;
    private File puntosIntermedios;
}
