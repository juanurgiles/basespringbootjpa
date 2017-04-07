/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ucuenca.evirtual.controlador;

import ec.edu.ucuenca.evirtual.modelado.Persona;
import ec.edu.ucuenca.evirtual.modelado.PersonaDTO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author juan.urgilesc
 */

public interface PersonaRepository extends JpaRepository<Persona, Long> {

  @Query(value = "SELECT * FROM PERSONAS WHERE id = ?1", nativeQuery = true)
  Object buscarporid(String id);
  
  @Query(value = "SELECT * FROM PERSONAS WHERE id = ?1", nativeQuery = true)
  List<Object> nocursadas(String id);
  
  @Query(value= "SELECT * FROM PERSONAS ",nativeQuery = true)
  List<Object[]> buscartodos();
}