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
public class Docente {

    private String idDocente;
    private String nombreDocente;

    /**
     * @return the nombreDocente
     */
    public String getNombreDocente() {
        return nombreDocente;
    }

    /**
     * @return the idDocente
     */
    public String getIdDocente() {
        return idDocente;
    }

    /**
     * @param idDocente the idDocente to set
     */
    public void setIdDocente(String idDocente) {
        this.idDocente = idDocente;
    }

    /**
     * @param nombreDocente the nombreDocente to set
     */
    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

}
