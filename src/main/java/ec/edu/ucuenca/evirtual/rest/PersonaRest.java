package ec.edu.ucuenca.evirtual.rest;

import ec.edu.ucuenca.evirtual.controlador.PersonaControlador;
import ec.edu.ucuenca.evirtual.controlador.PersonaRepository;
import java.util.List;

import ec.edu.ucuenca.evirtual.modelado.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class PersonaRest {
    
    @Autowired
    private PersonaControlador personaControlador;
    @Autowired
    private PersonaRepository personaRepository;
            
    @RequestMapping(value = "/crear", method = RequestMethod.PUT)
    @ResponseBody
    public String create(@RequestBody Persona entity) {
        try {
            System.out.println(entity.toString());
            personaControlador.save(entity);            
        }
        catch (Exception ex) {
            return "Error creando persona: " + ex.toString();
        }
        return "Persona creada! (id = " + entity.getEmail()+ ")";
    }
    
    @RequestMapping(value = "/actualizar", method = RequestMethod.PUT)
    @ResponseBody
    public String actualizar(@RequestBody Persona entity) {
        try {
            personaControlador.save(entity);
        }
        catch (Exception ex) {
            return "Error actualizando persona: " + ex.toString();
        }
        return "Persona actualizada! (id = " + entity.getEmail()+ ")";
    }
    
   /* @RequestMapping(value = "/eliminar", method = RequestMethod.DELETE)
    @ResponseBody
    public String eliminar(@RequestBody Persona entity) {
        try {
             personaControlador.delete(entity.getIdPersona());
        }
        catch (Exception ex) {
            return "Error eliminando persona: " + ex.toString();
        }
        return "Persona eliminada!: " + entity.getIdPersona();
    }
    
    @RequestMapping(value = "/buscar", method = RequestMethod.GET)
    @ResponseBody
    public Persona buscar(@RequestBody Persona entity) {
        try {
            return personaControlador.findOne(entity.getIdPersona());
        }
        catch (Exception ex) {
            return null;
        }
    }
    */
    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    @ResponseBody
    public Object listar(){
        try {
            return  personaRepository.buscarporid("0301490959");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    @RequestMapping("/custom")
    @ResponseBody
    public String custom(){
        try {
            return personaControlador.metodoPersonalizado();
        } catch (Exception e) {
            return "Error metodo personalizado";
        }
    }
    
    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "Test succesfully!";
    }

}
