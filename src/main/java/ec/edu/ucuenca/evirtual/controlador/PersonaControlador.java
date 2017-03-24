package ec.edu.ucuenca.evirtual.controlador;


import ec.edu.ucuenca.evirtual.modelado.Persona;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface PersonaControlador extends CrudRepository<Persona, Integer>, PersonaControladorCustom {
		  
}
