package ec.edu.ucuenca.evirtual.rest;

import ec.edu.ucuenca.evirtual.controlador.PersonaControlador;
import ec.edu.ucuenca.evirtual.controlador.PersonaRepository;
import java.util.List;

import ec.edu.ucuenca.evirtual.modelado.Persona;
import ec.edu.ucuenca.evirtual.modelado.PersonaDTO;
import java.util.ArrayList;
import javax.ws.rs.core.Response;
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
    public List<Object> listar(){
        try {
            List<Object[]> p= personaRepository.buscartodos();
            List<Object> e = new ArrayList<>();
            for (Object[] object : p) {
                
                List<Object> e1 = personaRepository.nocursadas(object[0].toString());
                for (Object object1 : e1) {
                    List<Object> ne = new ArrayList<>();
                    ne.add(object[0].toString());
                    ne.add(object[1].toString());
                    ne.add(object[2].toString());
                    ne.add(object1);
                    
                    e.add(ne);
                }
                //personaRepository.nocursadas(p.toString());
            }
           return  e;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    


}
