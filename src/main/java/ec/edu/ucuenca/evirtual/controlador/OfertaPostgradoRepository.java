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

public interface OfertaPostgradoRepository extends JpaRepository<Persona, Long> {

  @Query(value = "select  d.id AS ID_DEPENDENCIA\n" +
",d.DESCRIPCION AS DEPENDENCIA, \n" +
"cp.id as ID_CURSO_POSGRADO,\n" +
" cp.NOMBRE AS NOMBRE_POSGRADO,\n" +
"e.id as ID_EDICION,\n" +
"e.NOMBRE_EDICION, \n" +
"e.FECHA_APROBACION, \n" +
"ADD_MONTHS(e.FECHA_APROBACION, e.DURACION) AS FECHA_FIN, \n" +
"e.DURACION, \n" +
"cp.NIVFOR_ID, \n" +
"nf.NOMBRE as NOMBRE_NIVEL, \n" +
"nf.NIVEL, \n" +
"rs.NRO_RESOLUCION, \n" +
"rs.OBSERVACIONES, \n" +
"rs.ESTAACTIVO \n" +
"from postgrado.SGP_EDICIONES e \n" +
"left join postgrado.SGP_CURSOS_POSTGRADO cp on e.CURPOS_ID = cp.ID\n" +
"left join adminuc.NIVELES_FORMACION nf on cp.NIVFOR_ID = nf.id\n" +
"left join adminuc.DEPENDENCIAS d on cp.DEPENDENCIA_ID = d.ID\n" +
"left join postgrado.SGP_RESOLUCIONES_SENESCYT rs on cp.id = rs.CURPOS_ID\n" +
"where e.FECHA_APROBACION >= TO_DATE('2017-01-01',  'YYYY-MM-DD') and  e.FECHA_APROBACION < TO_DATE('2018-01-01',  'YYYY-MM-DD') and  nf.ESTAACTIVO = 'S' and d.id = :id", nativeQuery = true)
  List<Object[]> buscarporid(@Param("id") Long id);
  

}