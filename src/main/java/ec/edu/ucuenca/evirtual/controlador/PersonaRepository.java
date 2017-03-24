/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ucuenca.evirtual.controlador;

import ec.edu.ucuenca.evirtual.modelado.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author juan.urgilesc
 */

public interface PersonaRepository extends JpaRepository<Persona, Long> {

  @Query(value = "SELECT * FROM PERSONAS WHERE id = ?1", nativeQuery = true)
  Persona buscarporid(String id);
}