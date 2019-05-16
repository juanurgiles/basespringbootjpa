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
public class Carrera {

    private String idCarrera;
    private String nombreCarrera;

    /**
     * @return the nombreCarrera
     */
    public String getNombreCarrera() {
        return nombreCarrera;
    }

    /**
     * @return the idCarrera
     */
    public String getIdCarrera() {
        return idCarrera;
    }

    /**
     * @param idCarrera the idCarrera to set
     */
    public void setIdCarrera(String idCarrera) {
        this.idCarrera = idCarrera;
    }

    /**
     * @param nombreCarrera the nombreCarrera to set
     */
    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

}
