package Trabajo;

public class Adasles extends Aseguradora{
    
    public Adasles(Cliente cliente, Bien bien){
        super(cliente,bien);
    }
    
    @Override
    public Oferta calcularOferta(){
        int importeS=2;
        if(bien.tipo=="VEHICULO"&&(cliente.annoNacimiento>2004 || cliente.annoNacimiento<1964)){
            importeS=6;
        }
        int comision;
        int importe=bien.valor*importeS/100;
        if(importe<=1000){
            comision= (int) (importe*0.01);
        }else{
            comision= (int) (importe*0.05);
        }
        
        return new Oferta("Linea indirecta",importe,comision);
    }
    
    
}
