/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.tecazuay.evaluacion.controlador;

import ec.edu.tecazuay.evaluacion.dto.Carrera;
import ec.edu.tecazuay.evaluacion.modelado.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author juan.urgilesc
 */

public interface EvaluacionRepository extends JpaRepository<Persona, Long> {

        @Query(value = "select distinct(carre_cod) as idCarrera ,carre_des as nombreCarrera from evaluaciones ", nativeQuery = true)
        List<Object[]> recuperarCarreras();

        @Query(value = "select distinct(prof_ced),prof_nom_ape from evaluaciones where carre_cod = :idCarrera ", nativeQuery = true)
        List<Object[]> docentesxCarrera(@Param("idCarrera") Integer idCarrera);

        @Query(value = "select distinct(ciclo_des) from evaluaciones where  prof_ced = :cedula ", nativeQuery = true)
        List<String> cicloxProfesor(@Param("cedula") String cedula);

        @Query(value = "select distinct(mate_cod),mate_des from evaluaciones where prof_ced =:cedula and ciclo_des = :ciclo  ", nativeQuery = true)
        List<Object[]> asignaturaxProfesorxciclo(@Param("cedula") String cedula, @Param("ciclo") String ciclo);

        @Query(value = "select a.ambito_nom, a.ambito_des, e.pregu_cod, p.pregunta_des, "
                        + " round(avg(e.preg_nota)*2,2) from evaluaciones e "
                        + " left join preguntas p on e.pregu_cod = p.pregunta_cod "
                        + " left join ambito a on p.ambito_cod = a.ambito_cod "
                        + " where e.mate_cod = :codAsignatura and  prof_ced = :cedula "
                        + " group by a.ambito_nom, a.ambito_des , e.pregu_cod, p.pregunta_des "
                        + " order by a.ambito_nom, a.ambito_des , e.pregu_cod, p.pregunta_des ", nativeQuery = true)
        List<Object[]> resumenEvaluacionxDocentexasignatura(@Param("cedula") String cedula,
                        @Param("codAsignatura") Integer codAsignatura);

        @Query(value = "select prof_ced,prof_nom_ape ,e.ciclo_des,e.mate_cod, e.mate_des,  "
                        + "round(avg(e.preg_nota)*2,2) from evaluaciones e  "
                        + "left join preguntas p on e.pregu_cod = p.pregunta_cod  "
                        + "left join ambito a on p.ambito_cod = a.ambito_cod  " + "where e.carre_cod = :idCarrera  "
                        + "group by prof_ced,prof_nom_ape,e.ciclo_des,e.mate_cod, e.mate_des  "
                        + "order by prof_nom_ape,e.ciclo_des,e.mate_cod, e.mate_des;  ", nativeQuery = true)
        List<Object[]> informeEvaluacionxCarrera(@Param("idCarrera") Integer idCarrera);
}