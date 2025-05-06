/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto.fourdam;

import ENUMs.ClasificacionRuta;
import ENUMs.Estado;
import ENUMs.Temporada;
import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author DAM124
 */
public class Ruta {
    private int id;
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
    private String tipoActividad;//Enum
    private Temporada temporada;//Enum - Primavera,Verano,Otoño,Invierno -
    private boolean accesibilidad;
    private boolean familiar;
    private String url;
    private Estado estado;//Enum
    private String recomendaciones;
    private String zonaGeografica;
    private File puntosIntermedios;

    public Ruta(int id, Usuario autor, String nombre, LocalDate fecha_creacion, PuntoInteres punto_ini, PuntoInteres punto_fin, float distanciaTotal, LocalTime duracion, float desnivel, float altMax, float altMin, ClasificacionRuta clasificacion, int nivelRiesgo, int nivelEsfuerzo, int tipoTerreno, int indicaciones, String tipoActividad, Temporada temporada, boolean accesibilidad, boolean familiar, String url, Estado estado, String recomendaciones, String zonaGeografica, File puntosIntermedios) {
        this.id = id;
        this.autor = autor;
        this.nombre = nombre;
        this.fecha_creacion = fecha_creacion;
        this.punto_ini = punto_ini;
        this.punto_fin = punto_fin;
        this.distanciaTotal = distanciaTotal;
        this.duracion = duracion;
        this.desnivel = desnivel;
        this.altMax = altMax;
        this.altMin = altMin;
        this.clasificacion = clasificacion;
        this.nivelRiesgo = nivelRiesgo;
        this.nivelEsfuerzo = nivelEsfuerzo;
        this.tipoTerreno = tipoTerreno;
        this.indicaciones = indicaciones;
        this.tipoActividad = tipoActividad;
        this.temporada = temporada;
        this.accesibilidad = accesibilidad;
        this.familiar = familiar;
        this.url = url;
        this.estado = estado;
        this.recomendaciones = recomendaciones;
        this.zonaGeografica = zonaGeografica;
        this.puntosIntermedios = puntosIntermedios;
    }

    
    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDate fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public PuntoInteres getPunto_ini() {
        return punto_ini;
    }

    public void setPunto_ini(PuntoInteres punto_ini) {
        this.punto_ini = punto_ini;
    }

    public PuntoInteres getPunto_fin() {
        return punto_fin;
    }

    public void setPunto_fin(PuntoInteres punto_fin) {
        this.punto_fin = punto_fin;
    }

    public float getDistanciaTotal() {
        return distanciaTotal;
    }

    public void setDistanciaTotal(float distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }

    public LocalTime getDuracion() {
        return duracion;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }

    public float getDesnivel() {
        return desnivel;
    }

    public void setDesnivel(float desnivel) {
        this.desnivel = desnivel;
    }

    public float getAltMax() {
        return altMax;
    }

    public void setAltMax(float altMax) {
        this.altMax = altMax;
    }

    public float getAltMin() {
        return altMin;
    }

    public void setAltMin(float altMin) {
        this.altMin = altMin;
    }

    public ClasificacionRuta getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(ClasificacionRuta clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getNivelRiesgo() {
        return nivelRiesgo;
    }

    public void setNivelRiesgo(int nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
    }

    public int getNivelEsfuerzo() {
        return nivelEsfuerzo;
    }

    public void setNivelEsfuerzo(int nivelEsfuerzo) {
        this.nivelEsfuerzo = nivelEsfuerzo;
    }

    public int getTipoTerreno() {
        return tipoTerreno;
    }

    public void setTipoTerreno(int tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }

    public int getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(int indicaciones) {
        this.indicaciones = indicaciones;
    }

    public String getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(String tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public Temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }

    public boolean isAccesibilidad() {
        return accesibilidad;
    }

    public void setAccesibilidad(boolean accesibilidad) {
        this.accesibilidad = accesibilidad;
    }

    public boolean isFamiliar() {
        return familiar;
    }

    public void setFamiliar(boolean familiar) {
        this.familiar = familiar;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public String getZonaGeografica() {
        return zonaGeografica;
    }

    public void setZonaGeografica(String zonaGeografica) {
        this.zonaGeografica = zonaGeografica;
    }

    public File getPuntosIntermedios() {
        return puntosIntermedios;
    }

    public void setPuntosIntermedios(File puntosIntermedios) {
        this.puntosIntermedios = puntosIntermedios;
    }
    
    
}
