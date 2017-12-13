package ec.edu.ucuenca.evirtual.rest;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ec.edu.ucuenca.evirtual.controlador.OfertaPostgradoRepository;
import ec.edu.ucuenca.evirtual.controlador.PersonaRepository;
import ec.edu.ucuenca.evirtual.dto.OfertaPostgrado;
import ec.edu.ucuenca.evirtual.modelado.Persona;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import springfox.documentation.annotations.ApiIgnore;

/**
 *
 * @author juanurgiles
 */
@RestController
@RequestMapping("/persona")
public class PersonaRest {

    @Autowired
    private PersonaRepository repositorio;

    /**
     * Método utilizado para guardar una entidad mediante método post
     *
     * @param entidad
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public Persona guardar(@RequestBody Persona entidad) {
        try {

            return repositorio.save(entidad);
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
    }

    /**
     * Métdo utilizado para recuperar una entidad con metodo GET
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public Persona crear(@PathVariable Long id) {
        try {

            return repositorio.findOne(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
    }

    /**
     * metodo utilizado para busqueda (Mejora en paginación Ajax)
     *
     * @param pageable
     * @return
     */
    @ApiOperation(value = "Find partners")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", dataType = "integer", paramType = "query", value = "Results page you want to retrieve (0..N)")
        ,
            @ApiImplicitParam(name = "size", dataType = "integer", paramType = "query", value = "Number of records per page.")
        ,
            @ApiImplicitParam(name = "sort", allowMultiple = true, dataType = "string", paramType = "query", value = "Sorting criteria in the format: property(,asc|desc). "
                + "Default sort order is ascending. " + "Multiple sort criteria are supported.")})
    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    /**
     * Returns a {@link Page} of entities meeting the paging restriction
     * provided in the {@code Pageable} object.
     *
     * @param pageable
     * @return a page of entities
     */
    public Page<Persona> buscar(@ApiIgnore final Pageable pageable) {
        try {

            return repositorio.findAll(pageable);
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
    }

    /**
     * Método utilizado para borrar un item
     *
     * @param id
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    @CrossOrigin
    public void borrar(@PathVariable Long id) {
        try {
            repositorio.delete(id);
            // return restInsitucionExternaRepository.findOne(id);
        } catch (Exception e) {
            e.printStackTrace();
            // return null;

        }
    }

}
