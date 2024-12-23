package Trabajo;

import org.junit.Test;
import static org.junit.Assert.*;

public class TecnicoTest {
    
    public TecnicoTest() {
    }

    @Test
    public void testSeleccionarOfertaVentajosa() {
        Cliente cliente=new Cliente("Pedro",2005,15000);
        Bien bien =new Bien("VEHICULO",30000);
        Aseguradora aseg=new Mafro(cliente, bien);
        Aseguradora aseg2=new Adasles(cliente, bien);
        Aseguradora aseg3=new LineaIndirecta(cliente, bien);
        Tecnico tecnico= new Tecnico(aseg.calcularOferta(),aseg2.calcularOferta(),aseg3.calcularOferta());
        tecnico.seleccionarOfertaVentajosa();
        String a=tecnico.seleccionarOfertaVentajosa().nombre+" | "+tecnico.seleccionarOfertaVentajosa().importe+" | "+tecnico.seleccionarOfertaVentajosa().comision;
        String b="Linea indirecta | 900 | 9";
        assertEquals(a,b);
        
    }
    
}
