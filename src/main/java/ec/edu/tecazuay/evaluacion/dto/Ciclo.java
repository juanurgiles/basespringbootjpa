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
public class Ciclo {

    private String idCiclo;
    private String nombreCiclo;

    /**
     * @return the idCiclo
     */
    public String getIdCiclo() {
        return idCiclo;
    }

    /**
     * @return the nombreCiclo
     */
    public String getNombreCiclo() {
        return nombreCiclo;
    }

    /**
     * @param nombreCiclo the nombreCiclo to set
     */
    public void setNombreCiclo(String nombreCiclo) {
        this.nombreCiclo = nombreCiclo;
    }

    /**
     * @param idCiclo the idCiclo to set
     */
    public void setIdCiclo(String idCiclo) {
        this.idCiclo = idCiclo;
    }

}
