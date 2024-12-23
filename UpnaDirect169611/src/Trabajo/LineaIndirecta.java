
package Trabajo;

public class LineaIndirecta extends Aseguradora{
    
    public LineaIndirecta(Cliente cliente, Bien bien){
        super(cliente,bien);
    }
    
    
    @Override
    public Oferta calcularOferta(){
        int importeS=3;
        if(bien.tipo=="VEHICULO"&&bien.valor<20000||bien.tipo=="VIVIENDA"&&bien.valor<150000){
            importeS=4;
        }
        if(bien.tipo=="VEHICULO" && bien.valor>=20000 && cliente.annoNacimiento<=1964){
            importeS=6;
        }
        int comision;
        int importe=bien.valor*importeS/100;
        if(importe<=1000){
            comision= (int) (importe*0.01);
        }else{
            comision= (int) (importe*0.04);
        }
        
        return new Oferta("Linea indirecta",importe,comision);
    }
    
}
