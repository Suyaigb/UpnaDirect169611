package Trabajo;

public class Mafro extends Aseguradora{
    
    public Mafro(Cliente cliente, Bien bien){
        super(cliente,bien);
    }
    
    @Override
    public Oferta calcularOferta(){
        int importeS=3;
        if(bien.tipo=="VEHICULO"&&cliente.annoNacimiento>2004){
            importeS=5;
        }
        if(bien.tipo=="VIVIENDA" && bien.valor>=200000 && cliente.salario<20000){
            importeS=2;
        }
        int comision;
        int importe=bien.valor*importeS/100;
        if(importe<=1000){
            comision= (int) (importe*0.01);
        }else{
            comision= (int) (importe*0.03);
        }
        
        return new Oferta("Linea indirecta",importe,comision);
    }
    
    
}
