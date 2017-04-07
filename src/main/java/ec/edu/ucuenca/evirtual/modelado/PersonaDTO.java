/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ucuenca.evirtual.modelado;

/**
 *
 * @author juan.urgilesc
 */
public class PersonaDTO {
    String PERSONA_ID ;
    String APELLIDOS;
    String NOMBRES;

    public String getPERSONA_ID() {
        return PERSONA_ID;
    }

    public void setPERSONA_ID(String PERSONA_ID) {
        this.PERSONA_ID = PERSONA_ID;
    }

    public String getAPELLIDOS() {
        return APELLIDOS;
    }

    public void setAPELLIDOS(String APELLIDOS) {
        this.APELLIDOS = APELLIDOS;
    }

    public String getNOMBRES() {
        return NOMBRES;
    }

    public void setNOMBRES(String NOMBRES) {
        this.NOMBRES = NOMBRES;
    }

    
}
