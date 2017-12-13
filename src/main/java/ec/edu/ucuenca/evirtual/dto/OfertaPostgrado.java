/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ucuenca.evirtual.dto;

import java.util.Date;

/**
 *
 * @author juanurgiles
 */
public class OfertaPostgrado {

    private Long idDependencia;
    private String dependencia;
    private Long idCursoPosgrado;
    private String nombrePosgrado;
    private Long idEdicion;
    private String nombreEdicion;
    private String fechaAprobacion;
    private String fechaFin;
    private Integer duracion;
    private Long idNivelFormacion;
    private String nombreNivel;
    private String nivel;
    private String nroResolucion;
    private String observaciones;
    private String estaActivo;

    public Long getIdDependencia() {
        return idDependencia;
    }

    public void setIdDependencia(Long idDependencia) {
        this.idDependencia = idDependencia;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public Long getIdCursoPosgrado() {
        return idCursoPosgrado;
    }

    public void setIdCursoPosgrado(Long idCursoPosgrado) {
        this.idCursoPosgrado = idCursoPosgrado;
    }

    public String getNombrePosgrado() {
        return nombrePosgrado;
    }

    public void setNombrePosgrado(String nombrePosgrado) {
        this.nombrePosgrado = nombrePosgrado;
    }

    public Long getIdEdicion() {
        return idEdicion;
    }

    public void setIdEdicion(Long idEdicion) {
        this.idEdicion = idEdicion;
    }

    public String getNombreEdicion() {
        return nombreEdicion;
    }

    public void setNombreEdicion(String nombreEdicion) {
        this.nombreEdicion = nombreEdicion;
    }

    public String getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(String fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Long getIdNivelFormacion() {
        return idNivelFormacion;
    }

    public void setIdNivelFormacion(Long idNivelFormacion) {
        this.idNivelFormacion = idNivelFormacion;
    }

    public String getNombreNivel() {
        return nombreNivel;
    }

    public void setNombreNivel(String nombreNivel) {
        this.nombreNivel = nombreNivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNroResolucion() {
        return nroResolucion;
    }

    public void setNroResolucion(String nroResolucion) {
        this.nroResolucion = nroResolucion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstaActivo() {
        return estaActivo;
    }

    public void setEstaActivo(String estaActivo) {
        this.estaActivo = estaActivo;
    }

}
