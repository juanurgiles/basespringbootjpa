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
public class Reporte1 {

    private String nombreAmbito;
    private String descripcionAmbito;
    private String codigoPregunta;
    private String descripcionPregunta;
    private String notaPonderada;

    /**
     * @return the nombreAmbito
     */
    public String getNombreAmbito() {
        return nombreAmbito;
    }

    /**
     * @return the notaPonderada
     */
    public String getNotaPonderada() {
        return notaPonderada;
    }

    /**
     * @param notaPonderada the notaPonderada to set
     */
    public void setNotaPonderada(String notaPonderada) {
        this.notaPonderada = notaPonderada;
    }

    /**
     * @return the descripcionPregunta
     */
    public String getDescripcionPregunta() {
        return descripcionPregunta;
    }

    /**
     * @param descripcionPregunta the descripcionPregunta to set
     */
    public void setDescripcionPregunta(String descripcionPregunta) {
        this.descripcionPregunta = descripcionPregunta;
    }

    /**
     * @return the codigoPregunta
     */
    public String getCodigoPregunta() {
        return codigoPregunta;
    }

    /**
     * @param codigoPregunta the codigoPregunta to set
     */
    public void setCodigoPregunta(String codigoPregunta) {
        this.codigoPregunta = codigoPregunta;
    }

    /**
     * @return the descripcionAmbito
     */
    public String getDescripcionAmbito() {
        return descripcionAmbito;
    }

    /**
     * @param descripcionAmbito the descripcionAmbito to set
     */
    public void setDescripcionAmbito(String descripcionAmbito) {
        this.descripcionAmbito = descripcionAmbito;
    }

    /**
     * @param nombreAmbito the nombreAmbito to set
     */
    public void setNombreAmbito(String nombreAmbito) {
        this.nombreAmbito = nombreAmbito;
    }

}
