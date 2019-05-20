package ec.edu.tecazuay.evaluacion.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.tecazuay.evaluacion.controlador.EvaluacionRepository;
import ec.edu.tecazuay.evaluacion.dto.Asignatura;
import ec.edu.tecazuay.evaluacion.dto.Carrera;
import ec.edu.tecazuay.evaluacion.dto.Ciclo;
import ec.edu.tecazuay.evaluacion.dto.Docente;
import ec.edu.tecazuay.evaluacion.dto.Reporte1;
import ec.edu.tecazuay.evaluacion.dto.Reporte2;

/**
 *
 * @author juanurgiles
 */
@RestController
@RequestMapping("/evaluacion")
public class EvaluacionRest {

    @Autowired
    private EvaluacionRepository repositorio;

    /**
     * Método utilizado para guardar una entidad mediante método post
     *
     * @param entidad
     * @return
     */
    @RequestMapping(value = "/carrera", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public List<Carrera> recuperarCarreras() {
        try {
            List<Object[]> lo = repositorio.recuperarCarreras();
            List<Carrera> lc = new ArrayList<>();
            for (Object[] var : lo) {
                Carrera c = new Carrera();
                c.setIdCarrera(var[0].toString());
                c.setNombreCarrera(var[1].toString());
                lc.add(c);
            }
            return lc;
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
    }

    /**
     * Método utilizado para guardar una entidad mediante método post
     *
     * @param entidad
     * @return
     */
    @RequestMapping(value = "/docentesxcarrera/{idCarrera}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public List<Docente> guardar(@PathVariable("idCarrera") String idCarrera) {
        try {
            List<Object[]> lo = repositorio.docentesxCarrera(Integer.parseInt(idCarrera));
            List<Docente> lc = new ArrayList<>();
            for (Object[] var : lo) {
                Docente c = new Docente();
                c.setIdDocente(var[0].toString());
                c.setNombreDocente(var[1].toString());
                lc.add(c);
            }
            return lc;
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
    }

    /**
     * Método utilizado para guardar una entidad mediante método post
     *
     * @param entidad
     * @return
     */
    @RequestMapping(value = "/informexcarrera/{idCarrera}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public List<Reporte2> informexcarrera(@PathVariable("idCarrera") String idCarrera) {
        try {
            List<Object[]> lo = repositorio.informeEvaluacionxCarrera(Integer.parseInt(idCarrera));
            List<Reporte2> lc = new ArrayList<>();
            for (Object[] var : lo) {
                Reporte2 c = new Reporte2();
                c.setCedulaProfesor(var[0].toString());
                c.setNombreProfesor(var[1].toString());
                c.setCiclo(var[2].toString());
                c.setCodigoMateria(var[3].toString());
                c.setDescripcionMateria(var[4].toString());
                c.setNota(var[5].toString());

                lc.add(c);
            }
            return lc;
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
    }

    /**
     * Método utilizado para guardar una entidad mediante método post
     *
     * @param entidad
     * @return
     */
    @RequestMapping(value = "/ciclosxdocente/{idDocente}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public List<Ciclo> ciclosxdocente(@PathVariable String idDocente) {
        try {
            List<String> lo = repositorio.cicloxProfesor(idDocente);
            List<Ciclo> lc = new ArrayList<>();
            for (String var : lo) {
                Ciclo c = new Ciclo();
                c.setIdCiclo(var);
                c.setNombreCiclo(var);
                lc.add(c);
            }
            return lc;
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
    }

    /**
     * Método utilizado para guardar una entidad mediante método post
     *
     * @param entidad
     * @return
     */
    @RequestMapping(value = "/asignaturaDocenteCiclo/{idDocente}/{idCiclo}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public List<Asignatura> asignaturaDocenteCiclo(@PathVariable String idDocente, @PathVariable String idCiclo) {
        try {
            List<Object[]> lo = repositorio.asignaturaxProfesorxciclo(idDocente, idCiclo);
            List<Asignatura> lc = new ArrayList<>();
            for (Object[] var : lo) {
                Asignatura c = new Asignatura();
                c.setIdAsignatura(var[0].toString());
                c.setNombreAsignatura(var[1].toString());
                lc.add(c);
            }
            return lc;
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
    }

    /**
     * Método utilizado para guardar una entidad mediante método post
     *
     * @param entidad
     * @return
     */
    @RequestMapping(value = "/evaluacionProfesorAsignatura/{idDocente}/{idAsignatura}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public List<Reporte1> resumenEvaluacionxProfesorxasignatura(@PathVariable String idDocente,
            @PathVariable Integer idAsignatura) {
        try {
            List<Object[]> lo = repositorio.resumenEvaluacionxDocentexasignatura(idDocente, idAsignatura);
            List<Reporte1> lc = new ArrayList<>();
            for (Object[] var : lo) {
                Reporte1 c = new Reporte1();
                c.setNombreAmbito(var[0].toString());
                c.setDescripcionAmbito(var[1].toString());
                c.setCodigoPregunta(var[2].toString());
                c.setDescripcionPregunta(var[3].toString());
                c.setNotaPonderada(var[4].toString());

                lc.add(c);
            }
            return lc;
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
    }
}
