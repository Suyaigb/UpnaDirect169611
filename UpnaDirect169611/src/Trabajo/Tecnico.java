package Trabajo;

public class Tecnico {
    Oferta oferta1=new Oferta();
    Oferta oferta2=new Oferta();
    Oferta oferta3=new Oferta();
    
    public Tecnico(Oferta oferta1, Oferta oferta2, Oferta oferta3){
        this.oferta1=oferta1;
        this.oferta2=oferta2;
        this.oferta3=oferta3;
    }
    
    public Oferta seleccionarOfertaVentajosa(){
        if(oferta1.importe<oferta2.importe&&oferta1.importe<oferta3.importe){
            return oferta1;
        }else if(oferta2.importe<oferta1.importe&&oferta2.importe<oferta3.importe){
            return oferta2;
        }else if(oferta3.importe<oferta2.importe&&oferta3.importe<oferta1.importe){
            return oferta3;
        }else if(oferta1.importe==oferta2.importe){
            if(oferta1.comision>oferta2.comision){
                return oferta1;
            }else{
                return oferta2;
            }
        }else if(oferta1.importe==oferta3.importe){
            if(oferta1.comision>oferta3.comision){
                return oferta1;
            }else{
                return oferta3;
            }
        }else{
            if(oferta3.comision>oferta2.comision){
                return oferta3;
            }else{
                return oferta2;
            }
        }
    }
}
