/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ucuenca.evirtual.rest;

import ec.edu.ucuenca.evirtual.modelado.Persona;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class PersonaRestTest {
    
    public PersonaRestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class PersonaRest.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Persona entity = null;
        PersonaRest instance = new PersonaRest();
        String expResult = "Error creando persona: java.lang.NullPointerException";
        String result = instance.create(entity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class PersonaRest.
     */
    @Test
    public void testActualizar_Persona() {
        System.out.println("actualizar");
        Persona entity = null;
        PersonaRest instance = new PersonaRest();
        String expResult = "Error actualizando persona: java.lang.NullPointerException";
        String result = instance.actualizar(entity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class PersonaRest.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        Persona entity = null;
        PersonaRest instance = new PersonaRest();
        String expResult = "Error eliminando persona: java.lang.NullPointerException";
       // String result = instance.eliminar(entity);
     //   assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscar method, of class PersonaRest.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Persona entity = null;
        PersonaRest instance = new PersonaRest();
        Persona expResult = null;
      //  Persona result = instance.buscar(entity);
       // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }    

    /**
     * Test of test method, of class PersonaRest.
     */
    @Test
    public void testTest() {
        System.out.println("test");
        PersonaRest instance = new PersonaRest();
        String expResult = "Test succesfully!";
        String result = instance.test();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
