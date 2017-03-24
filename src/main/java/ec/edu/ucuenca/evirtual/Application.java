package ec.edu.ucuenca.evirtual;


import ec.edu.ucuenca.evirtual.controlador.PersonaControlador;
import ec.edu.ucuenca.evirtual.controlador.PersonaControladorImpl;
import ec.edu.ucuenca.evirtual.modelado.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    
  
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}      
        
}
