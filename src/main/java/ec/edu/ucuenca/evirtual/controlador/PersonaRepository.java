/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ucuenca.evirtual.controlador;

import ec.edu.ucuenca.evirtual.modelado.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author juan.urgilesc
 */

public interface PersonaRepository extends JpaRepository<Persona, Long> {

  @Query(value = "Select p from Persona p where p.id=:id")
  List<Object[]> buscarporid(@Param("id") Long id);
  

}