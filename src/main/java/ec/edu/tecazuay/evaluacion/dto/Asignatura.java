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
public class Asignatura {

    private String idAsignatura;
    private String nombreAsignatura;

    /**
     * @return the idAsignatura
     */
    public String getIdAsignatura() {
        return idAsignatura;
    }

    /**
     * @return the nombreAsignatura
     */
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    /**
     * @param nombreAsignatura the nombreAsignatura to set
     */
    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    /**
     * @param idAsignatura the idAsignatura to set
     */
    public void setIdAsignatura(String idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

}
