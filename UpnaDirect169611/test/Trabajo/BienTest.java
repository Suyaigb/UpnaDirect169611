
package Trabajo;

import org.junit.Test;
import static org.junit.Assert.*;

public class BienTest {
    
    public BienTest() {
    }

    @Test
    public void bienValido() {
        new Bien("VEHICULO",45000);
    }
    
    @Test
    public void bienInvalido() {
        new Bien("VEHICULO",55000);
    }
    
}
