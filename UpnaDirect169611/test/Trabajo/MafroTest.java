package Trabajo;

import org.junit.Test;
import static org.junit.Assert.*;

public class MafroTest {
    
    public MafroTest() {
    }

    @Test
    public void testCalcularOfertaValido() {
        Cliente cliente=new Cliente("Pedro",2005,2000);
        Bien bien =new Bien("VEHICULO",45000);
        Aseguradora aseg=new Mafro(cliente, bien);
        aseg.calcularOferta();
    }
    
    @Test
    public void testCalcularOfertaInvalido() {
        Cliente cliente=new Cliente("Pedro",1005,2000);
        Bien bien =new Bien("VEHICULO",45000);
        Aseguradora aseg=new Mafro(cliente, bien);
        aseg.calcularOferta();
    }
    
}
