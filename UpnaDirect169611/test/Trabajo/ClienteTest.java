package Trabajo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class ClienteTest {
    
    public ClienteTest() {
    }

    @Test
    public void clienteAnnoNacimientoValido() {
        new Cliente("Pedro",2005,2000);
    }
    @Test
    public void clienteAnnoNacimientoInvalido() {
        new Cliente("Pedro",1890,2000);
    }
    
    
}
