/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.tecazuay.evaluacion.dto;

import java.util.Date;

/**
 *
 * @author juanurgiles
 */
public class Reporte2 {

    private String cedulaProfesor;
    private String nombreProfesor;
    private String ciclo;
    private String codigoMateria;
    private String descripcionMateria;
    private String nota;

    /**
     * @return the cedulaProfesor
     */
    public String getCedulaProfesor() {
        return cedulaProfesor;
    }

    /**
     * @return the nota
     */
    public String getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(String nota) {
        this.nota = nota;
    }

    /**
     * @return the descripcionMateria
     */
    public String getDescripcionMateria() {
        return descripcionMateria;
    }

    /**
     * @param descripcionMateria the descripcionMateria to set
     */
    public void setDescripcionMateria(String descripcionMateria) {
        this.descripcionMateria = descripcionMateria;
    }

    /**
     * @return the codigoMateria
     */
    public String getCodigoMateria() {
        return codigoMateria;
    }

    /**
     * @param codigoMateria the codigoMateria to set
     */
    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    /**
     * @return the nombreProfesor
     */
    public String getNombreProfesor() {
        return nombreProfesor;
    }

    /**
     * @param nombreProfesor the nombreProfesor to set
     */
    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    /**
     * @return the ciclo
     */
    public String getCiclo() {
        return ciclo;
    }

    /**
     * @param ciclo the ciclo to set
     */
    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    /**
     * @param cedulaProfesor the cedulaProfesor to set
     */
    public void setCedulaProfesor(String cedulaProfesor) {
        this.cedulaProfesor = cedulaProfesor;
    }

}
